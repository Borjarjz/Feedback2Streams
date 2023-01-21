package org.example;

public class City {
    private String name;
    private String province;
    private int population;
    private int area;

    public City(String name, String province, int population, int area) {
        this.name = name;
        this.province = province;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }
}