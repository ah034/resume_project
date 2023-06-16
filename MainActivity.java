package com.example.movie1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginText,passwordText;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginText=findViewById(R.id.login);
        passwordText=findViewById(R.id.password);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=loginText.getText().toString();
                String password=passwordText.getText().toString();

                if((username.equals("user") && password.equals("123456"))||(username.equals("Adithya") && password.equals("adi"))||(username.equals("Yashudev") && password.equals("yashudev"))||(username.equals("Ashuthosh") && password.equals("ashuthosh")))
                {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid Username Or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}