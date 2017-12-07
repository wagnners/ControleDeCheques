/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

/**
 *
 * @author Wagner
 */
@Entity
public class Repasse {
    
    @Id
    @GeneratedValue
    private int id;
    @JoinColumn (name="cheque_id")
    private Cheque cheque;
    private String datahora;
    @JoinColumn (name="pessoa_id")
    private Pessoa pessoa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    public String getDataHora() {
        return datahora;
    }

    public void setDataHora(String data) {
        this.datahora = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
