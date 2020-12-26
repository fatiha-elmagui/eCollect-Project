package com.example.egreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.egreen.UserDB.MyDatabase;
import com.example.egreen.UserDB.Sensiblisation;
import com.example.egreen.UserDB.User;
import com.example.egreen.UserDB.createcount;

import java.util.ArrayList;
import java.util.List;
import static com.example.egreen.UserDB.Sensiblisation.usermap;

public class MainActivity extends AppCompatActivity {
    static User user = new User();
    static MyDatabase mydatabase;
    Button connecter;
    EditText login;
    EditText pass;
    TextView Text;
    List<User> usr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connecter = (Button) this.findViewById(R.id.buttonseconnect);
        login = (EditText) this.findViewById(R.id.etlogin);
        pass = (EditText) this.findViewById(R.id.etpassword);
        Text = (TextView) this.findViewById(R.id.tvnewcount);
        mydatabase = Room.databaseBuilder(getApplicationContext() , MyDatabase.class , "user_bd").allowMainThreadQueries().build();

        connecter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myClick(v);
            }
        });
        Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myClick(v);
            }
        });

    }
    private void myClick(View v) {

        user.login = login.getText().toString();
        user.pass = pass.getText().toString();

        if (!(login.getText().toString()).matches("")) {
            usr = MainActivity.mydatabase.myDao().getUser(login.getText().toString());

            switch (v.getId()) {
                case R.id.tvnewcount:
                    startActivity(new Intent(MainActivity.this, createcount.class));
//                    finish();
                    break;

                case R.id.buttonseconnect:
                    if (usr.size() != 0) {
                        if (usr.get(0).pass.contentEquals(pass.getText().toString()) ) {
                            usermap=usr.get(0);
                            Intent intent = new Intent(this, Sensiblisation.class);
                            Toast.makeText(getApplicationContext(), "welcome "+login.getText().toString(), Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            //finish();
                            break;
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Mot de passe incorrect",
                                    Toast.LENGTH_SHORT).show(); break;
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Compte non existant", Toast.LENGTH_SHORT).show();
                        break; }}
        }}


}
