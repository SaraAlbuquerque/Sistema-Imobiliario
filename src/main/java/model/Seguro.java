/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SARA
 */
public class Seguro {

    private int codSeguro;
    private String seguradora;
    private String tipo;
    private String descricao;
    private float valor;

    public Seguro(int codSeguro, String seguradora, String tipo, String descricao, float valor) {
        this.codSeguro = codSeguro;
        this.seguradora = seguradora;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodSeguro() {
        return codSeguro;
    }

    public void setCodSeguro(int codSeguro) {
        this.codSeguro = codSeguro;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Seguro{" + "codSeguro=" + codSeguro + ", seguradora=" + seguradora + ", tipo=" + tipo + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

}
