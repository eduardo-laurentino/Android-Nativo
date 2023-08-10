package com.eduardo.lcoolougasolina;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText precoAlcool, precoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcool);
        precoGasolina = findViewById(R.id.precoGasolina);
        textResultado = findViewById(R.id.textResultado);
    }
    public void calcularPreco(View view){
        //Recuperar valores digitados
        String alcoolPreco = precoAlcool.getText().toString();
        String gasolinaPreco = precoGasolina.getText().toString();

        //Validar campos digitados
        if (validarCampos(alcoolPreco, gasolinaPreco) == true){
            //Convertendo string para números
            Double valorAlcool = Double.parseDouble(alcoolPreco);
            Double valorGasolina = Double.parseDouble(gasolinaPreco);
            Double res = valorAlcool/valorGasolina;
            if (res >= 0.7){
                textResultado.setText("Melhor usar Gasolina!");
                precoAlcool.setText("");
                precoGasolina.setText("");
            }else{
                textResultado.setText("Melhor usar Álcool!");
                precoAlcool.setText("");
                precoGasolina.setText("");
            }
        }else {
            textResultado.setText("Preencha os preços primeiro!");
        }
    }
    public Boolean validarCampos(String alcoolPreco, String gasolinaPreco){
        if (alcoolPreco == null || alcoolPreco.equals("")){
            return false;
        }else if (gasolinaPreco == null || gasolinaPreco.equals("")){
            return false;
        }
        return true;
    }
}