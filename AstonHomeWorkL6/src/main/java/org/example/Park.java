package org.example;

import java.util.ArrayList;

public class Park {
    private ArrayList<Attractions> attractions = new ArrayList<>();

    public void addAttraction(String name, String workingHours, double cost) {
        Attractions attraction = new Attractions(name, workingHours, cost);
        attractions.add(attraction);
    }

    public void printAttractionsInfo() {
        for (Attractions attraction : attractions) {
            System.out.println("Название: " + attraction.getAttractionName() + "\n" + "Время работы: " +
                    attraction.getWorkingHours() + "\n" + "Стоимость: " + attraction.getCost() + " рублей\n");
        }
    }

    class Attractions {
        private String attractionName;
        private String workingHours;
        private double cost;

        public Attractions(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getCost() {
            return cost;
        }
    }
}