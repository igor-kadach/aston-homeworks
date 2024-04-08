package org.example;

public class Cat extends Animals {
    private static int catsCount = 0;
    private static int maxFood = 100;

    public Cat(String name) {
        super(name, 200, 0);
        catsCount++;
    }

    public void getCatsCount() {
        System.out.println("Cats quantity: " + catsCount + "\n");
    }

    public boolean eatCat(int foodQuantity) {
        if (maxFood >= foodQuantity) {
            maxFood = maxFood - foodQuantity;
            return true;
        } else {
            return false;
        }
    }

    public static int addFoodForCat(int addFood) {
        maxFood = maxFood + addFood;
        return maxFood;
    }
}