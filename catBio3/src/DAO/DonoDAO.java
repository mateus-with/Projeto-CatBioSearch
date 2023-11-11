/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DonoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author cleoc
 */
public class DonoDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarDono(DonoDTO objdonodto) {

        String sql = "insert into dono (nomeDono, cpfDono, enderecoDono, telefoneDono, emailDono, sexoDono, estadoDono, cidadeDono) values (?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objdonodto.getNomeDono());
            pstm.setString(2,objdonodto.getCPF());
            pstm.setString(3,objdonodto.getEndereco());
            pstm.setString(4,objdonodto.getTelefone());
            pstm.setString(5,objdonodto.getEmail());
            pstm.setString(6,objdonodto.getSexo());
            pstm.setString(7,objdonodto.getEstado());
            pstm.setString(8,objdonodto.getCidade());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Dono DAO" + erro);

        }
    }

}
