/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.GatoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cleoc
 */
public class GatoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<GatoDTO> lista = new ArrayList<>();

    public void cadastrarGato(GatoDTO objgatodto) {

        String sql = "insert into gato  (nomeGato, gatoFemea, idadeGato, crGato, corGato, racaGato, quantidade_filhos, nivel_atividade, pedigree, obs) values (?, ?, ?, ?, ?, ?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objgatodto.getNome());
            pstm.setBoolean(2, objgatodto.isGatoFemea());
            pstm.setInt(3, objgatodto.getIdade());
            pstm.setInt(4, objgatodto.getcR());
            pstm.setString(5, objgatodto.getCor());
            pstm.setString(6, objgatodto.getRaça());
            pstm.setInt(7, objgatodto.getQuantidadeFilhos());
            pstm.setString(8, objgatodto.getNivelAtividade());
            pstm.setBoolean(9, objgatodto.isPedigree());
            pstm.setString(10, objgatodto.getObs());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Gato DAO Cadastrar:" + erro);
        }

    }

    public ArrayList<GatoDTO> PesquisarGato() {
        String sql = "select nomeGato, racaGato, idGato from gato";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                GatoDTO objGatoDTO = new GatoDTO();
                objGatoDTO.setIdGato(rs.getInt("idGato"));
                objGatoDTO.setNome(rs.getString("nomeGato"));
                objGatoDTO.setRaça(rs.getString("racaGato"));

                lista.add(objGatoDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "GatoDAO Pesquisar:" + erro);
        }
        return lista;
    }

    public void alterarGato(GatoDTO objgatodto) {
        String sql = "UPDATE gato SET nomeGato = ?, racaGato = ? WHERE idGato = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objgatodto.getNome());
            pstm.setString(2, objgatodto.getRaça());
            pstm.setInt(3, objgatodto.getIdGato());
            /*
             pstm.setBoolean(2, objgatodto.isGatoFemea());
             pstm.setInt(3, objgatodto.getIdade());
             pstm.setInt(4, objgatodto.getcR());
             pstm.setString(5, objgatodto.getCor());
             */

            // pstm.setInt(7, objgatodto.getQuantidadeFilhos());
            // pstm.setString(8, objgatodto.getNivelAtividade());
            // pstm.setBoolean(9, objgatodto.isPedigree());
            // pstm.setString(10, objgatodto.getObs());
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Gato DAO Cadastrar:" + erro);
        }

    }

    public void excluirGato(GatoDTO objgatodto) {
        String sql = "DELETE from gato where idGato = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objgatodto.getIdGato());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Gato DAO Excluir:" + erro);
        }

    }

    public ResultSet listarGatos() {
        String sql = "select nomeGato from gato ORDER BY nomeGato";
        conn = new ConexaoDAO().conectaBD();
        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Listar Gatos GATOSDAO: " + erro.getMessage());
            return null;
        }

    }

    public ArrayList<GatoDTO> merge(ArrayList<GatoDTO> lista, int esq, int meio, int dir) {
        int i, j, k;
        int a_tam = meio - esq + 1;
        int b_tam = dir - meio;
        
        ArrayList<GatoDTO> a = new ArrayList<GatoDTO>();
        ArrayList<GatoDTO> b = new ArrayList<GatoDTO>();

        for (i = 0; i < a_tam; i++) {
            a.add(lista.get(i + esq));
        }

        for (i = 0; i < b_tam; i++) {
            b.add(lista.get(i + meio+1));
        }

        i = 0;
        j = 0;

        for (k = esq; k <= dir; k++) {
            if (i == a_tam) {
                lista.set(k, b.get(j++));
            } else {
                if (j == b_tam) {
                    lista.set(k, a.get(i++));
                } else {
                    
                    if (a.get(i).getIdGato() > b.get(j).getIdGato()) {
                        lista.set(k, a.get(i++));
                    } else {
                        lista.set(k, b.get(j++));
                    }
                }
            }
        }
        return lista;
    }

    public ArrayList<GatoDTO> ordenaDadosGato(ArrayList<GatoDTO> lista, int esq, int dir) {
        if (esq == dir) {
            return null;
        }

        int meio = (esq + dir) / 2;
        System.out.println("meio: "+meio);
        ordenaDadosGato(lista, esq, meio);
        ordenaDadosGato(lista, meio + 1, dir);
        lista = merge(lista, esq, meio, dir);
        return lista;

    }

}
