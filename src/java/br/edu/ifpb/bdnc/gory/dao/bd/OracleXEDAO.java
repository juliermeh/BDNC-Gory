/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.gory.dao.bd;

import br.edu.ifpb.bdnc.gory.entidade.Pagina;
import br.edu.ifpb.bdnc.gory.interfaces.DAOFactoryIn;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 *
 * @author Julierme Heinstein
 */
public class OracleXEDAO implements DAOFactoryIn{
    
    String url = "jdbc:oracle:thin:@//localhost:1521";
    String username = "sys as sysdba";
    String password = "nightwish";
    Connection connection;

    public OracleXEDAO() {
        System.out.println("Conexao");
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(OracleXEDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean criaPagina(Pagina p) throws PersistenceException {
        System.out.println("Passou aqui");
        int id = p.getID();
        String titulo = p.getTitulo();
        String autor = p.getAutor();
        String conteudo = p.getConteudo();
        String data = p.getData();
        String sql = "INSERT INTO Pagina VALUES ("+id+","+titulo+","+autor+","+conteudo+","+data+");";
        try{
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e){
            throw new PersistenceException(e);
        } return true;
    }

    @Override
    public Pagina lePagina(int id) throws PersistenceException {
        String sql = "select * from Pagina where id=" + id;
        Pagina pag = null;
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet rset = statement.executeQuery(sql);
            if(rset.next()){
                pag = rset.getObject(1,Pagina.class);
            }
        } catch (SQLException e) {
            throw new PersistenceException(e);
        } return pag;
    }
    
}
