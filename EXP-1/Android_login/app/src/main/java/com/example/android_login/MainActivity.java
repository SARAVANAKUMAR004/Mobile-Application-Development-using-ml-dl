package com.example.android_login;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button _btnReg, _btnLogin;
    EditText _txtName, _txtAdd, _txtEmail, _txtUser, _txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _btnLogin = findViewById(R.id.btnLogin);
        _btnReg = findViewById(R.id.btnReg);
        _txtName = findViewById(R.id.txtName);
        _txtAdd = findViewById(R.id.txtAdd);
        _txtEmail = findViewById(R.id.txtEmail);
        _txtUser = findViewById(R.id.txtUser);
        _txtPass = findViewById(R.id.txtPass);

        _btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = _txtName.getText().toString();
                String address = _txtAdd.getText().toString();
                String email = _txtEmail.getText().toString();
                String username = _txtUser.getText().toString();
                String password = _txtPass.getText().toString();
                String type = "reg";

                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type, name, address, email, username, password);
            }
        });

        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
    }
}
