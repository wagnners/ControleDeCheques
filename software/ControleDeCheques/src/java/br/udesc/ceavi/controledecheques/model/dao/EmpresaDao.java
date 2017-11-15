/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao;

import br.udesc.ceavi.controledecheques.model.entity.Empresa;
import java.util.List;

/**
 *
 * @author Wagner
 */
public interface EmpresaDao{

   
    public void salvar(Empresa e);
    
    public void excluir(Empresa e);

    public void pesquisar(Empresa e);

    public void alterar(Empresa e);

    public List<Empresa> lista();

    public Empresa busca(int id);
    
}
