package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DASHBOARD extends AppCompatActivity {

    private Button profilebtn,categorybtn,cartbtn,myodersbtn,logoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        profilebtn=(Button) findViewById(R.id.btn1);
        categorybtn=(Button) findViewById(R.id.btn2);
        cartbtn=(Button) findViewById(R.id.btn3);
        myodersbtn=(Button) findViewById(R.id.btn4);
        logoutbtn=(Button) findViewById(R.id.btn5);


        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(DASHBOARD.this,Profile.class);
                startActivity(intent);
            }
        });

        cartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(DASHBOARD.this,cart.class);
                startActivity(intent);
            }
        });
    }
}