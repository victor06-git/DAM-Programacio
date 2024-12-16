package com.exercici0506;

import java.util.Scanner;

public class Main {
    public static float calculadora(char operacio, float a, float b) {
        switch (operacio) { 
            case '+':
                float suma = a + b;
                return suma;
            case '-':
                float resta = a - b;
                return resta;
            case '*':
                float multiplicacio = a * b;
                return multiplicacio;
            case '/':
                float divisio = a / b;
                if (b == 0) {
                    System.out.println("No es pot dividir per zero");
                    return -0;
                } else {
                    return divisio;
                }
            default:
                System.out.println("Error: Operació no vàlida");
                return -0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu un número: ");
        float a = scanner.nextFloat();

        System.out.print("Escriu un altre número: ");
        float b = scanner.nextFloat();

        System.out.print("Escull una operació (+, -, / o *): ");
        char operacio = scanner.next().charAt(0);
        
        System.out.println(calculadora(operacio, a, b));

        scanner.close();
        
    }
}
