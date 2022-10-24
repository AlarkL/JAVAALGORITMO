package com.sena;

import javax.swing.*;

public class Algoritmo3 {
    public static void main(String[] args) {
        int h = 10;
        int R = 4;
        double pi = 3.1416;
        double resultado3 = (pi * h * Math.pow(R,2) )/ 3;
        System.out.println("El resultado es: " + resultado3);
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado3);
        System.out.println("Fin del programa");
    }
}
