package com.exercici0705;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> noms = new ArrayList<>();

        System.out.print("Escriu un nom (o \"sortir\"): ");
        String nom = scanner.nextLine();

        while(!nom.equals("sortir")){
            noms.add(nom);
            System.out.print("Escriu un nom (o \"sortir\"): ");
            nom = scanner.nextLine();
        }

        System.out.println("Noms introduïts: " + noms);
        String mesLlarg = noms.get(0);

        for (String llarg : noms){
            if (llarg.length() > mesLlarg.length()){
                mesLlarg = llarg;
            }
        }
        System.out.println("El nom més llarg és: " + mesLlarg);
        scanner.close();
    }
}