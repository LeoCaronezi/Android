package com.e.aplicativodeimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText altura;
    private EditText peso;
    private Button  calcular;
    private EditText resultadoImc;
    private EditText statusimc;
    private Button limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura = (EditText) findViewById(R.id.Altura);
        calcular = (Button) findViewById(R.id.Calcular);
        limpar = (Button) findViewById(R.id.Limpar);
        peso = (EditText) findViewById(R.id.Peso);
        statusimc = (EditText) findViewById(R.id.ApresentaSituacao); 
        resultadoImc = (EditText) findViewById(R.id.ResultadoImc);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pesos, alturas,imc;
                pesos = Double.parseDouble(peso.getText().toString());
                alturas =Double.parseDouble(altura.getText().toString());
                imc = (pesos)/ (alturas*alturas);
               // resultadoImc.setText(imc);
                
                
                if (imc <=18.5){
                 statusimc.setText("voce esta abaixo do peso.");
                }
                else if (imc > 18.5 && imc <25){
                    statusimc.setText("voce esta no peso ideal.");
                }
                else if (imc> 25 && imc<30){
                    statusimc.setText("voce esta acima ideal.");
                }
                else if (imc >30){
                    statusimc.setText("favor ir no medico com urgencia .");
                }
            }
        });
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
