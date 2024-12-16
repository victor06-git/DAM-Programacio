package com.exercici0701;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu numeros separats per comes: ");
        String num = scanner.nextLine();  
        int suma = 0;  
        String[] nums = num.split(",");        
        for (int cnt = 0; cnt < nums.length; cnt = cnt + 1){
            String numStr = nums[cnt];
            int numint  = Integer.parseInt(numStr);
            suma += numint;

        }
        
        int mitjana = suma / nums.length;
        System.out.println("La suma dels elements: " + mitjana);
        scanner.close();

    }
}