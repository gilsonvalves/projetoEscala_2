/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gilson
 */
public class TestaConexao {
    
    
    public static void main(String[] args) throws SQLException{
        
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conectado");
        connection.close();
        JOptionPane.showMessageDialog(null,"Conectado ao Sistema aguarde!!!!!!");
        JOptionPane.showMessageDialog(null, "Conectado com Sucesso");
                
    }
}
