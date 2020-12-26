package com.example.egreen.UserDB;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.egreen.R;

import java.util.ArrayList;
import java.util.List;

public class Sensiblisation extends AppCompatActivity {

    static MyDatabase mydatabase;
    public static User usermap=new User();
    List<User> users=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensiblisation);
        mydatabase = Room.databaseBuilder(getApplicationContext() , MyDatabase.class , "user_bd").allowMainThreadQueries().build();
        users=mydatabase.myDao().getUsers();
       // usermap=users.get(users.size()-1);
    }

    public void onClick(View view) {
        startActivity(new Intent(this,declaration.class));
    }

    public void myClickguideTri(View view) {
        startActivity(new Intent(this,GideTri.class));
    }
}
