package com.sena;

import java.util.Scanner;

public class AlgoritmoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite radio");
        double r = sc.nextDouble();
        double pi = 3.1416;
        double A = (pi * Math.pow(r,2) );
        double C = (pi * (r * 2));
        System.out.println("El área es: " + A);
        System.out.println("La circunferencia es: " + C);
        System.out.println("Fin del programa");
    }
}
