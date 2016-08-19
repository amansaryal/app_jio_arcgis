package com.example.android.app_jio_arcgis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void onClick(){
        Toast.makeText(this,"logging in...",Toast.LENGTH_SHORT).show();
    }
}
