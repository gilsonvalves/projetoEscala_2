/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gilson.alves
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
    try{ 
       return DriverManager.getConnection("jdbc:mysql://localhost:3306/teste","root","");
        
        
    }catch(SQLException e){
        
        throw new RuntimeException(e);
    }
    
    
    }
    
}
