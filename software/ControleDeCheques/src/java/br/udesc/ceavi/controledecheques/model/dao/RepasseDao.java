/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao;

import br.udesc.ceavi.controledecheques.model.entity.Repasse;
import java.util.List;

/**
 *
 * @author Wagner
 */
public interface RepasseDao{

    public void salvar(Repasse r);

    public void excluir(Repasse r);
    
    public void pesquisar(Repasse r);
  
    public void alterar(Repasse r);

    public List<Repasse> lista();

    public Repasse busca(int id);
    
}
