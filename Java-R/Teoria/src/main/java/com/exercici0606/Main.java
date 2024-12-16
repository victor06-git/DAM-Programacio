package com.exercici0606;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       
        HashMap<String, Double> products = new HashMap<> ();
        
        products.put("Pa", 1.2);
        products.put("Llet", 0.99);
        products.put("Ous", 2.5);

        System.out.println("Mapa inicial: " + products);

        products.remove("Llet");
        System.out.println("Després d'eliminar 'Llet': " + products);

        products.put("Pa", 1.5);
        System.out.println("Després de modificar el preu de 'Pa': " + products);
    }
}
