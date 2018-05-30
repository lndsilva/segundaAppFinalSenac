package br.senac.sp.segundaappfinal;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.idCoord);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.buttomFAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinatorLayout, "Email enviado com sucesso!!!", Snackbar.LENGTH_SHORT)
                        .setAction("DESFAZER", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar snackbar = Snackbar.make(coordinatorLayout, "Email devolvido com sucesso!!!", Snackbar.LENGTH_SHORT);
                                snackbar.show();

                            }
                        });
                snackbar.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.ic_login:
                Intent abrirLogin = new Intent(MenuActivity.this, LoginActivity.class);
                startActivity(abrirLogin);
                return true;
            case R.id.ic_register:
                Intent abrirRegister = new Intent(MenuActivity.this, RegisterActivity.class);
                startActivity(abrirRegister);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
