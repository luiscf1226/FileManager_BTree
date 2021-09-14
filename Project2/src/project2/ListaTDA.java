/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.ArrayList;

/**
 *
 * @author Luis Carlos Flores
 */
public abstract class ListaTDA {
    protected ArrayList<String>ListaPila=new ArrayList(); 
    protected ArrayList<Persona>ListaCola=new ArrayList(); 
    public abstract void imprime();
    //cola
    public abstract void Pone(Persona p);
    public abstract void Quita();
    //pila
    public abstract void Mete(String t);
    public abstract void Saca();
    
}
