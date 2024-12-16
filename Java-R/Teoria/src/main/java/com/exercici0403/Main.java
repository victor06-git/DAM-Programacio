package com.exercici0403;

import java.util.Scanner;

public class Main {

    public static double calcularAreaRectangle(double ample, double alt) {
        return ample*alt;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ample: ");
        Double ample = scanner.nextDouble();

        System.out.print("Alçada: ");
        Double area = scanner.nextDouble();


        System.out.println("Àrea del rectangle: " + calcularAreaRectangle(ample, area)+" unitats quadrades");

        scanner.close();

    }

}