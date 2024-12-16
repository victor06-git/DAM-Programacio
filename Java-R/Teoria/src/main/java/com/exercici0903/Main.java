package com.exercici0903;

import java.util.Scanner;

public class Main {

    public static Double calculaCostHabitacio(String tipusHabitacio, Integer nombre_nits){
        
        Double preu_habitacio = 0.0;

        if(tipusHabitacio == "estàndard") {
            
            preu_habitacio = 50.0;
        
        } else if(tipusHabitacio == "suite"){
        
            preu_habitacio = 120.0;
        
        } else {
        
            preu_habitacio = 70.0;
        }

        Double rst = preu_habitacio * nombre_nits;
        return rst;
    }
    

    public static Integer calculaCostEsmorzar(Integer nombrePersones, Integer nombreDies) {
        Integer esmorzar = nombrePersones * 10;
        Integer rst_esm = esmorzar * nombreDies;
        return rst_esm;
    }


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantes nits vols agafar: ");
        int nombre_nits = scanner.nextInt();

        System.out.print("Quantes persones volen esmorzar: ");
        Integer nombrePersones = scanner.nextInt();

        System.out.print("Quin tipus d'habitació vols (estàndard, amb vistes o suite): ");
        String tipus_habitacio = scanner.nextLine();
        
        if(nombre_nits == 5){

        }

        Double precio_habitacion = calculaCostHabitacio(tipus_habitacio, nombre_nits);
        Integer precio_esmorzar = calculaCostEsmorzar(nombrePersones, nombre_nits);
        Double precio_total = precio_habitacion + precio_esmorzar;

        System.out.println("Habitació" + tipus_habitacio + "," + nombre_nits + "nits" + "," + nombrePersones + "persones amb esmorzar: " + precio_total);

        scanner.close();
    }
}
