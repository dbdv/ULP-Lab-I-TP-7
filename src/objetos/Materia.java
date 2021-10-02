/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author daniel
 */
public class Materia {
    private int idMateria, anio;
    private String nombre;
    
    public Materia(int idMateria, String nombre, int anio){
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object m){
        return this.idMateria == ((Materia)m).idMateria;
    }
    
    @Override
    public int hashCode(){
        return idMateria * 2;
    }
}
