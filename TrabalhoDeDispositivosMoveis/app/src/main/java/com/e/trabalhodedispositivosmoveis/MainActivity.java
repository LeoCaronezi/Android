package com.e.trabalhodedispositivosmoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nomeDoProduto;
    private EditText codigoDoProduto;
    private Button comprar;
    private Button vender;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeDoProduto = (EditText) findViewById(R.id.NomeDoProdutoeditText);
        codigoDoProduto =(EditText) findViewById(R.id.CodigoDoProdutoeditText2);
        comprar = (Button) findViewById(R.id.Comprabutton);
        vender = (Button) findViewById(R.id.Venderbutton2);


        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        vender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
