package org.example;

public class Main {
    public static void main(String[] args) {

        /*2. Создать массив из 5 сотрудников.*/
                Employee[] employee = new Employee[5];
        employee[0] = new Employee("Кадач Игорь Викторович", "Automation Test Engineer",
                "email@email.com", "+375292929292", 10000, 32);
        employee[1] = new Employee("Иванов Иван Иванович", "QA engineer", "mail1@email.com",
                "+375291111111", 7000, 30);
        employee[2] = new Employee("Петров Петр Петрович", "Software developer",
                "petrov@email.com", "+375292222222", 20000, 37);
        employee[3] = new Employee("Барак Обама", "President",
                "obama@email.com", "+375293333333", 500000, 62);
        employee[4] = new Employee("Пушкин Александр Сергеевич", "Poet", "pushka@email.com",
                "+375294444444", 70000, 37);

        for (int i = 0; i < employee.length; i++) {
            employee[i].PrintEmployeeInfo();
        }


      /*3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об
        аттракционах, времени их работы и стоимости.*/
        Park park = new Park();

        park.addAttraction("atraction1", "8-18", 8);
        park.addAttraction("atraction2", "9-19", 9);
        park.addAttraction("atraction3", "10-20", 10);
        park.addAttraction("atraction4", "11-21", 11);
        park.addAttraction("atraction5", "12-22", 12);

        park.printAttractionsInfo();
    }
}