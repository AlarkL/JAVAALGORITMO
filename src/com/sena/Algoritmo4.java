package com.sena;

import javax.swing.*;
import java.util.Scanner;

public class Algoritmo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la altura");
        double h = sc.nextDouble() ;
        System.out.println("Digite radio");
        double R = sc.nextDouble();
        double pi = 3.1416;
        double Volumen = (pi * h * Math.pow(R,2) )/ 3;
        System.out.println("El resultado es: " + Volumen);
        System.out.println("Fin del programa");
    }
}
