/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.interfaces;

import br.edu.ifpb.bdnc.gory.entidade.Pagina;
import javax.persistence.PersistenceException;

/**
 *
 * @author JuliermeH
 */
public interface DAOFactoryIn {
    public boolean criaPagina(Pagina p) throws PersistenceException;
    public Pagina lePagina(int id) throws PersistenceException;
}
