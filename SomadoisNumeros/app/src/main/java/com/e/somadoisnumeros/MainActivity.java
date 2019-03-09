package com.e.somadoisnumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 // inicio do campo de declaração de atributos
    private EditText num1;
    private EditText num2;
    private Button   somar;
    private TextView resultado;
//fim do campo de declaração de atributos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Espaço onde eu  vinculo os atributos aos campos criado na tela.
         num1 = (EditText)findViewById(R.id.ID_NUM1editText3);
         num2 = (EditText)findViewById(R.id.ID_NUM2editText4);
         resultado = (TextView) findViewById(R.id.ID_RESULTADOtextView3);
         somar = (Button) findViewById(R.id.ID_SOMARbutton);

      // criando local aonde sera feito o calculo e  recibemnto as informacoes enviadas pelo usaurio
        // local onde os eventos são tratados
        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // crio uma variavel para receber o texto que sera convertido para uma numero real.
                  double numero1 = Double.parseDouble(num1.getText().toString());
                // crio uma variavel para receber o texto que sera convertido para uma numero real.
                 double numero2 = Double.parseDouble(num2.getText().toString());
                // crio a variavel para receber a soma de dois numemor recebido anteriormente.
                 double result = numero1 + numero2;
               /* chamo o campo resultado para retorna uma informacao que ficou salva na variavel
                 result */
            //     resultado.setText(Double.toString(result));
                resultado.setText(" " + result);

            }
        });
    }
}
