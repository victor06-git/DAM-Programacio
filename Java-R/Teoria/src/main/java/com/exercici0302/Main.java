package com.exercici0302;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu una paraula: ");
        String word = scanner.nextLine();

        System.out.print("Escriu un altre paraula: ");
        String word2 = scanner.nextLine();

        boolean start = word.startsWith(word2);
        System.out.println("La primera paraula comença amb la segona?" + " " + start);
        
        boolean ends = word.endsWith(word2);
        System.out.println("La primera paraula acaba amb la segona?" + " " + ends);

        scanner.close();
    }
}
