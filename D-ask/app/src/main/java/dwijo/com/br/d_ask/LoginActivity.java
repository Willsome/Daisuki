package dwijo.com.br.d_ask;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText editText_login, editText_senha;

    Button btlogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editText_login = (EditText) findViewById(R.id.editText_login);
        editText_senha = (EditText) findViewById(R.id.editText_senha);

        // CRIA BOTÃO E CHECA SE OS CAMPOS ESTÃO VÁZIOS AO APERTAR O BOTÃO \/
        btlogar = (Button) findViewById(R.id.btlogar);
        btlogar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (editText_login.getText().toString().length() == 0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(LoginActivity.this);
                    alerta.setTitle("Aviso !");
                    alerta.setMessage("Insira seu login ou e-mail.");
                    alerta.setNeutralButton("Ok", null);
                    alerta.show();
                } else if (editText_senha.getText().toString().length() == 0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(LoginActivity.this);
                    alerta.setTitle("Aviso !");
                    alerta.setMessage("Insira sua senha.");
                    alerta.setNeutralButton("Ok", null);
                    alerta.show();
                }
            }
        });
        // CRIA BOTÃO E CHECA SE OS CAMPOS ESTÃO VÁZIOS AO APERTAR O BOTÃO /\

    }

}