/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author SARA
 */
public abstract class Usuario {
    protected int codUsuario;
    protected String nome;
    protected String cpf;
    protected String rg;
    protected LocalDate nascimento;
    protected String endereco;
    protected String cep;
    protected String tel;
    protected String email;

    public Usuario(int codUsuario, String nome, String cpf, String rg, LocalDate nascimento, String endereco, String cep, String tel, String email) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.tel = tel;
        this.email = email;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codUsuario=" + codUsuario + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", nascimento=" + nascimento + ", endereco=" + endereco + ", cep=" + cep + ", tel=" + tel + ", email=" + email;
    }
    
    
    
}
