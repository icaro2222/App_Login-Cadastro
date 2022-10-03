package com.example.carteiradeads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText senha = (EditText) findViewById(R.id.editTextTextPassword);
        Button button_novo_cadastro = (Button) findViewById(R.id.btn_cadastro);

        button_novo_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teste = new Intent(LoginActivity.this, CadastrarActivity.class);
                if(email.getText().toString().isEmpty()){
                    email.setError("Este Campo deve ser preenchido!");
                }else if(senha.getText().toString().isEmpty()){
                    senha.setError("Este Campo deve ser preenchido!");
                }else{
                    startActivity(teste);
                }
            }
        });

    }
}