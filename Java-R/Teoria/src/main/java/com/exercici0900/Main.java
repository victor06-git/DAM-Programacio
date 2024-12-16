package com.exercici0900;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static boolean isAnagrama(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        return Arrays.equals(aArray, bArray);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriu un paraula: " );
        String word1 = sc.nextLine();

        System.out.println("Escriu un paraula: " );
        String word2 = sc.nextLine();

        System.out.println("Són les paraules " + "\'" + word1 + "\'" + " i " + "\'" + word2 + "\' anagrames? " + isAnagrama(word1, word2) );

        sc.close();
    }
}