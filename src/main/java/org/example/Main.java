package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<City> cities = Arrays.asList(
                new City("Madrid", "Madrid", 3000000, 600),
                new City("Barcelona", "Cataluña", 5000000, 700),
                new City("Sevilla", "Andalucía", 4000000, 800),
                new City("Valencia", "Comunidad Valenciana", 3500000, 600),
                new City("Zaragoza", "Aragón", 2000000, 400),
                new City("Málaga", "Andalucía", 1000000, 300),
                new City("Murcia", "Murcia", 900000, 200),
                new City("Palma de Mallorca", "Islas Baleares", 800000, 100),
                new City("Las Palmas de Gran Canaria", "Islas Canarias", 700000, 50),
                new City("Bilbao", "País Vasco", 600000, 400),
                new City("Alicante", "Comunidad Valenciana", 500000, 300),
                new City("Córdoba", "Andalucía", 400000, 200),
                new City("Valladolid", "Castilla y León", 300000, 100),
                new City("Vigo", "Galicia", 200000, 50),
                new City("Gijón", "Asturias", 100000, 40),
                new City("L´Hospitalet de Llobregat", "Cataluña", 50000, 30),
                new City("A Coruña", "Galicia", 40000, 20),
                new City("Vitoria-Gasteiz", "País Vasco", 30000, 10),
                new City("Santa Cruz de Tenerife", "Islas Canarias", 20000, 5)
 );


// ¿De cuántas provincias diferentes son las ciudades?
        System.out.println();
        System.out.println("¿De cuántas provincias diferentes son las ciudades?:");
        long provincesCount = cities.stream().map(city -> city.getProvince()).distinct().count();
        System.out.println("Provinces count: " + provincesCount);
        System.out.println("______________________________________________________");





// ¿Cuántas ciudades hay?

        System.out.println();
        System.out.println("¿Cuántas ciudades hay?");
        long citiesCount = cities.stream().count();
        System.out.println("Cities count: " + citiesCount);
        System.out.println("______________________________________________________");




        // Calcula el número total de habitantes para una provincia determinada (introducida por el usuario, por ejemplo)

        System.out.println();
        System.out.println("Calcula el número total de habitantes para una provincia determinada (introducida por el usuario:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca nombre de provincia: ");
        String province = scanner.nextLine();
        int totalPopulation = cities.stream().filter(city -> city.getProvince().equals(province)).mapToInt(City::getPopulation).sum();
        System.out.println("Poblacion total de " + province + ": " + totalPopulation);

        System.out.println("______________________________________________________");




// Obtén una colección con los nombres de todas las ciudades
        System.out.println();
        System.out.println("Obtén una colección con los nombres de todas las ciudades");
        List<String> cityNames = cities.stream().map(City::getName).collect(Collectors.toList());
        System.out.println("Lista con nombres de ciudades: " + cityNames);
        System.out.println("______________________________________________________");


// Obtén una colección con los nombres de todas las provincias (sin repetir)

        System.out.println();
        System.out.println("Obtén una colección con los nombres de todas las provincias (sin repetir): ");
List<String> provinceNames = cities.stream().map(City::getProvince).distinct().collect(Collectors.toList());
System.out.println("NOMBRES DE PROVINCIAS SIN REPETIR: " + provinceNames);
        System.out.println("______________________________________________________");


// ¿Todas las ciudades son de más de 50.000 habitantes?

        System.out.println();

        boolean allCitiesOver50000 = cities.stream().allMatch(city -> city.getPopulation() > 50000);
        System.out.println("¿Todas las ciudades son de más de 50k habitantes ? " + allCitiesOver50000);
        System.out.println("______________________________________________________");
// ¿Alguna ciudad de una provincia determinada (introducida por el usuario) tiene más de 10.000 habitantes?

        System.out.println();
        System.out.println("¿Alguna ciudad de una provincia determinada (introducida por el usuario) tiene más de 10.000 habitantes?");
        System.out.print("Nombre de provincia: ");
        String provincia = scanner.nextLine();
        boolean anyCityOver10000 = cities.stream().anyMatch(city -> city.getProvince().equals(province) && city.getPopulation() > 10000);
        System.out.println("¿Hay alguna ciudad de " + provincia + " que tenga más de 10k habitantes?: " + anyCityOver10000);

    }
}