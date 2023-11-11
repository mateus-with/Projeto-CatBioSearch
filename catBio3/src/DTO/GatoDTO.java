/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import Controle.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cleoc
 */
public class GatoDTO {

    private String nome;
    private int idade;
    private int cR;
    private boolean gatoFemea;
    private String cor;
    private String raça;
    private int quantidadeFilhos;
    private String nivelAtividade;
    private boolean pedigree;
    private String obs;
    private int idGato;

    Conexao con = new Conexao();

    public GatoDTO() {
        this("", 0, 0, "", false, "", 0, "", false, "");
    }

    public GatoDTO(String nome, int idade, int cR, String cor, boolean gatoFemea, String raça, int quantidadeFilhos, String nivelAtividade, boolean pedigree, String obs) {
        this.nome = nome;
        this.idade = idade;
        this.cR = cR;
        this.cor = cor;
        this.gatoFemea = gatoFemea;
        this.raça = raça;
        this.quantidadeFilhos = quantidadeFilhos;
        this.nivelAtividade = nivelAtividade;
        this.pedigree = pedigree;
        this.obs = obs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getcR() {
        return cR;
    }

    public void setcR(int cR) {
        this.cR = cR;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isGatoFemea() {
        return gatoFemea;
    }

    public void setGatoFemea(boolean gatoFemea) {
        this.gatoFemea = gatoFemea;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(int quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public String getNivelAtividade() {
        return nivelAtividade;
    }

    public void setNivelAtividade(String nivelAtividade) {
        this.nivelAtividade = nivelAtividade;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the idGato
     */
    public int getIdGato() {
        return idGato;
    }

    /**
     * @param idGato the idGato to set
     */
    public void setIdGato(int idGato) {
        this.idGato = idGato;
    }
    

}
