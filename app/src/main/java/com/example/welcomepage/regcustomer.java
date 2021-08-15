package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class regcustomer extends AppCompatActivity {

    private Button CreateAccountButton;
    private EditText InputName,InputEmail,InputPhoneNumber,InputUsername,InputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcustomer);

        CreateAccountButton =(Button) findViewById(R.id.cusregbutton);
        InputName=(EditText) findViewById(R.id.your_name);
        InputEmail=(EditText) findViewById(R.id.email);
        InputPhoneNumber=(EditText)findViewById(R.id.phonenumber);
        InputUsername =(EditText)findViewById(R.id.usernamecreate);
        InputPassword=(EditText) findViewById(R.id.passwordcreate);
    }
}