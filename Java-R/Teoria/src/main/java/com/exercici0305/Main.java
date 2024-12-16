package com.exercici0305;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Escriu una paraula a canviar: ");
        String word = scanner.nextLine();
        
        System.out.print("Escriu la nova paraula: ");
        String new_word = scanner.nextLine();
        
        System.out.print("Escriu una frase: ");
        String frase = scanner.nextLine();

        String substituida = frase.replace(word, new_word);
        System.out.println(substituida);


        scanner.close();
    }
}