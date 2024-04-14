package org.example;

public class Main {
    public static void main(String[] args) {
        uniqArray();
        phoneBook();
    }

    private static void uniqArray() {
        String[] array = new String[]{"word1", "wordRepeat", "word3", "word4", "wordRepeat", "word6", "word7",
                "wordRepeat", "word9", "word10", "word11", "wordRepeat", "word13", "word3", "word16", "word16"};
        UniqueArray getUniqueArray = new UniqueArray();
        getUniqueArray.getUniqueArray(array);
    }

    private static void phoneBook() {
        PhoneBook phonebook = new PhoneBook();
        phonebook.createPhoneBook();
        phonebook.get("Антон Чехов");
        phonebook.add("New Contact", "New phone number");
    }
}