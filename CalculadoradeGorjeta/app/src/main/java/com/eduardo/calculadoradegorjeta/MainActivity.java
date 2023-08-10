package com.eduardo.calculadoradegorjeta;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editValor;
    private TextView textPorcentagem;
    private TextView textGorjeta;
    private TextView textTotal;
    private SeekBar seekBarGorjeta;
    private TextView textAviso;

    private double porcentagem = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editValor = findViewById(R.id.editValor);
        textGorjeta = findViewById(R.id.textGorjeta);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        textTotal = findViewById(R.id.textTotal);
        textAviso = findViewById(R.id.textAviso);
        seekBarGorjeta = findViewById(R.id.seekBarGorjeta);

        //Adicionar Listener SeekBar
        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = seekBar.getProgress();
                textPorcentagem.setText(Math.round(porcentagem) + " %");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void calcular(){
        String valorRecebido = editValor.getText().toString();
        if (valorRecebido == null || valorRecebido.equals("")){
            textAviso.setText("Primeiro informe o valor da compra!");
            textGorjeta.setText("R$ 0.00");
            textTotal.setText("R$ 0.00");
        }else{
            //Converter string para double
            double valorDigitado = Double.parseDouble(valorRecebido);

            //Calcula a gorjeta
            double gorjeta = valorDigitado * (porcentagem/100);
            double total = gorjeta + valorDigitado;

            //Exibe a gorjeta e total
            textAviso.setText("");
            textGorjeta.setText("R$ " + Math.round(gorjeta) + ".00");
            textTotal.setText("R$ " + Math.round(total) + ".00");
        }
    }
}