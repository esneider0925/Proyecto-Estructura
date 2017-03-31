/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Miguel
 */
public class Nodo {
    
    public Nodo ant;
    public int dato;
    public Nodo sig;
    public Nodo lista;
    
    public Nodo(){
        ant = null;
        sig = null;
    }
    
    public Nodo(int n){
        dato = n;
        ant = null;
        sig = null;
    }
}
