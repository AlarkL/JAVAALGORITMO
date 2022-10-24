package com.sena;

import javax.swing.*;

public class Algoritmo7 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese un número a");
        double x = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog("Ingrese un número b");
        double y = Double.parseDouble(b);
        String c = JOptionPane.showInputDialog("Ingrese un número c");
        double z = Double.parseDouble(c);
        double R = Math.sqrt((Math.pow(x,2)+Math.pow(y,2))/(2*x*z));
        JOptionPane.showMessageDialog(null,"Resultado es: "+R);


    }

}
