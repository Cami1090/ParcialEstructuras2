/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import modelo.Persona;

/**
 *
 * @author Valentina
 */
public class Nodo {
    
    Persona dato;
    Nodo siguiente;

    public Nodo(Persona dato) {// no existe nodo sin dato, por eso el constructor se ve en la obligacion de un dato
        this.dato = dato;
        this.siguiente = null;
    }
    
    
    
}
