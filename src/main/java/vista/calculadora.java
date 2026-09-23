/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.JOptionPane;
/**
 *
 * @author AM
 */
public class calculadora{

    private String id;
    private String nombre;
    private double notaDesarollo;
    private double notaMatematica;
    private double definitiva;
    private String aprobo;

    public calculadora(String id, String nombre, double notad, double notam) {
        this.id = id;
        this.nombre = nombre;
        this.notaDesarollo = notad;
        this.notaMatematica = notam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaDesarollo() {
        return notaDesarollo;
    }

    public void setNotaDesarollo(double notaDesarollo) {
        this.notaDesarollo = notaDesarollo;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double calcularDefinitiva() {
        definitiva = notaMatematica * 0.4 + notaDesarollo * 0.6;
        return definitiva;
    }

    public void mostrarNota() {
        JOptionPane.showMessageDialog(null, "nombre: " + nombre + "\nid: " + id + "\nNota Definitiva:" + definitiva + "\n¿Aprobo?: "+ aprobo);
    }
}
