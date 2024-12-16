package com.exercici0402;

public class Main {

    public static double calcularImpost(double preu, double percentatge){
        return preu + preu * (percentatge / 100);
    }
    public static void main(String[] args) {

        System.out.println("Preu: " + 100.0);
        System.out.println("Percentatge: " + 21.0 + "%");
        System.out.println("Valor de venta: " + calcularImpost(100.0, 21.0));
    }
}
