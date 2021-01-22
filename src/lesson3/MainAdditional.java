package lesson3;

public class MainAdditional {
    public static void main(String[] args) {
        print1();
        System.out.println();
        System.out.println();
        print2();
        System.out.println();
        System.out.println();
        print3();
        System.out.println();
        System.out.println();
        print4();
        System.out.println();
        System.out.println();
        print5();
    }

    public static void print1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j * j <= i * i) {
                    System.out.print(j * j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void print2() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 2 * (5 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print4() {
        int space = 4;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        space = 0;

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }
    }

    public static void print5() {
        int rows = 9;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
