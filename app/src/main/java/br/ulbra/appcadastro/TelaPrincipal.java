package br.ulbra.appcadastro;

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {
    MainActivity act;
    Button btnCadastrar;
    Button btnListar;
    TelaCadastroUsuario telacadastro;
    TelaListagemUsuarios telalistagem;

    public TelaPrincipal(MainActivity act) {

        this.act = act;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.activity_main);
        btnCadastrar = (Button) act.findViewById(R.id.btnTela2);
        btnListar = (Button) act.findViewById(R.id.btnListagem);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telacadastro.CarregarTela();
            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telalistagem.CarregarTela();
            }

        });
    }

    public void setTelaCadastro(TelaCadastroUsuario telaCadastroUsuario) {
        this.telacadastro = telaCadastroUsuario;
    }

    public void setTelalistagem(TelaListagemUsuarios telaListagemUsuarios) {
        this.telalistagem = telaListagemUsuarios;
    }


}

