/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;
import java.util.*;
/**
 *
 * @author mateo
 */
public class Alumno {
    int i = 0;
    String nombre;
    String apellido;
    int año;
    String curso;
    int edad;
    String comportamiento;
    public Observacion[] observaciones = new Observacion[20];
    

    public Alumno(String nombre, String apellido, int año, String curso, int edad, String comportamiento) {
        this.nombre = "Mateo";
        this.apellido = "Bossio";
        this.año = 5;
        this.curso = "C";
        this.edad = 16;
        this.comportamiento = "Regular";
    }

    public Alumno() {
    }
    
    public boolean addObservacion(Observacion obs){
        for (int i=0; i<observaciones.length;i++){
            if(observaciones[i]==null){
                observaciones[i]=obs;
                return true;
            }
        }
        return false;
    }

    public Observacion[] getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(Observacion[] observaciones) {
        this.observaciones = observaciones;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
    
    
    @Override
    public String toString() {
        String aux = "";
        aux = "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", año=" + año + ", curso=" + curso + ", edad=" + edad + ", comportamiento=" + comportamiento + '}';
        return aux;
    }
    
}
