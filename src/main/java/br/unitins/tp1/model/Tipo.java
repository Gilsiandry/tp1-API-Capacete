package br.unitins.tp1.model;

import jakarta.persistence.Entity;

@Entity
public class Tipo extends DefaultEntity {

    private String nome;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}