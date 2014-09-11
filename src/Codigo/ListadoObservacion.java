/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;


/**
 *
 * @author mateo
 */
public abstract class ListadoObservacion {
    
    public static Observacion[] observaciones = new Observacion[200];
    
    public static boolean addObservacion(Observacion aux) {
        for (int i = 0; i < observaciones.length;i++){
            if(observaciones[i] == null){
                observaciones[i]=aux;
                return true;
            }
        }
        return false;
    }
    
}

