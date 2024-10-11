/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import util.IList;
import modelo.Locker;
import modelo.Objeto;

/**
 *
 * @author IVAN
 */
public class ControladorLocker {
    
    private Locker locker;

    public ControladorLocker(Locker locker) {
        this.locker = locker;
    }
    
    public IList getObjetos() {
        return locker.getObjetos();
    }
    
    public boolean guardarObjeto (Objeto objeto) throws RuntimeException {
        Objeto aux = buscarObjeto(objeto.getId());
        if(aux == null){
            return locker.guardarObjeto(aux);
        }
        return false;
    }
    
    public Objeto buscarObjeto(int id) {
        return locker.buscarObjeto(id);
    }
    
    public void editarObjeto(Objeto objeto) throws RuntimeException {
        locker.editarObjeto(objeto);
    }
    
    public void eliminarObjeto(int id) throws RuntimeException {
        locker.eliminarObjeto(id);
    }
    
    public void desocupar(){
        locker.setContraseña(null);
        locker.setId(0);
        locker.setNombre(null);
    }
}
