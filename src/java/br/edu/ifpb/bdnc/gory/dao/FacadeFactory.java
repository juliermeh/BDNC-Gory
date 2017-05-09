/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.dao;

import br.edu.ifpb.bdnc.gory.interfaces.FacadeIn;

/**
 *
 * @author Julierme Heinstein
 */
public class FacadeFactory{
    public static FacadeIn criarFacadeFactory() {
        return new Facade();
    }
}
