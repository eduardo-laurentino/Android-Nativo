package com.eduardo.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "A persistência realiza o impossível.",
                "Não se desespere quando a caminhada estiver difícil, é sinal de que você está no caminho certo.",
                "É parte da cura o desejo de ser curado.",
                "O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.",
                "Cada dificuldade ultrapassada te faz mais forte.",
                "Em dias difíceis, lembre-se do que Deus já fez por ti.",
                "Da mesma forma que a felicidade não dura para sempre, a tristeza também não.",
                "Ser uma pessoa melhor é o objetivo do dia.",
                "Para chegar em lugares maravilhosos, é necessário passar por caminhos difíceis.",
                "As estrelas mais brilhantes são produzidas nas noites mais escuras.",
                "Domine os seus medos!",
                "Em um mundo cheio de adversidades, quem não desiste sempre sairá como vencedor no final.",
                "A sua competição é com você mesmo",
                "Coloque fé em seus sonhos, e não limites",
                "Acredite na sua capacidade e conquiste o seu lugar",
                "Eu não iria conseguir chegar até aqui sem Deus",
                "Fica em pé diante de qualquer coisa, aquele que fica de joelhos diante de Deus",
                "Começar é o segredo do progresso",
                "Seja uma boa pessoa, antes de ser um bom profissional",
                "Não deixe as suas dores definirem o seu futuro, e sim a sua confiança",
                "Se hoje o plano falhar, mude o plano, e não o objetivo."
        };
        int numero = new Random().nextInt(21);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

}