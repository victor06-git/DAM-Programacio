package com.exercici0303;

public class Main {
    public static void main(String[] args) {
        
        String text = "Cada matí fa sol però a les tardes plou";

        System.out.println(text);

        int posiciomati = text.indexOf("matí");
        System.out.println("Posició de \"matí\":" + " " + posiciomati);

        int posiciotarda = text.indexOf("tardes");
        System.out.println("Posició de \"tardes\":" + " " + posiciotarda);

        String tardaend = "tardes";
        System.out.println("Longitud tardes: " + tardaend.length());

        String subcadena = text.substring(5, 34);
        System.out.println("Subcadena entre \"matí\" i \"tardes\": "+ " " + subcadena);
    }
}
