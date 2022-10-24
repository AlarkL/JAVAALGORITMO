package com.sena;

import java.util.Scanner;

public class AlgoritmoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la altura");
        double h = sc.nextDouble();
        System.out.println("Digite la longitud de la base");
        double b = sc.nextDouble();
        System.out.println("Digite los Lados");
        double L1 = sc.nextDouble();
        double L2 = sc.nextDouble();
        double Area = (b * h) / 2;
        double Perimetro = (L1 + L2 + b);
        System.out.println("El área es: " + Area);
        System.out.println("El perímetro es: "+Perimetro);
        System.out.println("Fin del programa");
    }
}
