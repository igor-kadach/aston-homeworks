package org.example;

interface Figures {
    void calculateArea();
    void calculatePerimeter();
    void figureColor(String figureColor);
    void figureBorderColor(String borderColor);
    void displayInfo();
}

class Circle implements Figures {
    private double area;
    private double perimeter;
    private double radius;
    private String figureColor;
    private String borderColor;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * PI * radius;
    }

    @Override
    public void figureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    @Override
    public void figureBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void displayInfo() {
        System.out.println("Area of circle: " + area + "\n" + "Perimeter of circle: " + perimeter + "\n" +
                "Color of circle: " + figureColor + "\n" + "Color of circle borders: " + borderColor + "\n");
    }
}

class Rectangle implements Figures {
    private double area;
    private double perimeter;
    private double length;
    private double width;
    private String figureColor;
    private String borderColor;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * length + 2 * width;
    }

    @Override
    public void figureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    @Override
    public void figureBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void displayInfo() {
        System.out.println("Area of rectangle: " + area + "\n" + "Perimeter of rectangle: " + perimeter + "\n" +
                "Color of rectangle: " + figureColor + "\n" + "Color of rectangle borders: " + borderColor + "\n");
    }
}

class Triangle implements Figures {
    private double area;
    private double perimeter;
    private double a;
    private double b;
    private double c;
    private String figureColor;
    private String borderColor;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateArea() {
        double p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void calculatePerimeter() {
        perimeter = a + b + c;
    }

    @Override
    public void figureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    @Override
    public void figureBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void displayInfo() {
        System.out.println("Area of triangle: " + area + "\n" + "Perimeter of triangle: " + perimeter + "\n" +
                "Color of triangle: " + figureColor + "\n" + "Color of triangle borders: " + borderColor + "\n");
    }
}