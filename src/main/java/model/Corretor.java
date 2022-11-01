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
public class Corretor extends Usuario {

    protected String creci;
    protected float salario;
    protected String pis;
    protected LocalDate admissao;

    public Corretor(String creci, float salario, String pis, LocalDate admissao, int codUsuario, String nome, String cpf, String rg, LocalDate nascimento, String endereco, String cep, String tel, String email) {
        super(codUsuario, nome, cpf, rg, nascimento, endereco, cep, tel, email);
        this.creci = creci;
        this.salario = salario;
        this.pis = pis;
        this.admissao = admissao;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    @Override
    public String toString() {
        return super.toString() + "creci=" + creci + ", salario=" + salario + ", pis=" + pis + ", admissao=" + admissao + '}';
    }
    
    
}
