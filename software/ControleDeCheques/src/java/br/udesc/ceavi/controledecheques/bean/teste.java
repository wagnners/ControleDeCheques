/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.dao.BancoDao;
import br.udesc.ceavi.controledecheques.model.dao.ChequeDao;
import br.udesc.ceavi.controledecheques.model.dao.Dao;
import br.udesc.ceavi.controledecheques.model.dao.EmpresaDao;
import br.udesc.ceavi.controledecheques.model.dao.JPAFactory;
import br.udesc.ceavi.controledecheques.model.dao.PessoaDao;
import br.udesc.ceavi.controledecheques.model.entity.Banco;
import br.udesc.ceavi.controledecheques.model.entity.Cheque;
import br.udesc.ceavi.controledecheques.model.entity.Empresa;
import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import br.udesc.ceavi.controledecheques.model.entity.TipoPessoa;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Wagner
 */
public class teste {
    public static Timestamp timestamp;
    public static void main(String[] args) {
//        Banco banco = new Banco();
//       banco.setNome("Teste");
//        BancoDao daobanco = JPAFactory.getBancoDao();
//        List<Banco> lista = daobanco.lista();
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getNome());
//        }
//        daobanco.salvar(banco);
        Pessoa p = new Pessoa();
        p.setNome("olaa");
        p.setCpfCnpj("1234");
        p.setFone("000001");
        p.setInscEstadual("342434");
        p.setTipo(1);
        p.setMail("mail");
        PessoaDao daoPessoa = JPAFactory.getPessoaDao();
        daoPessoa.salvar(p);
        System.out.println("COnseguiu salvar pessoa");
        Empresa e = new Empresa();
        e.setPessoa(p);
        System.out.println("TESTE P2 " + e.getPessoa().getId());
         System.out.println("TESTE id " + e.getId());
        e.setUsuario("meumeu");
        e.setSenha("meumeu");
        EmpresaDao daoEmpresa = JPAFactory.getEmpresaDao();
        daoEmpresa.salvar(e);
        System.out.println("TESTE EMPRESA");
//        Cheque c = new Cheque();
//        c.setNumero(7654);
//        c.setTipo(1);
//        c.setValor(50000);
//        c.setSem_Fundo(true);
//        c.setObservacao("jbbjkbb");
//        c.setBanco(banco);
//        c.setPessoa(p);
//        ChequeDao daoCliente = JPAFactory.getChequeDao();
//        daoCliente.salvar(c);
        
        
    }
    
}
