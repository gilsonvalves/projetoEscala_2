/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConnectionFactory;
import Model.EscalaGerada;
import Model.Operador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gilson
 */
public class EscalaDAO {
    private Connection connection;

    public EscalaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
     public void adcionar(EscalaGerada escalaGerada){
      String sql = "INSERT INTO escala VALUES(?,?,?,?,?,?)";
      try { 
            PreparedStatement stmt = connection.prepareStatement(sql); 
            
            stmt.setString(1, escalaGerada.getData());
            stmt.setString(2, escalaGerada.getHorario());
            //stmt.setString(3, escalaGerada.getOperador().getNome());
            //stmt.setString(4, escalaGerada.getSupervisor().getNome());
                       
            stmt.execute();
            stmt.close();
                 
      }catch(SQLException p) { 
             throw new RuntimeException(p);
             
        } 
     
  }
    
}
