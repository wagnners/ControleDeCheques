/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.dao.BancoDao;
import br.udesc.ceavi.controledecheques.model.dao.ChequeDao;
import br.udesc.ceavi.controledecheques.model.dao.Dao;
import br.udesc.ceavi.controledecheques.model.dao.JPAFactory;
import br.udesc.ceavi.controledecheques.model.dao.PessoaDao;
import br.udesc.ceavi.controledecheques.model.dao.jpa.JPACheque;
import br.udesc.ceavi.controledecheques.model.entity.Banco;
import br.udesc.ceavi.controledecheques.model.entity.Cheque;
import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
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
    private ChequeDao dao;
    private List<TipoCheque> enumTipoCheque;
    private TipoCheque tipoChequeEscolhido;
    private Pessoa pessoa;
    private Banco banco;
    private BancoDao daoBanco;
    private PessoaDao daoPessoa;
    private String valor;

    public BeanCheque() {
        cheque = new Cheque();
        pessoa = new Pessoa();
        banco = new Banco();
        daoBanco = JPAFactory.getBancoDao();
        daoPessoa = JPAFactory.getPessoaDao();
        enumTipoCheque = Arrays.asList(TipoCheque.values());
        dao = JPAFactory.getChequeDao();
        
    }

   
    
    public List<Banco> getListBancos(){
        return daoBanco.lista();
    }
      public List<Pessoa> getListPessoas(){
        return daoPessoa.lista();
    }



    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    
    public int valorEscolhido(){
        if (valor.equalsIgnoreCase("PRE"))
            return 1;
        else
            return 2;
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

    public ChequeDao getDao() {
        return dao;
    }

    public void setDao(ChequeDao dao) {
        this.dao = dao;
    }
    public List<Cheque> getListaCheques() {
        return dao.lista();
    }
    

}
