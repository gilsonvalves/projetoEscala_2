/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConnectionFactory;
import Model.Operador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gilson
 */
public class OperadorDAO {
    private Connection connection;

    public OperadorDAO() {
    this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adcionar(Operador operador){
      String sql = "INSERT INTO operador VALUES(?,?,?,?,?,?)";
      try { 
            PreparedStatement stmt = connection.prepareStatement(sql); 
            
            //stmt.setInt(1, operador.getId());
            //stmt.setString(2, operador.getNome());
            //stmt.setString(3, operador.getIlha());
            //stmt.setString(4, operador.getFerias());
            //stmt.setString(5, operador.getHorario());
            //stmt.setInt(6, operador.getGrupo());
                       
            stmt.execute();
            stmt.close();
                 
      }catch(SQLException p) { 
             throw new RuntimeException(p);
             
        } 
     
  }
    /* public void excluir(Operador operador){
          
            //String sql = "DELETE FROM operador where id ='"+operador.getId()+"'";
            
           try{
            //PreparedStatement stmt = connection.prepareStatement(sql);
            //stmt.execute();
            //stmt.close();
        
           }catch(SQLException u){
            
            throw new RuntimeException("erro ao excluir: "+u.getMessage());
        }
      }
    */
    /*public void alterar(Operador operador){
        
   String sql = "update operador set nome=?, ilha=?, ferias=?, horarios= ?, grupo= ?, grupo=?, where id=? ";            
  try { 
            PreparedStatement stmt = connection.prepareStatement(sql); 
            stmt.setString(1, operador.getNome());
            stmt.setString(2, operador.getIlha());
            stmt.setString(3, operador.getFerias());
            stmt.setString(4,operador.getHorario());
            stmt.setInt(5,operador.getGrupo());
            stmt.setInt(6,operador.getId());
            stmt.executeUpdate();
            stmt.close();
                 
      }catch(SQLException p) { 
             JOptionPane.showMessageDialog(null,"Erro ao alterar"+p);
             System.out.print(p);
             
        } 
      
    }*/
     
     
     
    
}
