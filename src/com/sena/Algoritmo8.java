package com.sena;

import javax.swing.*;

public class Algoritmo8 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese un número a");
        double x = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog("Ingrese un número b");
        double y = Double.parseDouble(b);
        String c = JOptionPane.showInputDialog("Ingrese un número c");
        double z = Double.parseDouble(c);
        double R;
        if (x > 100) {
             R = (x + y + z);
        } else {
            R = (x - y - z);
        }
        JOptionPane.showMessageDialog(null, "Resultado es: " + R);


    }
}