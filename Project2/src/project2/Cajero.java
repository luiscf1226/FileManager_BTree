/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Luis Carlos Flores
 */
public class Cajero {
    Pila p;
    boolean vacio;
    int num;
    Persona persona;
    String tipo;
    
    public Cajero() {
    }

    public Cajero(Pila p, boolean vacio, int num, Persona persona) {
        this.p = p;
        this.vacio = vacio;
        this.num = num;
        this.persona = persona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pila getP() {
        return p;
    }

    public void setP(Pila p) {
        this.p = p;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
            
}
