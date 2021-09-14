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
public class Pila extends ListaTDA {
     public ArrayList<String> getLista() {
        return ListaPila;
    }

    public void setLista(ArrayList<String> lista) {
        this.ListaPila = lista;
    }
    public void Mete(String t){
        this.ListaPila.add(t);
    }
    public void Saca(){
        int pos=ListaPila.size();
        this.ListaPila.remove(pos);
    }
    public void imprime(){
        for (int i = 0; i < ListaPila.size(); i++) {
            System.out.println(ListaPila.get(i)+" , ");
        }
    }
    //permite abstraccion
    public void Pone(Persona p){}
    public void Quita(){}
}
