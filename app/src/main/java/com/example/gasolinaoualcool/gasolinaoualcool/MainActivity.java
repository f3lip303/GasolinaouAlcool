package com.example.gasolinaoualcool.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonVerificar;
    private EditText editTextGasolina;
    private EditText editTextAlcool;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVerificar = (Button) findViewById(R.id.buttonVerificar);
        editTextAlcool = (EditText) findViewById(R.id.precoAlcool);
        editTextGasolina = (EditText) findViewById(R.id.precoGasolina);
        textViewResultado = (TextView) findViewById(R.id.stringResultado);
    }

    public void click(View v){
        String gasolina,alcool;
        gasolina = editTextGasolina.getText().toString();
        alcool = editTextAlcool.getText().toString();
        if(alcool.isEmpty() || gasolina.isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Obrigatório",Toast.LENGTH_LONG).show();
        }else{
            Double valorAlcool = Double.parseDouble(alcool);
            Double valorGasolina = Double.parseDouble(gasolina);

            double resultado = valorAlcool/valorGasolina;

            if(resultado >= 0.7){
                textViewResultado.setText("É melhor usar Gasolina");
            }else{
                textViewResultado.setText("É melhor usar Alcool");
            }
        }
    }
}