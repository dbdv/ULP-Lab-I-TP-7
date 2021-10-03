/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.HashSet;

/**
 *
 * @author daniel
 */
public class Alumno {
    
    private int legajo;
    private String apellido, nombre;
    HashSet<Materia> materias = new HashSet<>();
    
    public Alumno(int legajo, String apellido, String nombre){
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    
    public void agregarMateria(Materia m){
        if(!materias.contains(m)){
            materias.add(m);
        }
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }
    
    @Override
    public boolean equals(Object m){
        return this.legajo == ((Alumno)m).legajo;
    }
    
    @Override
    public int hashCode(){
        return legajo * 2;
    }
}
