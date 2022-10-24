package com.sena;

import java.util.Scanner;

public class AlgoritmoTrapecio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la altura");
        double h = sc.nextDouble();
        System.out.println("Digite la longitud de la base mayor");
        double B = sc.nextDouble();
        System.out.println("Digite la longitud de la base menor");
        double b = sc.nextDouble();
        System.out.println("Digite los Lados");
        double L1 = sc.nextDouble();
        double L2 = sc.nextDouble();
        double A = ((B * b) * h) / 2;
        double P = (L1 + L2 + b + B);
        System.out.println("El área es: " + A);
        System.out.println("El perímetro es: " + P);
        System.out.println("Fin del programa");
    }
}
