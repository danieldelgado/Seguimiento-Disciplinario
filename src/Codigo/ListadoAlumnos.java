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
public abstract class ListadoAlumnos {

    public static Alumno[] alumnos = new Alumno[200];

    public static boolean addAlumno(Alumno aux) {
        for (int i = 0; i < alumnos.length;i++){
            if(alumnos[i] == null){
                alumnos[i]=aux;
                return true;
            }
        }
        return false;
    }
    
    public static Alumno[] getLista(){
        return alumnos;
    }
}   
