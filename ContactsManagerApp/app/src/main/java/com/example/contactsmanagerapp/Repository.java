package com.example.contactsmanagerapp;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private final ContactDAO contactDAO;

    ExecutorService executer;

    Handler handler;

    public Repository(Application application) {

        ContactDatabase contactDatabase=ContactDatabase.getInstance(application);
        this.contactDAO=contactDatabase.getContactDAO();
        executer= Executors.newSingleThreadExecutor();
        handler=new Handler(Looper.getMainLooper());
    }

    public void addContacts(Contacts contacts){

        executer.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.insert(contacts);
            }
        });

    }


    public void deleteContact(Contacts contacts){

        executer.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.delete(contacts);
            }
        });
    }




    public LiveData<List<Contacts>> getAllContacts(){

        return contactDAO.getAllContacts();


    }

}
