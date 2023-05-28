package com.uts_mufhlihfurqonnudinfahri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    public static final String NAMA = "nama";
    public static final String NOMOR = "nomor";
    public static final String EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void daftar(View view) {
        EditText nama = findViewById(R.id.nama);
        EditText nomor = findViewById(R.id.nomor);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        EditText konfir = findViewById(R.id.konfir);

        String Nama = nama.getText().toString();
        String Nomor = nomor.getText().toString();
        String Email = email.getText().toString();
        String Password = password.getText().toString();
        String Konfir = konfir.getText().toString();

        if (Nama.isEmpty()){
            Toast.makeText(this,"Mohon Masukan Nama Lengkap", Toast.LENGTH_SHORT).show();
        }else if (Nomor.isEmpty()){
            Toast.makeText(this,"Mohon Masukan Nomor Handphone", Toast.LENGTH_SHORT).show();
        }else if (Email.isEmpty()){
            Toast.makeText(this,"Mohon Masukan Email Anda", Toast.LENGTH_SHORT).show();
        }else if (Password.isEmpty()){
            Toast.makeText(this,"Mohon Masukan Password Anda", Toast.LENGTH_SHORT).show();
        }else if (!Konfir.equals(Password)){
            Toast.makeText(this,"Mohon Masukan Password yang sesuai", Toast.LENGTH_SHORT).show();
        }else if(!Nama.isEmpty() & !Nomor.isEmpty() & !Email.isEmpty() & !Password.isEmpty() & Konfir.equals(Password) ){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(NAMA, Nama);
            intent.putExtra(NOMOR, Nomor);
            intent.putExtra(EMAIL, Email);
            startActivity(intent);
        }
    }
}