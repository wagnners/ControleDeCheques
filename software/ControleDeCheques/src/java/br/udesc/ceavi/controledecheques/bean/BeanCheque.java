/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.entity.Cheque;
import br.udesc.ceavi.controledecheques.model.entity.TipoCheque;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wagner
 */
@ManagedBean
@ViewScoped
public class BeanCheque {

    private String tipoEscolhido;
    private Cheque cheque;
    private List<TipoCheque> enumTipoCheque;

    public BeanCheque() {
        cheque = new Cheque();
        enumTipoCheque = Arrays.asList(TipoCheque.values());
    }

    public String getTipoEscolhido() {
        return tipoEscolhido;
    }

    public void setTipoEscolhido(String tipoEscolhido) {
        this.tipoEscolhido = tipoEscolhido;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    public List<TipoCheque> getEnumTipoCheque() {
        return enumTipoCheque;
    }

    public void setEnumTipoCheque(List<TipoCheque> enumTipoCheque) {
        this.enumTipoCheque = enumTipoCheque;
    }

}
