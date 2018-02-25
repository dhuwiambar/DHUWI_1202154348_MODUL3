package com.example.lenovo.dhuwi_1202154348_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    EditText userinput, passinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this, "AMBAR_1202154348", Toast.LENGTH_LONG).show();
        Thread thread = new Thread() {
            public void run () {
                try {
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                    finish();
                }

            }
        };
        thread.start();
    }
}