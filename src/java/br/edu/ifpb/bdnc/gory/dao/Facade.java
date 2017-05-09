/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.dao;

import br.edu.ifpb.bdnc.gory.entidade.Pagina;
import br.edu.ifpb.bdnc.gory.interfaces.FacadeIn;

/**
 *
 * @author Julierme Heinstein
 */
public class Facade implements FacadeIn{

    @Override
    public void novaPagina(int bd,int id, String titulo, String autor, String conteudo, String data) {
        Pagina pagina = new Pagina(id,titulo,autor,conteudo,data);
        DAOFactory.criarFactory(bd).criaPagina(pagina);
        System.out.println("Nova página criada");
    }

    @Override
    public String lePagina(int bd,int id) {
        Pagina pg = DAOFactory.criarFactory(bd).lePagina(id);
        System.out.println("Página lida");
        return pg.toString();
    }

}
