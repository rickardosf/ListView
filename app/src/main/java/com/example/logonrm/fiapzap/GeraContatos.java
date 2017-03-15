package com.example.logonrm.fiapzap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 15/03/2017.
 */

public class GeraContatos {
    public static List<Contato> listaContatos(){
        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Joao", "Online", R.drawable.person1));
        contatos.add(new Contato("Jose", "Offline", R.drawable.person2));
        contatos.add(new Contato("Maria", "Online", R.drawable.person3));

        return contatos;
    }
}
