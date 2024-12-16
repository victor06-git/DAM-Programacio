package com.exercici0503;

import java.util.Scanner;

public class Main {

    public static boolean  startsWithVowel(String word) {
        if ( word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") ||  word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")){
            System.out.println("EL teu nom comença per vocal");
            return true;
        } else {
            System.out.println("El teu nom comença per consonant");
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu el teu nom: ");
        String word = scanner.nextLine();

        System.out.println(startsWithVowel(word));

        scanner.close();




        
    }
}
