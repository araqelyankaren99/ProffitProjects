package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] ints1 = new int[10][10];
        System.out.println("            2d matrix");
        System.out.println();

        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                ints1[i][j] = j;
            }
        }

        for (int[] row : ints1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        System.out.println();
        System.out.println("      matrix");
        System.out.println();

        for (int[] ints : ints1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1.length; j++) {
                if (j < i) {
                    System.out.print(ints1[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("down second diagonally");
        System.out.println();

        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                if (i + j < ints1.length) {
                    System.out.print(" ");
                } else {
                    System.out.print(ints1[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("       max elements");
        int[] maxElements = new int[ints1.length];
        int j = 0;
        int max = 0;
        int rows = ints1.length;
        while (j < rows) {
            for (int k = 0; k < ints1[j].length; k++) {
                if (ints1[j][k] > max) {
                    max = ints1[j][k];
                }
            }
            maxElements[j] = max;
            max = 0;
            j++;
        }
        System.out.println(Arrays.toString(maxElements));
        System.out.println();
        System.out.println();
        System.out.println("  not diagonally");
        System.out.println();

        String[][] strings = new String[ints1.length][ints1.length];
        for (int i = 0; i < ints1.length; i++) {
            for (int k = 0; k < ints1[i].length; k++) {
                strings[i][k] = String.valueOf(ints1[i][k]);
            }
        }
        for (int i = 0; i < strings.length; i++) {
            for (int k = 0; k < strings[i].length; k++) {
                if (i == k || i + k == strings.length - 1) {
                    strings[i][k] = " ";
                }
                System.out.print(strings[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("           Print X ");
        System.out.println();

        String[][] strings1 = new String[10][15];
        int k = 0;
        int m = k + 5;
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                k = 0;
                m = 5;
            }

            if (i == 8) {
                k = 1;
                m = 6;
            }

            if (i == 7) {
                k = 2;
                m = 7;
            }

            while (k < m) {
                strings1[i][k] = "*";
                strings1[i][15 - k - 1] = "*";
                k++;
            }
            k = m - 4;
            m++;
        }

        for (int i = 0; i < 10; i++) {
            for (int l = 0; l < 15; l++) {
                if (strings1[i][l] == null) {
                    strings1[i][l] = " ";
                }
            }
        }

        for (String[] ints : strings1) {
            for (String anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

