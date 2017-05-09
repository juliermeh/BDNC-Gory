/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.jsp;

import br.edu.ifpb.bdnc.gory.dao.FacadeFactory;
import br.edu.ifpb.bdnc.gory.interfaces.FacadeIn;

/**
 *
 * @author Julierme Heinstein
 */
public class Teste {
    int database = 3;
    private final FacadeIn facade;
    
    public Teste(){
        facade = FacadeFactory.criarFacadeFactory();
    }
    public void execute(){
        //HttpSession session = req.getSession(true);
        facade.novaPagina(database,1,"Hu", "Arm", "1234567890", "2017-05-08");
        //facade.lePagina(database,1);
    }
    
}