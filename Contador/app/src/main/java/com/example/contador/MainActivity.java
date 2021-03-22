package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer contador;

    private void atualizaContador() {
        TextView tvCont = (TextView)findViewById(R.id.textViewContador);
        tvCont.setText(contador.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;


        Button btnMais = (Button)findViewById(R.id.buttonMais);
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador += 1;
                atualizaContador();
            }
        });

    }
}