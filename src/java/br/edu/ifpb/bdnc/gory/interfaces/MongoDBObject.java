/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.interfaces;

import org.bson.Document;
/**
 *
 * @author JuliermeH
 * @param <D>
 */
public interface MongoDBObject <D>{

    Document toDocument();
    D fromDocument(Document doc);
    
}
