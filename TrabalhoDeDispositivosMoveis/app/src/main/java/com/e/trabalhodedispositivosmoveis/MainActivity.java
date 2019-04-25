package com.e.trabalhodedispositivosmoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nomeDoProduto;
    private EditText codigoDoProduto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeDoProduto = (EditText) findViewById(R.id.NomeDoProdutoeditText);
        codigoDoProduto =(EditText) findViewById(R.id.CodigoDoProdutoeditText2);

    }
}
