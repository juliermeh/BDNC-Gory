/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.entidade;

import java.io.Serializable;
import org.bson.Document;

/**
 *
 * @author JuliermeH
 */
public class Pagina implements Serializable {
    /* Atributos da classe bean Pagina */
    private int id;
    private String titulo;
    private String conteudo;
    private String autor;
    private String data;
    
    /* Construtor Default */
    public Pagina(){
    }
    
    /* Contrutor com todos os atributos */
    public Pagina(int id, String titulo, String autor, String conteudo, String data){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.conteudo = conteudo;
        this.data = data;
    }
    
    /* Getters e Setters de cada atributo */
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getConteudo(){
        return this.conteudo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getData(){
       return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    
    @Override
    public String toString(){
        return "Pagina{" + "id=" + id + ", titulo=" + titulo + ", conteudo=" + conteudo
                + ", autor=" + autor + ", data=" + data + '}';
    }
    
    public Document toDocument(){
        Document doc = new Document();
        doc.append("_id", id);
        doc.append("titulo", titulo);
        doc.append("autor", autor);
        doc.append("conteudo", conteudo);
        doc.append("data", data);
        
        return doc;
    }
    
    public Pagina fromDocument(Document doc){
        
        id = doc.getInteger("_id");
        titulo = doc.getString("titulo");
        autor = doc.getString("autor");
        conteudo = doc.getString("conteudo");
        data = doc.getString("data");
        Pagina pagina = new Pagina(id,titulo,autor,conteudo,data);
        return pagina;
    }
}
