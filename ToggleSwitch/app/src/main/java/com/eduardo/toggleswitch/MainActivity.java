package com.eduardo.toggleswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResultado;
    private CheckBox checkSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);
        checkSenha = findViewById(R.id.checkSenha);
        adicionarListner();
    }
    // Verificando se os componentes estão ligados
    public void adicionarListner(){
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (switchSenha.isChecked()){
                    textResultado.setText(("Switch ligado!"));
                }else{
                    textResultado.setText("Switch desligado!");
                }
            }
        });
    }
    // Verificando se os componentes estão ligados
    public void enviar(View view){
        if (switchSenha.isChecked()){
            textResultado.setText(("Switch ligado!"));
        }else{
            textResultado.setText("Switch desligado!");
        }
    }
}