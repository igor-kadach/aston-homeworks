package org.example;

public class Dog extends Animals {
    public static int dogsCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogsCount++;
    }

    public void getDogCount() {
        System.out.println("Dogs quantity: " + dogsCount + "\n");
    }
}