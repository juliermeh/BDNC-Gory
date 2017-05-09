/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.interfaces;

/**
 *
 * @author Julierme Heinstein
 */
public interface FacadeIn {
    public void novaPagina(int bd,int id,String titulo,String autor,String conteudo,String data);
    public String lePagina(int bd,int id);
}
