/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao.jpa;

import br.udesc.ceavi.controledecheques.model.dao.EmpresaDao;
import br.udesc.ceavi.controledecheques.model.entity.Empresa;
import br.udesc.ceavi.controledecheques.model.entity.Empresa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Wagner
 */
public class JPAEmpresa implements EmpresaDao {

 public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ControleDeChequesPU");
        return factory.createEntityManager();
    }

    @Override
    public Empresa salvar (Empresa empresa) {
        System.out.println("CHAMOU AQUI");
         EntityManager em = getEM();
         try{
         em.getTransaction().begin();
         em.persist(empresa);
         em.getTransaction().commit();
             System.out.println("TESTEE");
         }catch (Exception e){
             System.out.println(e);
             em.getTransaction().rollback();
         }finally{
             em.close();
         }
         return empresa;
    }

    @Override
    public void excluir(Empresa empresa) {
         EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            empresa = em.merge(empresa);
            em.remove(empresa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void pesquisar(Empresa e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Empresa e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empresa> lista() {
        EntityManager em = null;
        try {
            em = getEM();
            Query consulta = em.createQuery("select e from Empresa e");
            return consulta.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    

    @Override
    public Empresa busca(int id) {
                EntityManager em = null;
        try {
            em = getEM();
            return em.find(Empresa.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
