package br.ulbra.appcadastro;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;

public class TelaCadastroUsuario {
    TelaPrincipal telaPrincipal;
    MainActivity act;
    EditText edtNome, edtEndereco, edtTelefone;
    Button btnCadastrar, btnCancelar;

    public TelaCadastroUsuario(MainActivity act, TelaPrincipal telaPrincipal){
        this.act = act;
        this.telaPrincipal = telaPrincipal;
    }
    public void CarregarTela(){
        act.setContentView(R.layout.teladecadastro);
        edtNome = (EditText) act.findViewById(R.id.edtNome);
        edtEndereco = (EditText) act.findViewById(R.id.edtEndereco);
        edtTelefone = (EditText) act.findViewById(R.id.edtTelefone);
        btnCadastrar = (Button) act.findViewById(R.id.btnCadastro);
        btnCancelar = (Button) act.findViewById(R.id.btnCancelar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar usuário?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String nome = edtNome.getText().toString();
                        String telefone = edtTelefone.getText().toString();
                        String endereco = edtEndereco.getText().toString();
                        act.getRegistros().add(new Registro(nome, telefone, endereco));
                        act.ExibirMensagem("Cadastro efetuado com sucesso.");
                        telaPrincipal.CarregarTela();
                    }
                });
                dialogo.show();
                }});
                btnCancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                        dialogo.setTitle("Aviso");
                        dialogo.setMessage("Sair do cadastro?");
                        dialogo.setNegativeButton("Não", null);
                        dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                telaPrincipal.CarregarTela();
                            }});
                            dialogo.show();
                            }});
    }
}
