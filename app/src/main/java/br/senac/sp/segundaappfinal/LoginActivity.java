package br.senac.sp.segundaappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Principal;

public class LoginActivity extends AppCompatActivity {
    EditText loginEmail;
    EditText loginSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        loginEmail = findViewById(R.id.loginEmail);
        loginSenha = findViewById(R.id.loginSenha);
    }

    public void carregaRegister(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void carregaJanelaRegister(View view) {

        String usuarioEmail;
        String usuarioSenha;

        usuarioEmail = loginEmail.getText().toString();
        usuarioSenha = loginSenha.getText().toString();

        if (usuarioEmail.equals("senac") && usuarioSenha.equals("senac")) {
            Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(LoginActivity.this, "Usuário ou senha Incorretos!!!", Toast.LENGTH_SHORT).show();
            limpaTela();
        }
    }

    public void limpaTela() {
        loginEmail.setText("");
        loginSenha.setText("");
        loginEmail.requestFocus();
    }
}
