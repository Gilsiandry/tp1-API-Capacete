package br.unitins.tp1.model;


import br.unitins.tp1.enums.Classificacao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Capacete extends DefaultEntity{


    @Column (length = 60, nullable = false)
    private String marca;

    @Column ()
    private String categoria;
    
    // @Column ()
    // private String tipo;

    // @Column ()
    // private String cor;

    @Column ()
    private Long tamanho;

    // @Column ()
    // private String preco;

    @Enumerated(EnumType.STRING)
    private Classificacao classificacao;
   

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
}