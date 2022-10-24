package com.sena;

import javax.swing.*;
import java.util.Scanner;

public class Algoritmo5 {
    public static void main(String[] args) {
        /*  Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese un dato");
          int x = sc.nextInt();*/
        //JOptionPane.showInputDialog("Ingrese un dato");
        String s = JOptionPane.showInputDialog("Aloha");
        JOptionPane.showMessageDialog(null,s);
        int x = Integer.parseInt(s);
        if (x==0)
        JOptionPane.showMessageDialog(null,"tipo int "+x);
    }
}
