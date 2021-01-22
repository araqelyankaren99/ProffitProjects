package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        printSquare(5);
        System.out.println();
        printSquare(4);
        System.out.println();
        printRectangle(3, 4);
        System.out.println();
        printRectangle(5, 6);
        System.out.println();
        System.out.println(isPrime(97));
        System.out.println();
        System.out.println(isPrime(101));
        System.out.println();
        System.out.println(max(new int[]{2, 1, 2, 3, 4, 6, 8}));
        System.out.println();
        System.out.println(min(new int[]{2, 1, 2, 3, 4, 6, 8}));
        System.out.println();
        int[] ints = new int[]{2, 1, 2, 3, 4, 6, 8};
        sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println();
        sortReverse(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println();
        System.out.println(isEqualsString("aa","aa"));
        System.out.println();
        System.out.println(isEqualsString("bb","bb"));
    }

    //task 1

    private static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    //task 2

    private static void printRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    //task 3

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //task 4

    private static int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    //task 5

    private static int min(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    //task 6

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //task 7

    public static void sortReverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //task 8

    private static boolean isEqualsString(String string1,String string2){
        return string1.equals(string2);
    }
}