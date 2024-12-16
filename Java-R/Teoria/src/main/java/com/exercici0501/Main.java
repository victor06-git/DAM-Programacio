package com.exercici0501;

import java.util.Scanner;

public class Main {

    public static String MultipleOf3(float n) {
        float divide = n % 3;

        if (divide == 0) { // Funció per saber si es multiple de 3 
            return  "\"n is a multiple of 3\"";
        } else {
            return "\"n is not a multiple of 3\"";
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu un número: ");
        float n = scanner.nextFloat();

        System.out.println(MultipleOf3(n));

        scanner.close();
    }
}
