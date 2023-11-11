/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import Controle.Conexao;

/**
 *
 * @author cleoc
 */
public class DonoDTO {
    
    private String nomeDono;
    private String CPF;
    private String telefone;
    private String email;
    private String endereco;
    private String sexo;
    private String estado;
    private String cidade;

    Conexao con = new Conexao();
    
    public DonoDTO() {
        this("","","","","","","","");
    }
    
    public DonoDTO(String nomeDono, String CPF, String telefone, String email, String endereco, String sexo, String estado, String cidade) {
        this.nomeDono = nomeDono;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.sexo = sexo;
        this.estado = estado;
        this.cidade = cidade;
    }


    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
}
