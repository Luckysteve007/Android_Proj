package com.example.contactsmanagerapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "contacts_table")
public class Contacts {

    @ColumnInfo(name="contact_id")
    private int id;
    @ColumnInfo(name="contact_name")
    private String name;
    @ColumnInfo(name = "contact_mail")
    private String email;

    public Contacts(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Contacts() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
