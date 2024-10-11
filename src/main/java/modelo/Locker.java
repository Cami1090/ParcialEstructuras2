/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import util.IList;
import util.ListaEnlazada;
import modelo.Objeto;

/**
 *
 * @author IVAN
 */
public class Locker {
    
    private int id;
    private String nombre;
    private String contraseña;
    private IList<Objeto> lista;

    public Locker(int id, String nombre, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.lista = new ListaEnlazada<>();
           
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public IList<Objeto> getObjetos() {
        return lista;
    }

    public boolean validarOcupado() {
        return !lista.isEmpty();
    }
    
    public Objeto buscarObjeto(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return lista.get(i);
            }
        }
        return null;
    }
    
  

    public boolean guardarObjeto(Objeto persona) {
        Objeto aux = buscarObjeto(persona.getId());
        if (aux == null) {
            lista.add(persona);
            return true;
        }
        return false;
    }

    public boolean editarObjeto(Objeto objeto) {
        Objeto aux = buscarObjeto(objeto.getId());
        if (aux != null) {
            aux.setNombre(objeto.getNombre());
            return true;
        }
        return false;
    }

    public boolean eliminarObjeto(int id) {
        Objeto aux = buscarObjeto(id);
        if (aux != null) {
            lista.remove(aux);
            return true;
        }
        return false;
    }
    
    public void borrarLista(){
        lista = new ListaEnlazada<>();
    }
}
