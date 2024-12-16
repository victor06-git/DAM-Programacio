package com.exercici0304;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Frase en mayúscules: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());


        scanner.close();
    }
}
