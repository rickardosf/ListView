package com.example.logonrm.fiapzap;

import java.io.Serializable;

/**
 * Created by logonrm on 15/03/2017.
 */

public class Contato implements Serializable {
    private String nome;
    private String status;
    private int foto;

    public Contato(String nome, String status, int foto) {
        this.nome = nome;
        this.status = status;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
