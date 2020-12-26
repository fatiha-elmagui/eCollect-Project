package com.example.egreen.UserDB;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.egreen.Entreprise.notification;
import com.example.egreen.MainActivity;
import com.example.egreen.R;

import java.util.ArrayList;

import static com.example.egreen.UserDB.Sensiblisation.usermap;

public class declaration extends AppCompatActivity {
    CheckBox checkBox,checkBox2,checkBox3,checkBox4,checkBox5;
    TextView resultat;
    static MyDatabase mydatabase;
    public static ArrayList<String> mresult=new ArrayList<>();
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declaration);
        checkBox=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        checkBox4=findViewById(R.id.checkBox4);
        checkBox5=findViewById(R.id.checkBox5);
        resultat=findViewById(R.id.resultat);
        send=findViewById(R.id.envoyer);
      //  mydatabase = Room.databaseBuilder(getApplicationContext() , MyDatabase.class , "user_bd").allowMainThreadQueries().build();

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked())
                    mresult.add("carton");
                else mresult.remove("carton");
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox2.isChecked())
                    mresult.add("metal");
                else mresult.remove("metal");
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox3.isChecked())
                    mresult.add("verre");
                else mresult.remove("verre");
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox4.isChecked())
                    mresult.add("plastique");
                else mresult.remove("plastique");

            }
        });
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox5.isChecked())
                    mresult.add("Canette");
                else mresult.remove("Canette");

            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*   StringBuilder stringBuilder=new StringBuilder();
                for (String s:mresult)
                    stringBuilder.append(s).append("\n");
                resultat.setText(stringBuilder.toString());
                resultat.setEnabled(false);*/
             //   resultat.setText(usermap.getAdresse()+"\n");
                //resultat.setText(mydatabase.myDao().getUsers().get(mydatabase.myDao().getUsers().size()-1).getPhone()+"\n");



            }
        });

    }

}
