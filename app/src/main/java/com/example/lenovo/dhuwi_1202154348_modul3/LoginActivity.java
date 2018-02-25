package com.example.lenovo.dhuwi_1202154348_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText input_user, input_pass;
    //Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        input_user = findViewById(R.id.username);
        input_pass= findViewById(R.id.password);
        //button = findViewById(R.id.login_button);
    }


    public  void LOGIN (View view){
        if(input_user.getText().toString().equals("EAD")&&input_pass.getText().toString().equals("MOBILE")){
            //Menampilkan toast
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
            //Memulai activity baru
            startActivity(new Intent(LoginActivity.this, ListjenisAir.class));
            //Menambahkan transisi antar activity
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            //Menutup activity saat ini
            finish();
        }else{
            //Menampilkan toast ketika username atau password salah
            Toast.makeText(this, "username or password is incorrect!", Toast.LENGTH_SHORT).show();
            //Menghapus text saat ini pada field username dan password
            input_user.setText(null); input_pass.setText(null);
        }
    }
}
