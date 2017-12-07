/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao;

import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import java.util.List;

/**
 *
 * @author Wagner
 */
public interface PessoaDao {

    public Pessoa salvar(Pessoa p);

    public void excluir(Pessoa p);

    public void pesquisar(Pessoa p);
    
    public void alterar(Pessoa p);
   
    public List<Pessoa> lista();

    
    public Pessoa busca(int id);
    
}
