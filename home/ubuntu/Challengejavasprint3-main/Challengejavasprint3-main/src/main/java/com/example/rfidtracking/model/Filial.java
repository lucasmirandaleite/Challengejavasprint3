package com.example.rfidtracking.model;

import javax.persistence.*;

@Entity
@Table(name = "FILIAL")
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming sequence/identity for Oracle, adjust if needed based on actual DDL
    @Column(name = "id_filial")
    private Long idFilial;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    // Getters and Setters
    public Long getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(Long idFilial) {
        this.idFilial = idFilial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

