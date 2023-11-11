/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author cleoc
 */

import java.sql.*;
import javax.swing.*;


public class ConexaoDAO {
    public Connection conectaBD() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/projetocatbiosearch?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " ConexaoDAO " +  erro.getMessage());
        }
        return conn;
    }
    
}
