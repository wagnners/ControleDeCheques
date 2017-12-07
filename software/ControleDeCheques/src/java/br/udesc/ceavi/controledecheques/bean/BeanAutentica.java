/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.bean.util.SessionUtil;
import br.udesc.ceavi.controledecheques.model.dao.EmpresaDao;
import br.udesc.ceavi.controledecheques.model.dao.JPAFactory;
import br.udesc.ceavi.controledecheques.model.entity.Empresa;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Wagner
 */
@RequestScoped
@ManagedBean(name = "beanAutentica")
public class BeanAutentica implements Serializable {

    private static final long serialVersionUID = 1L;

    private String usuario;
    private String senha;
    private EmpresaDao daoEmpresa;
    private List<Empresa> empresas;

    public BeanAutentica() {
        this.daoEmpresa = JPAFactory.getEmpresaDao();
        empresas = daoEmpresa.lista();
    }

    public String autentica() {
        System.out.println("autentica..");           
            System.out.println("TESTEEE");
            for (Empresa empresa : empresas) {
              if (usuario.equalsIgnoreCase(empresa.getUsuario()) && senha.equalsIgnoreCase(empresa.getSenha())) {
                System.out.println("Confirmou  usuario e senha ...");

                //ADD USUARIO NA SESSION
                Object b = new Object();

                SessionUtil.setParam("USUARIOLogado", b);
                
                return "/index.jsf?faces-redirect=true";
            
            }
              else
             
                  return null;
        }
          
            return null;
    }

    /**
     * M�todo que efetua o logout
     *
     * @return
     */
    public String registraSaida() {

        //REMOVER USUARIO DA SESSION
        return "/Login?faces-redirect=true";
    }

    // GETTERS E SETTERS
    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
