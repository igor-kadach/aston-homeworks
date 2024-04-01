package org.example;

public class HomeWork4 {

    public void printThreeWords() {
        String word1 = "Orange";
        String word2 = "Banana";
        String word3 = "Apple";
        System.out.println("Task №1:\n" + word1 + "\n" + word2 + "\n" + word3 + "\n");
    }

    public void checkSumSign() {
        int a = 0;
        int b = -5;
        int sum = 0;
        if (a + b >= sum) {
            System.out.println("Task №2:\nСумма " + a + " + " + b + " положительная\n");
        } else {
            System.out.println("Task №2:\nСумма " + a + " + " + b + " отрицательная\n");
        }
    }

    public void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Task №3:\nКрасный\n");
        } else if (value > 0 & value <= 100) {
            System.out.println("Task №3:\nЖелтый\n");

        } else if (value > 100) {
            System.out.println("Task №3:\nЗеленый\n");
        }
    }

    public void compareNumbers() {
        int a = 5;
        int b = 99;
        if (a >= b) {
            System.out.println("Task №4:\na >= b\n");
        } else {
            System.out.println("Task №4:\na < b\n");
        }
    }

    public boolean checkBoundaries(int a, int b) {
        if (a + b > 10 & a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public void isNumberPositive(int a) {
        if (a >= 0) {
            System.out.println("Task №6:\n" + a + " Число положительное\n");
        } else {
            System.out.println("Task №6:\n" + a + " Число отрицательное\n");
        }
    }

    public boolean isNumberNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printLine(String str, int a) {
        System.out.println("Task №8:");
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public boolean isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void changeArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public void multiplyArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public void fillArrayDiagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
    }

    public int[] fillInitialArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}