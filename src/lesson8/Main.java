package lesson8;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(sum(5, 6, 8));
        System.out.println();
        System.out.println(sum(8, 10, 12));
        System.out.println();
        System.out.println(isPalindromeNumber(1441));
        System.out.println();
        System.out.println(isPalindromeNumber(1444));
        System.out.println();
        System.out.println(fibonacci(10));
        System.out.println();
        System.out.println(fibonacci(100));
        System.out.println();
        System.out.println(fibNaive(10));
        System.out.println();
        System.out.println(binary(15));
        System.out.println();
        System.out.println(binaryInteger(15));
        System.out.println();
        System.out.println(eightInteger(127));
    }

    //task 1

    private static double sum(double a, double b, double c) {
        return a + b + c;
    }

    //task 2

    private static boolean isPalindromeNumber(int number) {
        int reverse = 0, rem, originalNumber = number;
        while (number != 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number /= 10;
        }
        return originalNumber == reverse;
    }

    //task 3

    private static long fibonacci(int n) {
        long[] fibonacciElements = new long[n + 1];
        fibonacciElements[0] = 1;
        fibonacciElements[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacciElements[i] = fibonacciElements[i - 1] + fibonacciElements[i - 2];
        }
        return fibonacciElements[n - 1];
    }

    //task 4

    private static long fibNaive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    //task 5
    private static String binary(int n) {
        return Integer.toBinaryString(n);
    }

    private static String binaryInteger(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int number = n;
        while (number > 0) {
            int rem = number % 2;
            stringBuilder.append(rem);
            number /= 2;
        }
        return String.valueOf(stringBuilder.reverse());
    }

    //task 6
    private static String eightInteger(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int number = n;
        while (number > 0) {
            int rem = number % 8;
            stringBuilder.append(rem);
            number /= 8;
        }
        return String.valueOf(stringBuilder.reverse());
    }
}