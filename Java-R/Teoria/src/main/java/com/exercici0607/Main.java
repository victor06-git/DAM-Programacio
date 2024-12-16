package com.exercici0607;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, HashMap<String, Object>> mixedMap = new HashMap<>();
        HashMap<String, Object> anna = new HashMap<>();
        HashMap<String, Object> joan = new HashMap<>();
        HashMap<String, Object> maria = new HashMap<>();
        
       anna.put("edat", 30);
       anna.put("esport", "futbol");
       mixedMap.put("Anna", anna);

       System.out.println("" + "té" + "" + "anys i practica" + "");

       joan.put("edat", 18);
       joan.put("esport", "natació");
       mixedMap.put("Joan", joan);

       maria.put("edat", 14);
       maria.put("esport", "padel");
       mixedMap.put("Maria", maria);

        

       System.out.println(mixedMap);
       System.out.println("Anna té "+ mixedMap.get("anna").get("edat")+" anys i practica "+ mixedMap.get("anna").get("esport"));
       System.out.println("Joan té "+ mixedMap.get("joan").get("edat")+" anys i practica "+ mixedMap.get("joan").get("esport"));
       System.out.println("Maria té "+ mixedMap.get("maria").get("edat")+" anys i practica "+ mixedMap.get("maria").get("esport"));
    }
}
