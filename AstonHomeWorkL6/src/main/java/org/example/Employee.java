package org.example;

/*
        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        Конструктор класса должен заполнять эти поля при создании объекта.
        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
*/

public class Employee {
    private String employeeName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String employeeName, String jobTitle, String email, String phoneNumber, int salary, int age) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void PrintEmployeeInfo() {
            System.out.println("ФИО: " + employeeName + "\n" + "Должность: " + jobTitle + "\n" + "Email: " + email +
                    "\n" + "Телефон: " + phoneNumber + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age);
            System.out.println("----------------------------------------------------------");
    }
}