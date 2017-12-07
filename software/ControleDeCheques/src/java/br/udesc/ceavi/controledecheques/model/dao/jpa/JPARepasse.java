/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao.jpa;

import br.udesc.ceavi.controledecheques.model.dao.RepasseDao;
import br.udesc.ceavi.controledecheques.model.entity.Repasse;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Wagner
 */
public class JPARepasse implements RepasseDao{

    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ControleDeChequesPU");
        return factory.createEntityManager();
    }
    @Override
    public void salvar(Repasse r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Repasse r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisar(Repasse r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Repasse r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Repasse> lista() {
         EntityManager em = null;
        try {
            em = getEM();
            Query consulta = em.createQuery("select r from Repasse r");
            return consulta.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public Repasse busca(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
