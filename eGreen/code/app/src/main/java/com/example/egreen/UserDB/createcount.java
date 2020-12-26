package com.example.egreen.UserDB;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.egreen.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class createcount extends AppCompatActivity {
    EditText addlogin;
    EditText addpassword;
    EditText addemail,phone;
    EditText EngeristreR;
    static User newuser=new User();
    static MyDatabase mydatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_createcount);
        addlogin=findViewById(R.id.etadduserlogin);
        addpassword=findViewById(R.id.etadduserpassword);
        addemail= findViewById(R.id.etadduseremail);
        phone= findViewById(R.id.phone);

        createcount.mydatabase = Room.databaseBuilder(getApplicationContext() , MyDatabase.class , "user_bd").allowMainThreadQueries().build();

//        newuser.setLogin(addlogin.getText().toString());
//        newuser.setPass(addpassword.getText().toString());
    }

    public void onClick(View view) {

        newuser.setLogin(addlogin.getText().toString());
        newuser.setPass(addpassword.getText().toString());
        newuser.setAdresse(addemail.getText().toString());
        newuser.setPhone(phone.getText().toString());
        mydatabase.myDao().adduser(newuser);
        Toast.makeText(getApplicationContext(), "Votre compte est enrgistrer", Toast.LENGTH_SHORT).show();



    }

}