/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.dao.EmpresaDao;
import br.udesc.ceavi.controledecheques.model.dao.JPAFactory;
import br.udesc.ceavi.controledecheques.model.dao.PessoaDao;
import br.udesc.ceavi.controledecheques.model.entity.Empresa;
import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import br.udesc.ceavi.controledecheques.model.entity.TipoPessoa;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import static org.eclipse.persistence.expressions.ExpressionOperator.Log;

/**
 *
 * @author Wagner
 */
@ManagedBean
@ViewScoped
public class BeanUsuario {

    private Empresa empresa;
    private EmpresaDao daoEmpresa;
    private Pessoa pessoa;
    private PessoaDao daoPessoa;
    private TipoPessoa tipoPessoaEscolhida;
    private List<TipoPessoa> enumTipoPessoa;
    private List<Empresa> listaUsuarios;
    private String valor;

    public BeanUsuario() {
        empresa = new Empresa();
        daoEmpresa = JPAFactory.getEmpresaDao();
        pessoa = new Pessoa();
        daoPessoa = JPAFactory.getPessoaDao();
        enumTipoPessoa = Arrays.asList(TipoPessoa.values());

    }

    public List<TipoPessoa> getEnumTipoPessoa() {
        return enumTipoPessoa;
    }

    public void setEnumTipoPessoa(List<TipoPessoa> enumTipoPessoa) {
        this.enumTipoPessoa = enumTipoPessoa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public EmpresaDao getDao() {
        return daoEmpresa;
    }

    public void setDao(EmpresaDao dao) {
        this.daoEmpresa = dao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public List<Empresa> getListaUsuarios() {
        return daoEmpresa.lista();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public int valorEscolhido(){
        if (valor.equalsIgnoreCase("FISICA"))
            return 1;
        else
            return 2;
    }

    public String salvar() {
       pessoa.setTipo(valorEscolhido());
       daoPessoa.salvar(pessoa);
//        System.out.println(pessoa.getTipo());
        empresa.setPessoa(pessoa);
        
 //       System.out.print(pessoa.getTipo());
  //      System.out.println(valor);
        daoEmpresa.salvar(empresa);
        System.out.println("TESTEEE");
        return "cadastroUsuario.jsf";
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getValorTipoEscolhido() {
        if (tipoPessoaEscolhida.equals(TipoPessoa.FISICA)) {
            return 1;
        } else {
            return 2;
        }
    }

}
