package com.exercici0500;

import java.util.Scanner;

public class Main {

    public static boolean mesGranQueA5(double a, double b){

        if (b > a){
            System.out.println("b is greater than a");
            if (b > 5){
                System.out.println("B is greater than 5");
                return true;
            } else {
                System.out.println(" b is not greater than 5");
                return false;
            }
        } else {
            System.out.println("b is less than a");
            return false;
        }
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Primer numero: ");
       Double a = scanner.nextDouble();

       System.out.println("Segon numero: ");
       Double b = scanner.nextDouble();

       System.out.println(mesGranQueA5(a, b));
       scanner.close();
        
    }
}