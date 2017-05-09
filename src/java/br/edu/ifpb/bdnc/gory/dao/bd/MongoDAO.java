/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.dao.bd;

import br.edu.ifpb.bdnc.gory.entidade.Pagina;
import br.edu.ifpb.bdnc.gory.interfaces.DAOFactoryIn;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import javax.persistence.PersistenceException;
import org.bson.Document;
/**
 *
 * @author JuliermeH
 */
public class MongoDAO implements DAOFactoryIn {
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;
    
    public MongoDAO(){
        mongoClient = new MongoClient("localhost", 27017);
        database = mongoClient.getDatabase("gory");
        collection = database.getCollection("Pagina");
    }

    @Override
    public boolean criaPagina(Pagina p) throws PersistenceException {
        collection.insertOne(p.toDocument());
        return true;
    }
    
    @Override
    public Pagina lePagina(int id) throws PersistenceException{
        MongoCursor<Document> cursor = collection.find(eq("_id",id)).iterator();
        System.out.println("Passou aqui");
        Pagina pagina = null;
        if(cursor.hasNext()){
            pagina = new Pagina().fromDocument(cursor.next());
        }
        System.out.println("Passou aqui");
        return pagina;
    }

}
