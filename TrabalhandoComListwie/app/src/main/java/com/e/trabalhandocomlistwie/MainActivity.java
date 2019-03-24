package com.e.trabalhandocomlistwie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button adicionarCarinho;
    private EditText nome;
    private EditText idade;
    private TextView contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //declarando as variaveis
        adicionarCarinho = (Button) findViewById(R.id.ID_ADICIONARCARINHO);
        nome = (EditText) findViewById(R.id.ID_Nome);
        idade = (EditText) findViewById(R.id.ID_Idade);
        contador = (TextView) findViewById(R.id.ID_CONTADOR);
        //trabalhando com a listview
        adicionarCarinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
