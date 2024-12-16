package com.exercici0605;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, Double> notes = new HashMap<> ();

        notes.put("Anna", 8.5);
        notes.put("Joan", 9.0);
        notes.put("Maria", 7.8);

        
        System.out.println("Nota d'Anna: " + notes.get("Anna"));
        System.out.println("Nota de Joan: " + notes.get("Joan"));
        System.out.println("Nota de Maria: " + notes.get("Maria"));

    }
}
