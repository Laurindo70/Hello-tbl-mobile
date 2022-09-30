package com.example.trabalhohello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);
    }

    public void Salvar(View view){
        Intent ola = new Intent(getApplicationContext(), MainActivity2.class);
        ola.putExtra("nome", nome.getText().toString());
        startActivity(ola);
    }
}