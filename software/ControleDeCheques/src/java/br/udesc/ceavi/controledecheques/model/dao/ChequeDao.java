/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.model.dao;

import br.udesc.ceavi.controledecheques.model.entity.Cheque;
import br.udesc.ceavi.controledecheques.model.entity.Pessoa;
import java.util.List;

/**
 *
 * @author Wagner
 */
public interface ChequeDao {

    
    public Cheque salvar(Cheque c);

   
    public void excluir(Cheque c);

   
    public void pesquisar(Cheque c);

    
    public void alterar(Cheque c);


    public List<Cheque> lista();

   
    public Cheque busca(int id);

    
    
}
