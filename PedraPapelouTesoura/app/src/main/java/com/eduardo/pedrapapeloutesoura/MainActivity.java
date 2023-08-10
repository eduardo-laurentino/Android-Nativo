package com.eduardo.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada){
        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textoResultado);
        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];
        switch(opcaoApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if(opcaoApp == "tesoura" && opcaoSelecionada == "papel" ||
           opcaoApp == "papel" && opcaoSelecionada == "pedra" ||
           opcaoApp == "pedra" && opcaoSelecionada == "tesoura"){
            textoResultado.setText("Você perdeu :(");
        }else if(opcaoSelecionada == "tesoura" && opcaoApp == "papel" ||
                opcaoSelecionada == "papel" && opcaoApp == "pedra" ||
                opcaoSelecionada == "pedra" && opcaoApp == "tesoura"){
            textoResultado.setText("Você ganhou :)");
        }else{
            textoResultado.setText("Empate");
        }
        System.out.println("item clicado: " + opcaoApp);
    }
}