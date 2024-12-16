package com.exercici0610;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static HashMap<String, Object> createAnimal(String nom, String especie, int pes, int anysVida) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("nom", nom);
        map.put("especie", especie);
        map.put("pes", pes);
        map.put("anysVida", anysVida);
        return map;
    }

    public static void showInformation(ArrayList<HashMap<String, Object>> animals) {
        System.out.println("| Nom        | Espècie    |  Pes  |  A.V |");
        System.out.println("|------------|------------|-------|------|");
        
        for (HashMap<String, Object> animal : animals) { //Bucle per imprimir les variables de Nom, espècie, pes i anysVida
            System.out.printf("| %-10s | %-10s | %5d | %5d|\n", //Definir un printf amb els espais corresponents de cada String e Integer
                    animal.get("nom"), animal.get("especie"), animal.get("pes"), animal.get("anysVida"));
        }
    }

    public static void main(String[] args) { //Main
        ArrayList<HashMap<String, Object>> animals = new ArrayList<>();

        animals.add(createAnimal("Simba", "Lleó", 190, 15));//Añade las características del animal Simba en la arraylist de "animal"
        animals.add(createAnimal("Pelut", "Gos", 6, 12));//Añade las características del animal Pelut
        animals.add(createAnimal("Max", "Cavall", 500, 30));//Añade las características del animal Max
        animals.add(createAnimal("Luna", "Gat", 4, 15));//Añade las características del animal Luna
        animals.add(createAnimal("Rocky", "Tortuga", 150, 100));//Añade las características del animal Rocky
        animals.add(createAnimal("Polly", "Loro", 1, 50));//Añade las características del animal Lloro

        ArrayList<HashMap<String, Object>> animalsByNom = new ArrayList<>(animals); //Crea una nueva ArrayList para ordenar los animales por nombre
        animalsByNom.sort((animal1, animal2) -> { //Comparación entre dos animales
            String a = (String) animal1.get("nom"); //Primer animal
            String b = (String) animal2.get("nom"); //Segundo animal
            return a.compareTo(b); //Compara por lugar en el abecedario las iniciales
        });

        ArrayList<HashMap<String, Object>> animalsByEspecie = new ArrayList<>(animals); // Crea una nueva ArrayList para ordenar por especie
        animalsByEspecie.sort((animal1, animal2) -> {
            String a = (String) animal1.get("especie");
            String b = (String) animal2.get("especie");
            return b.compareTo(a); //Compara por lugar en el abecedario en sentido de la Z a la A
        });

        // Fer la còpia per no modificar l'original
        ArrayList<HashMap<String, Object>> animalsByPes = new ArrayList<>(animals);
        animalsByPes.sort((animal1, animal2) -> {
            Integer a = (Integer) animal1.get("pes");
            Integer b = (Integer) animal2.get("pes");
            return a.compareTo(b); //De menos a más
        });

        // Fer la còpia per no modificar l'original
        ArrayList<HashMap<String, Object>> animalsByAnysVida = new ArrayList<>(animals);
        animalsByAnysVida.sort((animal1, animal2) -> {
            Integer a = (Integer) animal1.get("anysVida");
            Integer b = (Integer) animal2.get("anysVida");
            return b.compareTo(a); //De más a menos
        });

        System.out.println("Animal List:");
        showInformation(animals);

        System.out.println("-".repeat(25));
        System.out.println("Sorted by Nom:");
        showInformation(animalsByNom);

        System.out.println("-".repeat(25));
        System.out.println("Sorted by Espècie:");
        showInformation(animalsByEspecie);

        System.out.println("-".repeat(25));
        System.out.println("Sorted by Pes:");
        showInformation(animalsByPes);

        System.out.println("-".repeat(25));
        System.out.println("Sorted by anysVida:");
        showInformation(animalsByAnysVida);
    }
}