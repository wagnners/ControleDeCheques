/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.dao.BancoDao;
import br.udesc.ceavi.controledecheques.model.dao.JPAFactory;
import br.udesc.ceavi.controledecheques.model.dao.jpa.JPABanco;
import br.udesc.ceavi.controledecheques.model.entity.Banco;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wagner
 */
@ManagedBean
@ViewScoped
public class BeanBanco {
    private Banco banco;
    private BancoDao dao;
    private List<Banco> listaBancos;

    public BeanBanco() {
        banco = new Banco();
        dao = JPAFactory.getBancoDao(); 
    }
    public List<Banco> getListaBancos() {
        return dao.lista();
    }   
    
    
    public String salvarDisco() {
        dao.salvar(banco);
        return "cadastroBanco.jsf";
    }


    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public BancoDao getDao() {
        return dao;
    }

    public void setDao(BancoDao dao) {
        this.dao = dao;
    }
    
    
    
    

    
}
