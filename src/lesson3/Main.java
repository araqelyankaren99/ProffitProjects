package lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1

        System.out.println("Please enter money");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter mounts");
        int mounts = Integer.parseInt(scanner.nextLine());
        double result = money;
        for (int i = 0; i < mounts; i++) {
            result *= 1.07;
        }
        System.out.println((int) result);

        //task 2

        System.out.println("Please enter money");
        int money2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter mounts");
        int mounts2 = Integer.parseInt(scanner.nextLine());
        double result2 = money2;
        int m = 0;
        while (m < mounts2) {
            result2 *= 1.07;
            m++;
        }
        System.out.println((int) result2);

        //task 3

        System.out.println("Please enter number");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println(false);
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);

        //task 4

        System.out.println("Please enter number");
        int number2 = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;
        int i = 2;
        do {
            if (number2 % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        while (i * i <= number2);
        System.out.println(isPrime);

        //task 5

        for (int k = 10; k < 100; k++) {
            if (k % 28 == 0) {
                System.out.println(k + " fizBaz");
            } else if (k % 4 == 0) {
                System.out.println(k + " fiz");
            } else if (k % 7 == 0) {
                System.out.println(k + " baz");
            }
        }
    }
}

