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


/**
 *
 * @author Wagner
 */
public abstract class JPAFactory { 

    public static BancoDao getBancoDao() {
        return new JPABanco();
    }
    

    public static EmpresaDao getEmpresaDao() {
        return new JPAEmpresa();
    }

    public static PessoaDao getPessoaDao() {
        return new JPAPessoa();
    }

    public static RepasseDao getRepasseDao() {
        return new JPARepasse();
    }

    public static ChequeDao getChequeDao() {
        return new JPACheque();
    }
}
