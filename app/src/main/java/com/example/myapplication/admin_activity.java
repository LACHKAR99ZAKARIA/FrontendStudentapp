package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class admin_activity extends AppCompatActivity {
    Button btn = (Button)findViewById(R.id.button1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
    }

    btn

    btn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent i = new Intent(this, acces_activity.class);
            startActivity(i);
        }
    })

    Button btn1 = (Button)findViewById(R.id.button2);
    btn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(this, pas_acces_Activity.class);
            startActivity(i);
        }
    })
    Button btn2 = (Button)findViewById(R.id.button3);
    btn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(this, liste_Activity.class);
            startActivity(i);
        }
    })

}
