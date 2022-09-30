package com.example.trabalhohello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView nomeTela;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nomeTela = findViewById(R.id.textView4);
        Intent it = getIntent();
        nome = (it.getStringExtra("nome"));

        nomeTela.setText("Olá " + nome + ".\nTudo Bem ? ");
    }
}