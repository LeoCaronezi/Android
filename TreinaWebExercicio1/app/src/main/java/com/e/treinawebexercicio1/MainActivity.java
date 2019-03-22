package com.e.treinawebexercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button novatela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novatela = (Button) findViewById(R.id.ID_NovaTela);
        novatela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tela2.class);
                startActivity(intent);
            }
        });
     //  Log.i("metodo onCreat");
    }

  /*  @Override
    protected void onStart() {
        super.onStart();
        Log.i("ESTADO_ACTIVIT , 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Estado 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Estado numero 3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("estado numero 4");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("estado numero 5"); */
    }
