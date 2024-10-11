/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;//No se nos puede olvidar eliminar
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
    
    public Lista getPersonas() {
        return auditorio.getParticipantes();
    }
    
    public boolean guardarPersona (Objeto persona) throws RuntimeException {
        Objeto aux = buscarPersona(persona.getId());
        if(aux == null){
            return auditorio.guardarPersona(persona);
        }
        return false;
    }
    
    public Objeto buscarPersona(int id) {
        return auditorio.buscarPersona(id);
    }
    
    public void editarPersona(Objeto persona) throws RuntimeException {
        auditorio.editarPersona(persona);
    }
    
    public void eliminarPersona(int id) throws RuntimeException {
        auditorio.eliminarPersona(id);
    }
    
    public void borrarLista() {
        auditorio.borrarLista();
    }
    
    public void eliminarTema(){
        auditorio.setTema(null);
    }
}
