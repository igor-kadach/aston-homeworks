package org.example;

import java.util.ArrayList;
import java.util.List;

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово. (реализовать с
использованием коллекций)
*/
public class UniqueArray {
    public void getUniqueArray(String[] array) {
        List<String> uniqueList = new ArrayList<>();
        List<Integer> countWords = new ArrayList<>();

        String tempWord;
        boolean isWordUnique;

        for (int i = 0; i < array.length; i++) {
            tempWord = array[i];
            isWordUnique = true;
            for (int j = 0; j < uniqueList.size(); j++) {
                if (tempWord.equals(uniqueList.get(j))) {
                    isWordUnique = false;
                    int count = countWords.get(j);
                    countWords.set(j, count + 1);
                }
            }
            if (isWordUnique == true) {
                uniqueList.add(tempWord);
                countWords.add(1);
            }
        }
        for (int i = 0; i < uniqueList.size(); i++) {
            System.out.println(uniqueList.get(i));
        }
        for (int i = 0; i < countWords.size(); i++) {
            System.out.println(countWords.get(i));
        }
    }
}