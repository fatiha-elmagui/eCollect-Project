package com.example.egreen.Entreprise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.egreen.R;
import com.example.egreen.UserDB.MyDatabase;
import com.example.egreen.UserDB.createcount;

import static com.example.egreen.UserDB.declaration.mresult;
import static com.example.egreen.UserDB.Sensiblisation.usermap;
public class notification extends AppCompatActivity {
    Button nouvellenotification,showadress;
    TextView affiche,afficheadress;
    static MyDatabase mydatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        nouvellenotification=findViewById(R.id.affichenotification);
        affiche=findViewById(R.id.notification);
        afficheadress=findViewById(R.id.afficheadress);
        showadress=findViewById(R.id.showadress);
        mydatabase = Room.databaseBuilder(getApplicationContext() , MyDatabase.class , "user_bd").allowMainThreadQueries().build();

        nouvellenotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder=new StringBuilder();
                for (String s:mresult) {
                    stringBuilder.append(s).append("\n");
                }
                affiche.setText(stringBuilder.toString());
                affiche.setEnabled(false);

            }
        });
        showadress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficheadress.setText("Adresse : "+usermap.getAdresse()+"\nTéléphone : "+usermap.getPhone());
                //afficheadress.setText(usermap.getPhone()+"\n");

            }
        });



    }


    public void Supprimer(View view) {
        affiche.setText("");
        mresult.clear();
    }
}
