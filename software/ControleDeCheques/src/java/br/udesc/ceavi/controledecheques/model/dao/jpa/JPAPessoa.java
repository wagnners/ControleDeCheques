/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao.jpa;

import br.udesc.ceavi.controledecheques.model.dao.PessoaDao;
import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Wagner
 */
public class JPAPessoa implements PessoaDao{

public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ControleDeChequesPU");
        return factory.createEntityManager();
    }

    @Override
    public Pessoa salvar (Pessoa p) {
         EntityManager em = getEM();
         try{
         em.getTransaction().begin();
         em.persist(p);
         em.getTransaction().commit();
         }catch (Exception e){
              System.out.println("mais um teste"+ p.getData_cadastro());
             em.getTransaction().rollback();
            
         }finally{
             em.close();
         }
         return p;
    }

    @Override
    public void excluir(Pessoa p) {
         EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            p = em.merge(p);
            em.remove(p);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void pesquisar(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> lista() {
        EntityManager em = null;
        try {
            em = getEM();
            Query consulta = em.createQuery("select p from Pessoa p");
            return consulta.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    

    @Override
    public Pessoa busca(int id) {
                EntityManager em = null;
        try {
            em = getEM();
            return em.find(Pessoa.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}

