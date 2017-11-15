/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao;

import br.udesc.ceavi.controledecheques.model.dao.jpa.JPABanco;
import br.udesc.ceavi.controledecheques.model.dao.jpa.JPACheque;
import br.udesc.ceavi.controledecheques.model.dao.jpa.JPAEmpresa;
import br.udesc.ceavi.controledecheques.model.dao.jpa.JPAPessoa;
import br.udesc.ceavi.controledecheques.model.dao.jpa.JPARepasse;
import br.udesc.ceavi.controledecheques.model.entity.Banco;

/**
 *
 * @author Wagner
 */
public abstract class JPAFactory { 

    public BancoDao getBancoDao() {
        return new JPABanco();
    }

    public EmpresaDao getEmpresaDao() {
        return new JPAEmpresa();
    }

    public PessoaDao getPessoaDao() {
        return new JPAPessoa();
    }

    public RepasseDao getRepasseDao() {
        return new JPARepasse();
    }

    public ChequeDao getChequeDao() {
        return new JPACheque();
    }
}
