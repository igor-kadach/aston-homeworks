package org.example;

public class Animals {
    protected String name;
    protected int runMaxDistance;
    protected int swimMaxDistance;
    public static int animalCount = 0;

    public Animals(String name, int runMaxDistance, int swimMaxDistance) {
        this.name = name;
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        animalCount++;
    }

    public void run(int length) {
        if (runMaxDistance == 0) {
            System.out.println(name + " can't run");
        } else if (length <= runMaxDistance) {
            System.out.println(name + " run " + length + " m");
        } else {
            System.out.println(name + " can't run more than " + runMaxDistance + " m");
        }
    }

    public void swim(int length) {
        if (swimMaxDistance == 0) {
            System.out.println(name + " can't swim");
        } else if (length <= swimMaxDistance) {
            System.out.println(name + " swim " + length + " m");
        } else {
            System.out.println(name + " can't swim more than " + swimMaxDistance + " m");
        }
    }

    public static void getAnimalCountCount() {
        System.out.println("All animals: " + animalCount + "\n");
    }
}