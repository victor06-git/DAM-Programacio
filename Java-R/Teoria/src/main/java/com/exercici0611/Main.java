package com.exercici0611;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Scanner;
    import java.util.stream.Collectors;

   

    public class Main {
        public static HashMap<String, Object> createAnimal (String nom, String especie, Double pes, Double anysVida){
            HashMap<String, Object> animal = new HashMap<>();
            animal.put("nom", nom);
            animal.put("especie", especie);
            animal.put("pes", pes);
            animal.put("A.V", anysVida);

            return animal;
        }
        public static void showInformation(ArrayList<HashMap<String, Object>> listaAnimal){
            for (HashMap<String,Object> animal : listaAnimal) {
                System.out.println("Name: "+animal.get("nom")+", Especie: "+animal.get("especie")+", Pes: "+animal.get("pes")+", Anys Vida: "+animal.get("A.V")+", Cal: "+animal.get("Cal"));
            }
        }

        /*Crear funcion para ordenar listas automaticamente*/ 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<HashMap<String, Object>> table = new ArrayList<>();
            table.add(createAnimal("Simba", "LleÃ³", 190.0, 15.0));
            table.add(createAnimal("Pelut", "Gos", 6.0, 12.0));
            table.add(createAnimal("Max", "Cavall", 500.0, 30.0));
            table.add(createAnimal("Luna", "Gato", 4.0, 15.0));
            table.add(createAnimal("Rocky", "Tortuga", 150.0, 100.0));
            table.add(createAnimal("Polly", "Loro", 1.0, 50.0));

            System.out.println("Que quieres aplicar: [1. pes < 100 Kg // 2. Noms en Majus // 3. Afegir 'CAL'] // ANY NUMBER. Original Table");
            Integer filter = scanner.nextInt();

            switch (filter) {

                case 1:
                    ArrayList<HashMap<String, Object>> filterPes = new ArrayList<>(table.stream()
                    .filter(animal ->{
                        Double peso = (Double) animal.get("pes");
                        return (peso > 100);
                    })
                    .collect(Collectors.toList()));
                    
                    System.out.println("-".repeat(65));
                    showInformation(filterPes);
                    System.out.println("-".repeat(65));
                    break;

                case 2: 
                    ArrayList<HashMap<String, Object>> mapMajus = new ArrayList<>(table.stream()
                    .map(animal ->{
                        String nom = (String) animal.get("nom");
                        animal.put("nom",nom.toUpperCase());
                        return animal;
                    })
                    .collect(Collectors.toList()));

                    System.out.println("-".repeat(65));
                    showInformation(mapMajus);
                    System.out.println("-".repeat(65));
                    break;

                case 3: 
                    ArrayList<HashMap<String, Object>> filteTable = new ArrayList<>(table.stream()
                    .filter(animal->{
                        Double av = (Double) animal.get("A.V");
                        return (av <= 30);
                    })
                    .map(animal->{
                        Double av = (Double) animal.get("A.V");
                        Double pes = (Double) animal.get("pes");
                        animal.put("Cal", av/pes);
                        return animal;
                    })
                    .collect(Collectors.toList()));
                    System.out.println("-".repeat(65));
                    showInformation(filteTable);
                    System.out.println("-".repeat(65));
                    break;

                default:
                    System.out.println("-".repeat(65));
                    showInformation(table);
                    System.out.println("-".repeat(65));
                    break;
            }
            scanner.close();
        }
    }