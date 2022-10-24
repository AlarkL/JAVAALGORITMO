package com.sena;

import javax.swing.*;

public class Algoritmo10 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese un número de 1000 a 10000");
        double x = Double.parseDouble(a);
        if (x >= 1000 && x <= 10000) {
            JOptionPane.showMessageDialog(null, "su número es: "+x);
        } else {
            JOptionPane.showMessageDialog(null, "El número seleccionado no es válido");
        }

    }
}
