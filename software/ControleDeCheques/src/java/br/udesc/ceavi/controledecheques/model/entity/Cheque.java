/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.entity;

/**
 *
 * @author Wagner
 */
public class Cheque {
   private int id;
   private String tipo;
   private boolean semFundo;
   private int numCheque; //numero cheque
   private Banco banco;
   private Pessoa pessoa;
   private double valor;
   private String dataCadastro;
   private String dataEntrada;
   private String dataDesconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isSemFundo() {
        return semFundo;
    }

    public void setSemFundo(boolean semFundo) {
        this.semFundo = semFundo;
    }

    public int getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(int numCheque) {
        this.numCheque = numCheque;
    }

    public Banco getBanco() {
        return banco;
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

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataDesconto() {
        return dataDesconto;
    }

    public void setDataDesconto(String dataDesconto) {
        this.dataDesconto = dataDesconto;
    }
   
   
  
}  
