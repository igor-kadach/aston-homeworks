package org.example;

public class FindFactorial {
    public int calculateFactorial(int num) {
        int factorial = 1;

        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}