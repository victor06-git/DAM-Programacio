package com.exercici0502;

import java.util.Scanner;

public class Main {
    public static  float  maxOfThree(float a, float b, float c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu un número: ");
        float a = scanner.nextFloat();

        System.out.print("Escriu un altre número: ");
        float b = scanner.nextFloat();

        System.out.print("Escriu un tercer número: ");
        float c = scanner.nextFloat();

        float resultado = maxOfThree(a, b, c);
        System.out.println(resultado);


        scanner.close();
        
    }
}
