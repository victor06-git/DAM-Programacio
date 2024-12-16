package com.exercici0507;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Nen");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Adolescent");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Adult");
        } else if (edad >= 65) {
            System.out.println("Jubilat");
        } else {
            System.out.println("Edad no válida");
        }
        
        sc.close();
    }
}