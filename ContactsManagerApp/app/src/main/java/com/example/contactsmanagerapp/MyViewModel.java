package com.example.contactsmanagerapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel extends AndroidViewModel {

    private Repository repository;
    private LiveData<List<Contacts>> allContacts;
    public MyViewModel(@NonNull Application application) {
        super(application);
        repository=new Repository(application);
    }

    public LiveData<List<Contacts>> getAllContacts(){
        allContacts= repository.getAllContacts();
        return allContacts;

    }

    public void addNewContacts(Contacts contacts){
        repository.addContacts(contacts);

    }
    public void deleteContacts(Contacts contacts){
        repository.deleteContact(contacts);
    }
}
