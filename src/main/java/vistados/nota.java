/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vistados;

import javax.swing.JOptionPane;
import vista.calculadora;
/**
 *
 * @author AM
*/

public class nota {
    public static void main (String[] args){
        String Nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        String Codigo = JOptionPane.showInputDialog("Ingresa tu codigo: ");
        double notaMatematica = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu definitiva: "));
        double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu definitiva: "));
        
        calculadora Def = new calculadora(Nombre, Codigo, notaMatematica, notaDesarrollo);
        
        double definitiva = Def.calcularDefinitiva();
        
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nID: " + Codigo + "\nNota Definitiva: " + definitiva);
    }
}