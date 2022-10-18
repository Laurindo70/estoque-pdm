package com.unigran.estoque;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class tela_clientes extends AppCompatActivity {

    private Button btn_cadastro_clientes;
    private CadastroClientesFragment cadastroClientesFragmento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_clientes);

        btn_cadastro_clientes = findViewById(R.id.btnCadastroClientes);

        cadastroClientesFragmento = new CadastroClientesFragment();

        FragmentTransaction transacao = getSupportFragmentManager().beginTransaction();
        transacao.add(R.id.conteudo_clientes, cadastroClientesFragmento);
        transacao.commit();
    }
}