/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import modelo.Locker;
import modelo.Persona;

/**
 *
 * @author Camilo
 */
public class Lista {
    
    private Nodo primero;
    private  int size;
    
    public Lista(){
        this.primero = null; 
        this.size = 0;
    }
    
    /*public void add(Participante dato){
        Nodo nuevo = new Nodo (dato);
        if(primero == null){
            primero = nuevo;
        }else {
            Nodo aux = primero;
            while(aux.siguiente!= null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        size++;
    }*/
    
    public void add(int index, Persona dato) {
        
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        
        Nodo nuevo = new Nodo(dato);
        if (index == 0) {
            nuevo.siguiente = primero; 
            primero = nuevo; 
        } else {
            Nodo aux = primero;
            int contador = 0;

            while (contador < index - 1) {
                aux = aux.siguiente;
                contador++;
            }

            nuevo.siguiente = aux.siguiente; 
            aux.siguiente = nuevo;
        }
        size++;
    }
    
    
    public Persona get(int index){
        
        if(index <0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        
        if(index == 0){
            return primero.dato;
        }else{
            Nodo aux = primero;
            int contador = 0;
            while(contador < index){
                aux = aux.siguiente;
                contador++;
            }
            return aux.dato;
        }
    }
    
    public boolean remove(int index) {
        
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }


        if (index == 0) {
            primero = primero.siguiente;
        } else {

            Nodo aux = primero;
            int contador = 0;
            while (contador < index - 1) {
                aux = aux.siguiente;
                contador++;
            }

            Nodo nodoAEliminar = aux.siguiente;
            aux.siguiente = nodoAEliminar.siguiente;
        }

        size--; 
        return true;
    }
    
    public int size(){
        return this.size;
    }
    
    public void clear() {
        primero = null; 
        size = 0;      
    }

    public boolean isEmpty() {
        return primero == null;
    }
}
