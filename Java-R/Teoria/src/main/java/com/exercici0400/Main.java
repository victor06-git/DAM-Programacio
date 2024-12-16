package com.exercici0400;

import java.util.Scanner;

public class Main {

    public static String concatenarparaules(String a, String b) {
        return a + b;

    }
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu una paraula: ");
        String word1 = scanner.nextLine();
        System.out.print("Escriu un altre paraula: ");
        String word2 = scanner.nextLine();

        System.out.println("Concatenació: " + concatenarparaules(word1, word2));

        scanner.close();
    }
}
