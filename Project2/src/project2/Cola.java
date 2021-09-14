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
public class Cola extends ListaTDA {
     public ArrayList<Persona> getLista() {
        return ListaCola;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.ListaCola = lista;
    }
    public void imprime(){
        for (int i = 0; i < ListaCola.size(); i++) {
            System.out.println(ListaCola.get(i).getNombre()+" , "+ListaCola.get(i).getTransaccion()+" ,");
        }
    }
    
    public void Pone(Persona p){
        ListaCola.add(p);
    }
    public void Quita(){
        ListaCola.remove(0);
    }
    public Persona agarrarPersona(int num){
        return ListaCola.get(num);
    }
    public boolean colaVacia(){
        
        if(ListaCola.isEmpty()==false){
            return false;
        }else {
            return true;
        }
    }
    //abstracccion
    public void Mete(String t){}
    public void Saca(){}
}
