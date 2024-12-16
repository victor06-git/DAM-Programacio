package com.exercici0504;

import java.util.Scanner;

public class Main {

    public static float minOfThree(float a, float b, float c) {
        float resultat = (a > b) ? // a és més gran que b?
                        ((b > c) ? c : b) : // Cert
                        ((a > c) ? c : a); // Fals
        return resultat;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escriu el primer número: ");
        float a = scanner.nextFloat();

        System.out.print("Escriu el segon número: ");
        float b = scanner.nextFloat();

        System.out.print("Escriu el tercer número: ");
        float c = scanner.nextFloat();

        System.out.println(minOfThree(a, b, c));
        
        scanner.close();
    }
}
