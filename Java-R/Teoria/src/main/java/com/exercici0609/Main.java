package com.exercici0609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escriu una frase: ");
        String text = scanner.nextLine();

        String[] split = text.split("");
        String join = String.join("-", split);

        System.out.println("Resultat: " + join);

        scanner.close();
    }
}