/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.dao.bd;

import br.edu.ifpb.bdnc.gory.entidade.Pagina;
import br.edu.ifpb.bdnc.gory.interfaces.DAOFactoryIn;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

import javax.persistence.PersistenceException;

/**
 *
 * @author JuliermeH
 */
public class CassandraDAO implements DAOFactoryIn{

    Cluster cluster;
    Session session;
    
    public CassandraDAO(){
        String serverIP = "127.0.0.1";
        String keyspace = "gory";

        cluster = Cluster.builder()
                .addContactPoints(serverIP)
                .build();
        System.out.println("conectado");
        
        session = cluster.connect(keyspace);
    }

    @Override
    public boolean criaPagina(Pagina p) throws PersistenceException {
        int id = p.getID();
        String titulo = p.getTitulo();
        String autor = p.getAutor();
        String conteudo = p.getConteudo();
        String data = p.getData();
        String cql = "INSERT INTO gory.Pagina (id, titulo, autor, conteudo, data) " +
                "VALUES (" + id + "," + titulo + "," + autor + ","
                + conteudo + "," + data + ")";
        System.out.println("Passou aqui");
        session.execute(cql);
        return true;
    }

    @Override
    public Pagina lePagina(int id) throws PersistenceException {
        String cql = "SELECT titulo,autor,conteudo,data FROM Pagina WHERE id=" + id;
        ResultSet result = session.execute(cql);
        Pagina pagina = (Pagina) result;
        return pagina;
    }
    
}
