/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao.jpa;

import br.udesc.ceavi.controledecheques.model.dao.ChequeDao;
import br.udesc.ceavi.controledecheques.model.entity.Cheque;
import br.udesc.ceavi.controledecheques.model.entity.Cheque;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Wagner
 */
public class JPACheque implements ChequeDao{

    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ControleDeChequesPU");
        return factory.createEntityManager();
    }

    @Override
    public Cheque salvar (Cheque c) {
         EntityManager em = getEM();
         try{
         em.getTransaction().begin();
         em.persist(c);
         em.getTransaction().commit();
         }catch (Exception e){
             em.getTransaction().rollback();
         }finally{
             em.close();
         }
         return c;
    }

    @Override
    public void excluir(Cheque c) {
         EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            c = em.merge(c);
            em.remove(c);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void pesquisar(Cheque c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Cheque c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cheque> lista() {
        EntityManager em = null;
        try {
            em = getEM();
            Query consulta = em.createQuery("select c from Cheque c");
            return consulta.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    

    @Override
    public Cheque busca(int id) {
                EntityManager em = null;
        try {
            em = getEM();
            return em.find(Cheque.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
