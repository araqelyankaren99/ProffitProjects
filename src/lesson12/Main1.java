package lesson12;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please choose which object you want");
        int digit = Integer.parseInt(scanner1.nextLine());
        switch (digit) {

            case 1:
                System.out.println("Please enter side1");
                int sideRectangle1 = Integer.parseInt(scanner1.nextLine());
                System.out.println("Please enter side2");
                int sideRectangle2 = Integer.parseInt(scanner1.nextLine());
                Rectangle rectangle = new Rectangle(sideRectangle1, sideRectangle2);
                System.out.println("Please choose one of the options");
                int resultRectangle = Integer.parseInt(scanner1.nextLine());
                switch (resultRectangle) {
                    case 1:

                        System.out.println(rectangle.perimeter());
                        break;
                    case 2:

                        System.out.println(rectangle.area());
                        break;
                }
                break;

            case 2:
                System.out.println("Please enter side1");
                int sideTriangle1 = Integer.parseInt(scanner1.nextLine());
                System.out.println("Please enter side2");
                int sideTriangle2 = Integer.parseInt(scanner1.nextLine());
                System.out.println("Please enter side3");
                int sideTriangle3 = Integer.parseInt(scanner1.nextLine());
                Triangle triangle = new Triangle(sideTriangle1, sideTriangle2, sideTriangle3);
                System.out.println("Please choose one of the options");
                int resultTriangle = Integer.parseInt(scanner1.nextLine());
                switch (resultTriangle) {

                    case 1:
                        System.out.println(triangle.perimeter());
                        break;

                    case 2:
                        System.out.println(triangle.area());
                        break;
                }
                break;
            case 3:

                System.out.println("Please enter side1");
                int sideSquare = Integer.parseInt(scanner1.nextLine());
                Square square = new Square(sideSquare);
                System.out.println("Please choose one of the options");
                int resultSquare = Integer.parseInt(scanner1.nextLine());
                switch (resultSquare) {

                    case 1:
                        System.out.println(square.perimeter());
                        break;

                    case 2:
                        System.out.println(square.area());
                        break;
                }
                break;
        }
    }
}
