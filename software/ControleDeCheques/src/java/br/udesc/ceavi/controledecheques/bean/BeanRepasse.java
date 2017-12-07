/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.dao.JPAFactory;
import br.udesc.ceavi.controledecheques.model.dao.RepasseDao;
import br.udesc.ceavi.controledecheques.model.entity.Cheque;
import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import br.udesc.ceavi.controledecheques.model.entity.Repasse;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wagner
 */
@ManagedBean
@ViewScoped
public class BeanRepasse {

    private Pessoa pessoa;
    private Cheque cheque;
    private RepasseDao dao;
    private Repasse repasse;
    private String valorPessoa;
    private String valorCheque;

    public BeanRepasse() {
        pessoa = new Pessoa();
        cheque = new Cheque();
        dao = JPAFactory.getRepasseDao();
    }

    public String getValorPessoa() {
        return valorPessoa;
    }

    public void setValorPessoa(String valorPessoa) {
        this.valorPessoa = valorPessoa;
    }

    public String getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(String valorCheque) {
        this.valorCheque = valorCheque;
    }

    public Repasse getRepasse() {
        return repasse;
    }

    public void setRepasse(Repasse repasse) {
        this.repasse = repasse;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    public RepasseDao getDao() {
        return dao;
    }

    public void setDao(RepasseDao dao) {
        this.dao = dao;
    }

    public List<Repasse> getListaRepasses() {
        return dao.lista();
    }

    public String salvar() {
        dao.salvar(repasse);
//        System.out.println(pessoa.getTipo());

        //       System.out.print(pessoa.getTipo());
        //      System.out.println(valor);
        return "repasseCheque.jsf";
    }

}
