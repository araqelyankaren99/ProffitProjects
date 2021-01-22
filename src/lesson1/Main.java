package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task1

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter first digit");
        String digit11 = scanner1.nextLine();
        System.out.println("enter second digit");
        String digit12 = scanner1.nextLine();
        int result1 = Integer.parseInt(digit11) + Integer.parseInt(digit12);
        System.out.println("sum of digits = " + result1);

        //task2

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter first digit");
        String digit21 = scanner2.nextLine();
        System.out.println("enter second digit");
        String digit22 = scanner2.nextLine();
        int result2 = (int) Math.pow(Integer.parseInt(digit21), Integer.parseInt(digit22));
        System.out.println("degree = " + result2);

        //task3

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("enter secounds");
        String string1 = scanner3.nextLine();
        int digit3 = Integer.parseInt(string1);
        int hours = digit3 / 3600;
        int minutes = (digit3 % 3600) / 60;
        int secounds = (digit3 % 3600) % 60;
        System.out.println("time = " + hours + " hours " + minutes + " minutes " + secounds + " secounds");

        //task4

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("enter digit");
        String string2 = scanner4.nextLine();
        double digit4 = Double.parseDouble(string2);
        double result = digit4 % 1;
        System.out.println("fractional part = " + result);

        //task5

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("enter digit");
        String string3 = scanner5.nextLine();
        double digit5 = Integer.parseInt(string3);
        double res = Math.sqrt(digit5);
        System.out.println("sqrt = " + res);

        //task6

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("enter digit");
        String string4 = scanner6.nextLine();
        int digit6 = Integer.parseInt(string4);
        int sum = digit6 % 10 + (digit6 / 10) % 10 + (digit6 / 100) % 10 + (digit6 / 1000) % 10;
        System.out.println("sum = " + sum);
    }
}
