package com.example.databindingapp;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {
    String name;
    String Email;

    public Person(String name, String email) {
        this.name = name;
        Email = email;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Person() {
    }
}
