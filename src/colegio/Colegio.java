/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import javax.swing.JOptionPane;
import objetos.*;

/**
 *
 * @author daniel
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia inglesI = new Materia(00, "Inglés", 1), matematica = new Materia(11, "Matemáticas", 1), laboratorioI = new Materia(22, "Laboratorio 1", 1);
        
        Alumno lopezMartin = new Alumno(1001, "Lopez", "Martin"), martinezBrenda = new Alumno(1002, "Martinez", "Brenda");
        
        lopezMartin.agregarMateria(inglesI);
        lopezMartin.agregarMateria(matematica);
        lopezMartin.agregarMateria(laboratorioI);
 
        martinezBrenda.agregarMateria(inglesI);
        martinezBrenda.agregarMateria(matematica);
        martinezBrenda.agregarMateria(laboratorioI);
        martinezBrenda.agregarMateria(laboratorioI);
        
        JOptionPane.showMessageDialog(null, "El alumno "+lopezMartin.getNombre()+" "+lopezMartin.getApellido()+" está inscripto a "+lopezMartin.cantidadMaterias()+" materias.\n"+"La alumna "+martinezBrenda.getNombre()+" "+martinezBrenda.getApellido()+" está inscripta a "+martinezBrenda.cantidadMaterias()+" materias.");
        
    }
    
}
