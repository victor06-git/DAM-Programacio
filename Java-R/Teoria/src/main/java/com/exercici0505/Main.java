package com.exercici0505;

import java.util.Scanner;

public class Main {
    public static String nomDelMes(int valor) {
        
        switch (valor) {
            case 1:
                return "Gener";
            case 2:
                return "Febrer";
            case 3:
                return "Març";
            case 4:
                return "Abril";
            case 5:
                return "Maig";
            case 6:
                return "Juny";
            case 7:
                return "Juliol";
            case 8:
                return "Agost";
            case 9:
                return "Setembre";
            case 10:
                return "Octubre";
            case 11:
                return "Novembre";
            case 12:
                return "Desembre";
            default:
                return " Error --> Número invàlid";
            }
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu un número del mes entre 1 i 12: ");
        int valor = scanner.nextInt();

        System.out.println(nomDelMes(valor));

        scanner.close();
        
    }
}
