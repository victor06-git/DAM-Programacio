package com.exercici0601;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];

        max = (array[1] > max ? array[1] : max); min = (array[1] < min ? array[1] : min);
        max = (array[2] > max ? array[2] : max); min = (array[2] < min ? array[2] : min);
        max = (array[3] > max ? array[3] : max); min = (array[3] < min ? array[3] : min);
        max = (array[4] > max ? array[4] : max); min = (array[4] < min ? array[4] : min);

        System.out.println("El valor mes petit es: " + min);
        System.out.println("El valor mes gran es: " + max);
    }
}