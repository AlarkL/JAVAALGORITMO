package com.sena;

import javax.swing.*;

public class Algoritmo11 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese un número de 0 a 10 o de 90 a 100");
        double x = Double.parseDouble(a);
        if (x >= 0 && x <= 10 || x >= 90 && x <= 100) {
            JOptionPane.showMessageDialog(null, "su número es: " + x);
        } else {
            JOptionPane.showMessageDialog(null, "El número seleccionado no es válido");
        }

    }
}