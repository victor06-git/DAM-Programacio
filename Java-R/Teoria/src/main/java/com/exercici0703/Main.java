package com.exercici0703;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Escriu un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        int max = numeros.get(0);
        int min = numeros.get(0);

        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Números: " + numeros);
        System.out.println("Valor màxim: " + max);
        System.out.println("Valor mínim: " + min);

        scanner.close();
    }
}