/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import br.udesc.ceavi.controledecheques.model.entity.TipoPessoa;
import java.util.ArrayList;
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
public class BeanPessoa {

    private String tipoEscolhido;
    private Pessoa pessoa;
    private List<TipoPessoa> enumTipoPessoa;
    
    public BeanPessoa() {
        pessoa = new Pessoa();
        enumTipoPessoa = Arrays.asList(TipoPessoa.values());
                
    }

    public String getTipoEscolhido() {
        return tipoEscolhido;
    }

    public void setTipoEscolhido(String tipoEscolhido) {
        this.tipoEscolhido = tipoEscolhido;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<TipoPessoa> getEnumTipoPessoa() {
        return enumTipoPessoa;
    }

    public void setEnumTipoPessoa(List<TipoPessoa> enumTipoPessoa) {
        this.enumTipoPessoa = enumTipoPessoa;
    }

 
    
    public List<String> getEnum() {
         ArrayList<String> retorno;
        retorno = new ArrayList<String>();
        for (TipoPessoa tipoPessoa : enumTipoPessoa) {
            retorno.add(tipoPessoa.toString());
        }
        

        return retorno;

    }

  
}
