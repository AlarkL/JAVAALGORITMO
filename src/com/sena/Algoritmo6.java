package com.sena;

import javax.swing.*;

public class Algoritmo6 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Ingrese un número");
        int x = Integer.parseInt(s);
        String p = JOptionPane.showInputDialog("Ingrese un número");
        int y = Integer.parseInt(p);
        String d = JOptionPane.showInputDialog("Ingrese un número");
        int z = Integer.parseInt(d);
        int R = (x + y) - z;
        JOptionPane.showMessageDialog(null,"Resultado de: ( "+s+" + "+p+" ) - "+d+" = "+R);
  }
}
