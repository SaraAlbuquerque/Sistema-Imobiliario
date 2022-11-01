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
public class Cliente extends Usuario {
    protected LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro, int codUsuario, String nome, String cpf, String rg, LocalDate nascimento, String endereco, String cep, String tel, String email) {
        super(codUsuario, nome, cpf, rg, nascimento, endereco, cep, tel, email);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return super.toString() + "dataCadastro=" + dataCadastro + '}';
    }
    
    
}
