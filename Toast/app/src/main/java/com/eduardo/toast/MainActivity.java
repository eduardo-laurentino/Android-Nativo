package com.eduardo.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirToast(View view){
        Toast.makeText(getApplicationContext(), "Ação realizada com sucesso", Toast.LENGTH_SHORT).show();
    }
}