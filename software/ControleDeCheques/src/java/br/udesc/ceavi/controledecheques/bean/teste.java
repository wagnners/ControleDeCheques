/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.controledecheques.bean;

import br.udesc.ceavi.controledecheques.model.entity.TipoPessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wagner
 */
public class teste {
    public static void main(String[] args) {
        BeanPessoa p = new BeanPessoa();
        List<String> list = p.getEnum();
        for (String tipoPessoa : list) {
            System.out.println(tipoPessoa);    
        }
    }
    
}
