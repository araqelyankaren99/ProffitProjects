package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task1

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Please enter digit");
        String string1=scanner1.nextLine();
        int digit1 = Integer.parseInt(string1);
        if(digit1>=10 && digit1<=99){
            System.out.println("tivy erknish e");
        }
        else if(digit1>0 && digit1<10){
            System.out.println("tivy mianish e");
        }
        else{
            System.out.println("error");
        }

        //task2

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter first digit");
        String string21 = scanner2.nextLine();
        int digit21 = Integer.parseInt(string21);
        System.out.println("Please enter secound digit");
        String string22 = scanner2.nextLine();
        int digit22 = Integer.parseInt(string22);
        System.out.println("Please enter tree digit");
        String string23 = scanner2.nextLine();
        int digit23 = Integer.parseInt(string23);
        System.out.println("Please enter four digit");
        String string24 = scanner2.nextLine();
        int digit24 = Integer.parseInt(string24);
        int max1 = Math.max(digit21, digit22);
        int max2 = Math.max(digit23, digit24);
        int max = Math.max(max1, max2);
        System.out.println("max = " + max);

        //task3

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter first digit");
        String string3 = scanner3.nextLine();
        int digit3 = Integer.parseInt(string3);
        if(digit3>=86 && digit3<=100){
            System.out.println("A");
        }
        else if(digit3>=71 && digit3<86){
            System.out.println("B");
        }
        else if(digit3>=40 && digit3<71){
            System.out.println("C");
        }
        else if (digit3 >=0 && digit3<40){
            System.out.println("D");
        }
        else {
            System.out.println("error");
        }

        //task4

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Please enter first digit");
        String string41 = scanner4.nextLine();
        System.out.println("Please enter secound digit");
        String string42 = scanner4.nextLine();
        double d1 = Double.parseDouble(string41);
        double d2 = Double.parseDouble(string42);
        double result = 0;
        System.out.println("Please enter ");
        String string43 = scanner4.nextLine();
        switch (string43){
            case "+" : result = d1 + d2;
            break;
            case "-" : result = d1 - d2;
            break;
            case "*" : result = d1 * d2;
            break;
            case "/" : result = d1 / d2;
            break;
       }
        System.out.println("result = " + result);
    }
}
