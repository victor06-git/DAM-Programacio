package com.exercici0704;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("Esciu un nom: ");
        while (true) {
            String nombre = scanner.nextLine();
            if (nombre.equals("sortir")){
                break;
            } else {
                nombres.add(nombre);
            }
        }
        int cnt = 0;
        for (String nom : nombres) {
            String vowels = "aeiouàáèéìíòóùúäëïöü";
            String first = nom.substring(0, 1).toLowerCase();
            if (vowels.indexOf(first) != -1){
                cnt++;
            }
        }
        System.out.println("Lista: "+nombres);
        System.out.println("Cnt: "+cnt);;
        scanner.close();
        
    }
}