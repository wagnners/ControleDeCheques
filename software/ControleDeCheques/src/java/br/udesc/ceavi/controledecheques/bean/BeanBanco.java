/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.dao.BancoDao;
import br.udesc.ceavi.controledecheques.model.dao.jpa.JPABanco;
import br.udesc.ceavi.controledecheques.model.entity.Banco;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Wagner
 */
public class BeanBanco {
    private Banco banco;
    private BancoDao dao;

    public BeanBanco() {
        banco = new Banco();
        dao = new JPABanco();
    }
    
    public String salvar() {
        dao.salvar(banco);
        return "index";
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
