package com.exercici0306;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu una paraula: ");
        String word = scanner.nextLine();
        
        System.out.print("Escriu un altre paraula: ");
        String word2 = scanner.nextLine();

        System.out.println("0123456789" + "|");

        String dreta = "%10s".formatted(word);
        System.out.println(dreta + "|");

        System.out.println("0123456789" + "|");


        String esquerre = "%-10s".formatted(word2);
        System.out.println(esquerre + "|");

        scanner.close();
    }
}
