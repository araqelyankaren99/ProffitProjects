package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static int positiveElementsSum(int[] array) {
        int result = 0;
        for (int value : array) {
            if (value > 0) {
                result++;
            }
        }
        return result;
    }

    private static int[] reverseArray(int[] array) {
        int temp;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int[] fibonacci(int n) {
        int[] elements = new int[n + 1];
        elements[0] = 1;
        elements[1] = 1;
        for (int i = 2; i <= n; i++) {
            elements[i] = elements[i - 1] + elements[i - 2];
        }
        return elements;
    }

    private static int[] newArray(int[] x){
        List<Integer> integerList = new ArrayList<>();
        for (int value : x) {
            if (value >= 10 && value <= 20) {
                integerList.add(value);
            }
        }
        int[] y = new int[integerList.size()];
        for (int i = 0; i <integerList.size() ; i++) {
            y[i]=integerList.get(i);
        }
        Arrays.sort(y);
        System.out.println(y[y.length-2]);
        return y;
    }

    public static void main(String[] args) {
        System.out.println(positiveElementsSum(new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4}));
        System.out.println(Arrays.toString(reverseArray(new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4})));
        System.out.println(max(new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4}));
        System.out.println(min(new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4}));
        System.out.println(Arrays.toString(fibonacci(20)));
        System.out.println(Arrays.toString(newArray(new int[]{-4, -3, -2, -1, 0, 11, 12, 13, 14})));
    }
}
