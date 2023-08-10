package com.eduardo.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;
    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;
    private RadioButton sexoM, sexoF;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);
        sexoF = findViewById(R.id.radioButtonF);
        sexoM = findViewById(R.id.radioButtonM);
        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radiobutton();
    }
        public void radiobutton(){
            opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if (i == R.id.radioButtonM){
                        textoResultado.setText("Masculino");
                    }else if (i == R.id.radioButtonF){
                        textoResultado.setText("Femenino");
                    }
                }
            });

            /*
           if(sexoM.isChecked()){textoResultado.setText("Masculino");
           }else if (sexoF.isChecked()){textoResultado.setText("Femenino");
           }
            */
        }


    public void checkbox(){
        String texto = "";
        //String corSelecionada = checkVerde.getText().toString();
        //texto = corSelecionada;
        if (checkVerde.isChecked()){
            texto = "Verde selecionado - ";
        }
        if (checkBranco.isChecked()){
            texto = texto + "Branco selecionado - ";
        }
        if (checkVermelho.isChecked()){
            texto = texto + "Vermelho selecionado - ";
        }
        textoResultado.setText(texto);
    }

    public void enviar(View view){
        //radiobutton();
        //checkbox();
        /*String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("nome: " + nome + " email: " + email); */
    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
    }
}