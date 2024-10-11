/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Locker;
import util.IList;

/**
 *
 * @author IVAN
 */
public class ControladorPrincipal {
    
    private Locker[][] lockers;
   

    public ControladorPrincipal() {
        lockers = new Locker[3][5];
        initLockers();
    }
    
     private void initLockers() {
        for (int i = 0; i < lockers.length; i++) {
            for (int j = 0; j < lockers[i].length; j++) {
                Locker locker = new Locker(0, null, null);
                lockers[i][j] = locker;
            }
        }
    }
     
     public boolean validarLocker(int id) {
        for (int i = 0; i < lockers.length; i++) {
            for (int j = 0; j < lockers[i].length; j++) {
                if (lockers[i][j].getId() == id) {
                    return false;
                }
            }
        }
        return true;
    }
     
     public Locker entregarLocker(int fila, int columna) {
        return lockers[fila][columna];
    }
    
}
