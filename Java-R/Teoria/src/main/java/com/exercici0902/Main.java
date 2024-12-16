package com.exercici0902;

import java.util.Scanner;

public class Main {

    public static Double beneficiDia(Double dia, Double nit) {
        
        Double precio_perro = (dia * 30) + (nit * 50); 
        Double bruto = precio_perro * (16.0 / 100);
        Double neto = precio_perro - bruto;
    
        return neto;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos perros se quedan de dia? ");
        Double dia = sc.nextDouble();

        System.out.println("Cuantos perros se quedan de noche? ");
        Double nit = sc.nextDouble();

        Double benefici = beneficiDia(dia, nit);

        System.out.println("El cuidador obté "+benefici+"€ de benefici.");

        sc.close();
        
    }
}