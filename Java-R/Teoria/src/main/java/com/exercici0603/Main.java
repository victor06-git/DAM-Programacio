package com.exercici0603;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println("Afegint elements: " + numeros);
        System.out.println("ELement a l'índex [0]: " + numeros.get(0));
        System.out.println("Element a l'índex [1]: " + numeros.get(1));
        System.out.println("Element a l'índex [2]: " + numeros.get(2));
        System.out.println("Element a l'índex [3]: " + numeros.get(3));


    }
}
