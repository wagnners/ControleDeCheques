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
public enum TipoCheque {
    PRE("Pré"),
    BOM("Bom");

    private final String nome;

     public TipoCheque[] asList(){
        return TipoCheque.values();
    }
     
    TipoCheque(String nome) {
        this.nome = nome;
    }
    
      @Override
    public String toString() {
        return this.nome;
    }
}
