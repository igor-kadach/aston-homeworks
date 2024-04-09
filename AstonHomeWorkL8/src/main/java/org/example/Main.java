package org.example;

/*
В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета.
*/

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"1", "8", "12", "33"},
                {"56", "3", "2", "73"},
                {"14", "51", "64", "37"},
                {"0", "25", "88", "67"}
        };

        CheckAndConvertArray сheckAndConvertArray = new CheckAndConvertArray();
        try {
            сheckAndConvertArray.checkAndConvertArray(array);
        } catch (CheckAndConvertArray.MyArraySizeException e) {
        } catch (CheckAndConvertArray.MyArrayDataException e) {
        }
    }
}