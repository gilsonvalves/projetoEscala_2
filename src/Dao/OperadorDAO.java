/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Conexao.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author gilson.alves
 */
public class OperadorDAO {
    private Connection connection; 

    public OperadorDAO() {
       this.connection = new ConnectionFactory().getConnection();
    }
    
    
    
}
