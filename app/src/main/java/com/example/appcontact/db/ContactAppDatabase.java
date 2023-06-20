package com.example.appcontact.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.appcontact.db.entity.Contact;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactAppDatabase extends RoomDatabase {
     //linking the dao with our Database
    public abstract ContactDAO getContactDAO();

}
