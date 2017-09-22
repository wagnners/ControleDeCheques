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
public interface Dao <Entidade extends Object> {
    public void salvar(Entidade e);
    public void excluir(Entidade e);
    public void pesquisar(Entidade e);
    public void alterar(Entidade e);
    public List<Entidade> lista();
    public Entidade busca(int id);
}
