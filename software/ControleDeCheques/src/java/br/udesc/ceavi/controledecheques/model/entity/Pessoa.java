/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Wagner
 */
@Entity
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private int tipo;
    private String cpf_cnpj;
    private String inscricao_estadual;
    private String fone;
    private String email;
    @Column(name = "data_cadastro", insertable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_cadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCpf_Cnpj() {
        return cpf_cnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpf_cnpj= cpfCnpj;
    }

    public String getInscEstaual() {
        return inscricao_estadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscricao_estadual = inscEstadual;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
    
    
}
