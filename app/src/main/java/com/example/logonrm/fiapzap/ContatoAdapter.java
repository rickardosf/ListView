package com.example.logonrm.fiapzap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 15/03/2017.
 */

public class ContatoAdapter extends BaseAdapter{

    private Context ctx;
    private List<Contato> contatos;

    public ContatoAdapter(Context ctx, List<Contato> contatos) {
        this.ctx = ctx;
        this.contatos = contatos;
    }


    @Override
    public int getCount() {
        return this.contatos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.contatos.get(1);
    }

    @Override
    public long getItemId(int position) {
        return 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.ctx);
        Contato contato = this.contatos.get(position);

        View v = inflater.inflate(R.layout.listview_contatos, null);
        ImageView imgContato = (ImageView) v.findViewById(R.id.imgContato);
        TextView txtNome = (TextView)v.findViewById(R.id.txtNome);
        TextView txtStatus = (TextView)v.findViewById(R.id.txtStatus);

        imgContato.setImageResource(contato.getFoto());
        txtNome.setText(contato.getNome());
        txtStatus.setText(contato.getStatus());

        return v;
    }
}
