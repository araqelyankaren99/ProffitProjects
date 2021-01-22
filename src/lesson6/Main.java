package lesson6;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //task1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text");
        String stringText = scanner.nextLine();
        Set<String> textSet = new LinkedHashSet<>();
        String[] stringsText = stringText.split(" ");
        Collections.addAll(textSet, stringsText);
        List<String> textList = new LinkedList<>(textSet);
        int max = textList.get(0).length();
        for (String s : textList) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        for (String s : textList) {
            if (s.length() == max) {
                System.out.print(s + " ");
            }
        }
        System.out.println();

        //task 2

        System.out.println("Please enter text");
        String textString = scanner.nextLine();
        Set<String> textStringSet = new LinkedHashSet<>();
        String[] textsString = textString.split(" ");
        Collections.addAll(textStringSet, textsString);
        for (String s : textStringSet
        ) {
            System.out.print(s + " ");
        }
        System.out.println();

        //task 3

        System.out.println("Please enter text");
        String stringText1 = scanner.nextLine();
        System.out.println("Please enter x");
        String xString = scanner.nextLine();
        System.out.println("Please enter y");
        String yString = scanner.nextLine();
        String result = stringText1.replaceAll(xString, yString);
        System.out.println(result);

        //task 4

        System.out.println("Please enter text");
        String stringText2 = scanner.nextLine();
        String[] strings = stringText2.split(" ");
        List<String> stringList = new LinkedList<>();
        for (String string : strings) {
            boolean b1 = string.charAt(0) > 97 && string.charAt(0) < 123;
            boolean b2 = string.charAt(string.length() - 1) > 97 && string.charAt(string.length() - 1) < 123;
            String s1 = String.valueOf(string.charAt(0)).toUpperCase();
            String s2 = String.valueOf(string.charAt(string.length() - 1)).toUpperCase();
            String substring = string.substring(1, string.length() - 1);
            if (b1 || b2) {
                String res = s1 + substring + s2;
                stringList.add(res);
            } else {
                stringList.add(string);
            }
        }

        for (String s : stringList
        ) {
            System.out.println(s + " ");
        }
    }
}
