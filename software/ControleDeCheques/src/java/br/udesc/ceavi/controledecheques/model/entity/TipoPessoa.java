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
public enum TipoPessoa {
    FISICA(1, "Fisica"),
    JURIDICA(2, "Pessoa Juridica");
    
    private int valor;
    private String nome;
    
    TipoPessoa(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }
    
    public TipoPessoa[] asList(){
        return TipoPessoa.values();
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
