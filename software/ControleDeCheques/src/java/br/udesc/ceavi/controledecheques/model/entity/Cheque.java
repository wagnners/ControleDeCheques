/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Wagner
 */
@Entity
public class Cheque {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;
    private int numero;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_banco")
    private Banco banco;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;
    private int tipo;
    private boolean sem_Fundo;
    private double valor;
    @Column(name = "data_cadastro", insertable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_cadastro;
    @Column(name = "data_entrada", insertable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_entrada;
    @Column(name = "data_desconto", insertable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_desconto;
    private String observacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setSem_Fundo(boolean sem_Fundo) {
        this.sem_Fundo = sem_Fundo;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isSem_Fundo() {
        return sem_Fundo;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_desconto() {
        return data_desconto;
    }

    public void setData_desconto(Date data_desconto) {
        this.data_desconto = data_desconto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
