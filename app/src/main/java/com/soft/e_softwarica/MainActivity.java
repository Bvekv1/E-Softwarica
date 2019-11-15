
package com.soft.e_softwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUserName, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etUserName.getText().toString().equals("bibek") && etPassword.getText().toString().equals("bibek")){
                    Intent intent = new Intent(MainActivity.this, DashBoard.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"Loading",Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,"Invalid User Name Or Password",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

