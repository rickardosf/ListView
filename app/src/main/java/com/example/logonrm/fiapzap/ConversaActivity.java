package com.example.logonrm.fiapzap;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class ConversaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);

        ActionBar actionBar = getSupportActionBar();

        Contato contato = (Contato) getIntent().getExtras().get("contato");

        ImageView imgContato = (ImageView)findViewById(R.id.imgContato);
        TextView txtNome = (TextView)findViewById(R.id.txtNome);

        if (contato != null){
            imgContato.setImageResource(contato.getFoto());
            txtNome.setText(contato.getNome());

            actionBar.setTitle(contato.getNome());
        }
    }

}
