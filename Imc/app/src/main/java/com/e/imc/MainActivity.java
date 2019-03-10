package com.e.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     private EditText altura;
     private EditText peso;
     private Button calcular ;
     private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       altura = (EditText) findViewById(R.id.ID_Altura);
       peso = (EditText) findViewById(R.id.ID_Peso);
       resultado = (EditText) findViewById(R.id.id_Resultado);
       calcular  = (Button) findViewById(R.id.id_Calcular);

       calcular.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double alt =
           }
       });
    }
}
