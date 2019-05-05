package com.e.exemplo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private CheckBox Box1;
    private CheckBox Box2;
    private CheckBox Box3;
    private CheckBox Box4;
    private Button   exibir;
    private Button   desmarcar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
      Box1 =(CheckBox) findViewById(R.id.checkBox);
      Box2 =(CheckBox) findViewById(R.id.checkBox2);
      Box3 =(CheckBox) findViewById(R.id.checkBox3);
      Box4 = (CheckBox) findViewById(R.id.checkBox4);
      exibir = (Button) findViewById(R.id.Exibir);
      desmarcar = (Button)findViewById(R.id.Desmarcar);

    }
}
