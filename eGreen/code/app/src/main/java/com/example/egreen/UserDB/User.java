package com.example.egreen.UserDB;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class User {
        @PrimaryKey
        @NonNull
        public String login;
        @ColumnInfo(name = "user_pass")
        public String pass;
        public String Adresse;
        public  String phone;
    @NonNull
    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }


    public void setLogin(@NonNull String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}



