package com.exercici0401;



public class Main {

    public static String saludar(String nom){
        return "Hola," + " " + nom;
    }
    public static String saludar(String titol, String nom){
        return "Hola," + " " + titol + " " + nom;
    }
    public static void main(String[] args) {

        System.out.println(saludar("Victor"));
        System.out.println(saludar("Sr.", "Victor"));
        
        
    }
}
