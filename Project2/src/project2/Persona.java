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
public class Persona {
    String nombre;
    int edad;
    int id;
    String transaccion;

    public Persona() {
    }

    public Persona(String nombre, int edad, int id, String transaccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.transaccion = transaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }
    
}
