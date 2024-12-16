package com.exercici0604;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> paraules = new ArrayList<>();
        paraules.add("Hola");
        paraules.add("què");
        paraules.add("tal");

        System.out.println("Llista inicial: " + paraules);

        paraules.remove(1);
        System.out.println("Després d'eliminar l'índex [1]: " + paraules);

        paraules.set(0, "Adeu");
        System.out.println("Després de modificar l'índex [0] a \"Adeu\": " + paraules);
    }
}
