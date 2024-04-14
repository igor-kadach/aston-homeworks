package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот
телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по
фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при
запросе такой фамилии должны выводиться все телефоны.
*/
public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public void createPhoneBook() {
        List<String> names = List.of("Александр Пушкин", "Лев Толстой", "Федор Достаевский", "Николай Гоголь",
                "Михаил Лермотнов", "Антон Чехов", "Михаил Булгаков", "Иван Тургенев", "Борис Пастернак",
                "Антон Чехов");
        List<String> phoneNumbers = List.of("+375291111111", "+375292222222", "+375293333333", "+375294444444",
                "+375295555555", "+375296666666", "+375297777777", "+375298888888", "+375299999999",
                "+375290000000");

        phoneBook = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            String phoneNumber = phoneNumbers.get(i);
            if (phoneBook.containsKey(name)) {
                phoneBook.get(name).add(phoneNumber);
            } else {
                List<String> phoneNumbersList = new ArrayList<>();
                phoneNumbersList.add(phoneNumber);
                phoneBook.put(name, phoneNumbersList);
            }
        }
    }

    public Map<String, List<String>> add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
            System.out.println("New contacts list after adding new contact: " + "\n" + phoneBook);
        }
        return phoneBook;
    }

    public List<String> get(String name) {
        List<String> getList = phoneBook.getOrDefault(name, new ArrayList<>());

        System.out.println("Abonent has number(s): ");
        for (int i = 0; i < getList.size(); i++) {
            System.out.println(getList.get(i));
        }
        return getList;
    }
}