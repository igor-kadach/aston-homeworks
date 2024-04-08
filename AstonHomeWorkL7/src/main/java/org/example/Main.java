package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobik");
        dog.run(150);
        dog.swim(20);

        Cat cat = new Cat("Murka");
        cat.run(200);
        cat.swim(10);

        dog.getDogCount();
        cat.getCatsCount();
        Animals.getAnimalCountCount();

        catsEats();

        EnterFigureValues();
    }

    public static void catsEats() {
        Cat[] cats = {new Cat("Murka"),
                new Cat("Morda"),
                new Cat("Murzik"),
                new Cat("Shkura")
        };

        for (Cat cat : cats
        ) {
            boolean isCatSatiety = cat.eatCat(10);
            if (isCatSatiety == true) {
                System.out.println("Cat is satiety");
            } else {
                System.out.println("Cat is hungry");
            }
        }
    }


    public static void EnterFigureValues() {
        Scanner scanner = new Scanner(System.in);

        Circle circle = createCircle(scanner);
        circle.displayInfo();

        Rectangle rectangle = createRectangle(scanner);
        rectangle.displayInfo();

        Triangle triangle = createTriangle(scanner);
        triangle.displayInfo();
    }

    public static Circle createCircle(Scanner scanner) {
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        String color = getColor(scanner, "circle");
        String borderColor = getColor(scanner, "circle borders");
        Circle circle = new Circle(radius);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.figureColor(color);
        circle.figureBorderColor(borderColor);
        return circle;
    }

    public static Rectangle createRectangle(Scanner scanner) {
        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();
        String color = getColor(scanner, "rectangle");
        String borderColor = getColor(scanner, "rectangle borders");
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.figureColor(color);
        rectangle.figureBorderColor(borderColor);
        return rectangle;
    }

    public static Triangle createTriangle(Scanner scanner) {
        System.out.print("Enter triangle side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter triangle side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter triangle side c: ");
        double c = scanner.nextDouble();
        String color = getColor(scanner, "triangle");
        String borderColor = getColor(scanner, "triangle borders");
        Triangle triangle = new Triangle(a, b, c);
        triangle.calculateArea();
        triangle.calculatePerimeter();
        triangle.figureColor(color);
        triangle.figureBorderColor(borderColor);
        return triangle;
    }

    public static String getColor(Scanner scanner, String figureName) {
        System.out.print("Enter color of " + figureName + ": ");
        return scanner.next();
    }
}