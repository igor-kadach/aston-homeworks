package org.example;

public class CheckAndConvertArray {
    public class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super();
        }
    }
    public class MyArrayDataException extends Exception {
        public MyArrayDataException() {
            super();
        }
    }

/*
    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
    размера необходимо бросить исключение MyArraySizeException.Далее метод должен пройтись по всем элементам массива,
    преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
    ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в
    какой именно ячейке лежат неверные данные.
*/

    public void checkAndConvertArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int[][] intArray = new int[4][4];
        int arraySum = 0;

        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(String.valueOf(array[i][j]));
                    arraySum = arraySum + intArray[i][j];
                } catch (Exception ex) {
                    System.out.println("Error in [" + i + "][" + j + "]");
                    throw new MyArrayDataException();
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of array elements: " + arraySum);
    }
}