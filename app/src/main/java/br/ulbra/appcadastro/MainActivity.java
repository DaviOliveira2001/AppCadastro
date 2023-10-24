package br.ulbra.appcadastro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Registro>aRegistro;
    TelaPrincipal telaPrincipal;
    TelaCadastroUsuario telaCadastroUsuario;
    TelaListagemUsuarios telaListagemUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        aRegistro = new ArrayList<Registro>();
        telaPrincipal = new TelaPrincipal(this);
        telaCadastroUsuario = new TelaCadastroUsuario(this, telaPrincipal);
        telaListagemUsuarios = new TelaListagemUsuarios(this, telaPrincipal);
        telaPrincipal.setTelaCadastro(telaCadastroUsuario);
        telaPrincipal.setTelalistagem(telaListagemUsuarios);
        telaPrincipal.CarregarTela();

    }
    public ArrayList <Registro> getRegistros() {

        return aRegistro;
    }
    public void ExibirMensagem(String msg) {
        AlertDialog.Builder d = new AlertDialog.Builder(MainActivity.this);
        d.setTitle("Aviso");
        d.setMessage(msg);
        d.setNeutralButton("OK", null); d.show();
        }
    }
