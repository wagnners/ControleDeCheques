/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao;

import br.udesc.ceavi.controledecheques.model.entity.Banco;
import java.util.List;

/**
 *
 * @author Wagner
 */
public interface BancoDao{
  
    public void salvar(Banco b);
   
    public void excluir(Banco b);
    
    public void pesquisar(Banco b);
    
    public void alterar(Banco b);
    
    public List<Banco> lista();
    
    public Banco busca(int id);
    
}
