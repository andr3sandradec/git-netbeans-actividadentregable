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
public class calculadora {

    private String id;
    private String nombre;
    private double notaDesarrollo; 
    private double notaMatematica;
    private double definitiva;
    private String aprobo;

    public calculadora(String id, String nombre, double notad, double notam) {
        this.id = id;
        this.nombre = nombre;
        this.notaDesarrollo = notad;
        this.notaMatematica = notam;
        this.calcularDefinitiva();
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

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
        this.calcularDefinitiva();
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
        this.calcularDefinitiva();
    }

    public double calcularDefinitiva() {
        definitiva = (notaMatematica * 0.4) + (notaDesarrollo * 0.6);
        if (definitiva >= 3.0) {
            aprobo = "Sí";
        } else {
            aprobo = "No";
        }
        return definitiva;
    }

    public void mostrarNota() {
        String mensaje = String.format(
            "--- REPORTE DE NOTAS ---\n\n" +
            "Nombre: %s\n" +
            "ID: %s\n" +
            "Nota Desarrollo (60%%): %.2f\n" +
            "Nota Matemática (40%%): %.2f\n" +
            "Nota Definitiva: %.2f\n" +
            "¿Aprobó?: %s",
            nombre, id, notaDesarrollo, notaMatematica, definitiva, aprobo
        );

        JOptionPane.showMessageDialog(null, mensaje, "Resultado Académico", JOptionPane.INFORMATION_MESSAGE);
    }
}