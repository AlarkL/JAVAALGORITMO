package com.sena;

import javax.swing.*;

public class Algoritmo9 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese un número a");
        double x = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog("Ingrese un número b");
        double y = Double.parseDouble(b);
        double R;
        if (x+y > 100) {
            R = (Math.pow(x,2)+Math.pow(y,2));
        } else {
            R = 0;
        }
        JOptionPane.showMessageDialog(null, "Resultado es: " + R);
     }
}
