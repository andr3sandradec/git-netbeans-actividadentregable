package vista;

import javax.swing.JOptionPane;
import modelo.calculadora;

public class nota {

    public static void main(String[] args) {
        try {
            // Captura de datos del estudiante mediante diálogos de entrada
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante:", "Registro", JOptionPane.QUESTION_MESSAGE);
            if (nombre == null || nombre.trim().isEmpty()) return;

            String id = JOptionPane.showInputDialog(null, "Ingrese el ID o documento:", "Registro", JOptionPane.QUESTION_MESSAGE);
            if (id == null || id.trim().isEmpty()) return;

            String notadStr = JOptionPane.showInputDialog(null, "Ingrese la nota de Desarrollo (0.0 - 5.0):", "Registro", JOptionPane.QUESTION_MESSAGE);
            if (notadStr == null) return;
            double notaDesarrollo = Double.parseDouble(notadStr);

            String notamStr = JOptionPane.showInputDialog(null, "Ingrese la nota de Matemática (0.0 - 5.0):", "Registro", JOptionPane.QUESTION_MESSAGE);
            if (notamStr == null) return;
            double notaMatematica = Double.parseDouble(notamStr);

            // Instancia de la clase calculadora y despliegue de la nota
            calculadora est = new calculadora(id, nombre, notaDesarrollo, notaMatematica);
            est.mostrarNota();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos para las notas.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}