/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;



/**
 *
 * @author IVAN
 */
public class ListaEnlazada<S> implements IList<S> {
    
    private Nodo<S> primero;
    private int size;
    
    public ListaEnlazada() {
        this.primero = null;
        this.size = 0;
    }
    
    public int size(){
        return this.size;
    }
    
    public void add(S dato) {
        Nodo<S> nuevo = new Nodo(dato);
        if(primero == null){
            primero = nuevo;
        } else {
            Nodo<S> aux = primero;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        size++;
    }
    
    public void add(int index, S dato){
        if(index < 0 || index > size){// le quitamos el igual para permitir agragar al final de la lista
            throw new ArrayIndexOutOfBoundsException();
        }
        Nodo<S> nuevo = new Nodo(dato);
        if(index == 0){
            nuevo.siguiente = primero;//El nuevo Nodo se ubica detras del primero
            primero = nuevo;//Ahora Primero se vuelve el nuevo Nodo
        }else{
            Nodo<S> aux = primero;
            int contador = 0;
            while(contador < index-1){
                aux = aux.siguiente;
                contador++;
            }
            nuevo.siguiente = aux.siguiente;//EL nuevo mira al que le sigue a aux
            aux.siguiente = nuevo;// el auxilir mira al nuevo
        }
        size++;//Actualizar el tamaña
    }
    
    public S get(int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index == 0){
            return primero.dato;
        }else{
            Nodo<S> aux = primero;
            int contador = 0;
            while(contador < index) {
                aux = aux.siguiente;
                contador++;
            }
            return aux.dato;
        }
    }
    
    public void remove(int index) {
        //Validacion 
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        //Si indice es igual a 0 el primer puesto toma el valor del siguiente
        if(index == 0) {
            primero = primero.siguiente;
        }else{
            //si indice es diferente a 0 
            Nodo<S> aux = primero;
            int contador = 0;
            while(contador < index-1){
                aux = aux.siguiente;
                contador++;
            }
            aux.siguiente = aux.siguiente.siguiente;
        }
        size--;//Es importante restar 1 al tamaña cada que se elimina
    }
    
    public void remove(S datoE){
        if(datoE == null){
            throw new NullPointerException();
        }
        if(primero.dato.equals(datoE)){
            primero = primero.siguiente;
        }else{
            Nodo<S> aux = primero;
            Nodo<S> anterior = null;
            while(!aux.dato.equals(datoE)){                
                anterior = aux;
                aux = aux.siguiente;
            }
            anterior.siguiente = anterior.siguiente.siguiente;
        }
        size--;
    }

    @Override
    public void add(S dato, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
