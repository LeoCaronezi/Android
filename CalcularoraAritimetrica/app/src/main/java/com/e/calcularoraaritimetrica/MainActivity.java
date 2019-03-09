package com.e.calcularoraaritimetrica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private EditText  num1;
     private EditText  num2;
     private Button    soma;
     private Button   divisao;
     private Button   subtracao;
     private Button   mutiplicacao;
     private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById (R.id.ID_NUM1editText);
        num2 = (EditText) findViewById (R.id.ID_NUM2editText2);
        soma = (Button)   findViewById (R.id.ID_SOMAbutton);
        subtracao = (Button) findViewById (R.id.ID_SOMAbutton);
        mutiplicacao =(Button) findViewById((R.id.ID_MUTIPLICACAObutton3);
        divisao = (Button) findViewById(R.id.ID_DIVISAObutton4);
        resultado = (TextView) findViewById(R.id.ID_RESULTADOtextView3);


        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

         subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

          mutiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

         divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
}
