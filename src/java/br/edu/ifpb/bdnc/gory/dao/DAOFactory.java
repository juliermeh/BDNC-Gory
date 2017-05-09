/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.dao;

import br.edu.ifpb.bdnc.gory.dao.bd.CassandraDAO;
import br.edu.ifpb.bdnc.gory.dao.bd.MongoDAO;
import br.edu.ifpb.bdnc.gory.dao.bd.OracleXEDAO;
import br.edu.ifpb.bdnc.gory.interfaces.DAOFactoryIn;

/**
 *
 * @author Julierme Heinstein
 */
public class DAOFactory {
    public static final int MONGO = 1;
    public static final int CASSANDRA = 2;
    public static final int ORACLE = 3;
    
    public static DAOFactoryIn criarFactory(int DBTypes){
        if(DBTypes==MONGO){
            System.out.println("Mongo escolhido");
            return (DAOFactoryIn) new MongoDAO();
        }
        if(DBTypes==CASSANDRA){
            System.out.println("Cassandra escolhido");
            return (DAOFactoryIn) new CassandraDAO();
        }
        if(DBTypes==ORACLE){
            System.out.println("Oracle escolhido");
            return (DAOFactoryIn) new OracleXEDAO();
        }
        return null;
    }
}
