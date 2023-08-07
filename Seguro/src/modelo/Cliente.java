/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alunolab08
 */
public class Cliente {
    private String nome;
    private String CPF;
    private Seguro[] assegurador;

    public Seguro[] getAssegurador() {
        return assegurador;
    }

    public void setAssegurador(Seguro[] assegurador) {
        this.assegurador = assegurador;
    }
    
    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
