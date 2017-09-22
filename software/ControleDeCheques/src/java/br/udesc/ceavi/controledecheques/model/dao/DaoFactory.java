/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao;

import br.udesc.ceavi.controledecheques.model.entity.Banco;

/**
 *
 * @author Wagner
 */
public class DaoFactory {

    public BancoDao getBancoDao() {
        return new BancoDao();
    }

    public EmpresaDao getEmpresaDao() {
        return new EmpresaDao();
    }

    public PessoaDao getPessoaDao() {
        return new PessoaDao();
    }

    public RepasseDao getRepasseDao() {
        return new RepasseDao();
    }

    public ChequeDao getChequeDao() {
        return new ChequeDao();
    }

}
