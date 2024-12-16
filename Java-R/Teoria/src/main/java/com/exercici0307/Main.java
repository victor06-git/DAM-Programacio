package com.exercici0307;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       Locale localeUS = Locale.US;
       Locale localeES = Locale.forLanguageTag("es");

       System.out.printf(localeUS, "PI amb Locale.US: %.10f%n", Math.PI);

       System.out.printf(localeES, "PI amb Locale.ES: %.10f%n", Math.PI);

       scanner.close();
       
    }
}
