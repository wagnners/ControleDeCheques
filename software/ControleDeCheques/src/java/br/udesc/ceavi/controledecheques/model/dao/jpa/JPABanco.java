/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao.jpa;

import br.udesc.ceavi.controledecheques.model.dao.BancoDao;
import br.udesc.ceavi.controledecheques.model.entity.Banco;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Wagner
 */
public class JPABanco implements BancoDao {
    
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ControleDeChequesPU");
        return factory.createEntityManager();
    }

    @Override
    public Banco salvar(Banco b) {
         EntityManager em = getEM();
         try{
         em.getTransaction().begin();
         em.persist(b);
         em.getTransaction().commit();
         }catch (Exception e){
             em.getTransaction().rollback();
         }finally{
             em.close();
         }
         return b;
    }

    @Override
    public void excluir(Banco b) {
         EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            b = em.merge(b);
            em.remove(b);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void pesquisar(Banco b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Banco b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Banco> lista() {
        EntityManager em = null;
        try {
            em = getEM();
            Query consulta = em.createQuery("select b from Banco b");
            return consulta.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    

    @Override
    public Banco busca(int id) {
       EntityManager em = null;
        try {
            em = getEM();
            return em.find(Banco.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
