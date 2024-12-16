package com.exercici0702;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu numeros separats per comes: ");
        String num = scanner.nextLine(); 

        String[] nums = num.split(","); 

        int contador = 0;

        for (String numero : nums) 
        {
            float numfloat = Float.parseFloat(numero);
            if(numfloat % 2 == 0)
            {
                contador += 1;
            }
        }

        System.out.println("Números parells: " + contador);
        scanner.close();
    }
}