package com.e.trabalhandocomlistwie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button adicionarCarinho;
    private EditText nome;
    private EditText idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adicionarCarinho = (Button) findViewById(R.id.button);
        nome = (EditText) findViewById(R.id.);
    }
}
