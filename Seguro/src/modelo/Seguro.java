/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alunolab08
 */
public class Seguro {
    private float valor;
    private boolean vigencia;
    private Cliente propietario;
    private Cliente[] assegurado;


    public Seguro(float valor, boolean vigencia, Cliente propietario) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.propietario = propietario;
    }
        public Cliente[] getAssegurado() {
        return assegurado;
    }

    public void setAssegurado(Cliente[] assegurado) {
        this.assegurado = assegurado;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
   

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
}
