package lesson8;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringUtil {
    public static void main(String[] args) {
        System.out.println(trim("  Karen   "));
        System.out.println(startsWith("Karen Araqelyan", "Karen"));
        System.out.println(endsWith("Karen Araqelyan", "Araqelyan"));
        System.out.println(getCountBySymbol("Karen Araqelyan", 'a'));
        System.out.println(getCountBySymbols("Karen Araqelyan",new char[]{'k','a'}));
        System.out.println(middleTwo("Karen"));
        System.out.println(endsLy("KarenLy"));
        System.out.println(theEndOrFront("Karen",true));
        System.out.println(firstTwo("Karen"));
        System.out.println(reverse("Karen"));
        System.out.println(hasBad("badBunny"));
        System.out.println(bobThere("bob"));
        System.out.println(repeatEnd("Karen",5));
    }


    public static String trim(String text) {
        String[] strings = text.split("");
        int countStart = 0;
        int countEnd = 0;
        int i = 0;
        int j = strings.length - 1;
        while (strings[i].equals(" ") || strings[j].equals(" ")) {
            countStart++;
            countEnd++;
            i++;
            j--;
        }
        return text.substring(countStart, text.length() - countEnd);
    }

    public static boolean startsWith(String text, String symbol) {
        String[] strings1 = text.split("");
        String[] strings2 = symbol.split("");
        if (strings2.length > strings1.length) {
            return false;
        }
        for (int i = 0; i < strings2.length; i++) {
            if (!strings1[i].equals(strings2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean endsWith(String text, String symbol) {
        String[] strings1 = text.split("");
        String[] strings2 = symbol.split("");
        int len = strings1.length - strings2.length;
        if (strings2.length > strings1.length) {
            return false;
        }
        for (int i = 0; i < strings2.length; i++, len++) {
            if (!strings2[i].equals(strings1[len])) {
                return false;
            }
        }
        return true;
    }

    public static int getCountBySymbol(String text, char symbol) {
        char[] chars = text.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int getCountBySymbols(String text, char[] symbols) {
        Set<Character> characterSet = new LinkedHashSet<>();
        for (char symbol : symbols) {
            characterSet.add(symbol);
        }
        List<Character> characterList = new ArrayList<>(characterSet);
        char[] chars = text.toCharArray();
        int count = 0;
        for (char c : chars) {
            for (Character character : characterList) {
                if (c == character) {
                    count++;
                }
            }
        }
        return count;
    }
    public static String middleTwo(String str) {
        return str.substring((str.length()/2)-1,str.length()/2+1);
    }

    public static boolean endsLy(String str) {
        String[] strings = str.split("");
        return (strings[strings.length-2].equalsIgnoreCase("L") && strings[strings.length-1].equals("y"));
    }

    public static String theEndOrFront(String str, boolean front) {
        String[] strings = str.split("");
        if(front){
            return strings[0];
        }
        return strings[strings.length-1];
    }

    public static String firstTwo(String str) {
        return str.substring(0,2);
    }

    public static String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static boolean hasBad(String str) {
        if(str.length()<4){
            return false;
        }
        return (str.charAt(0)=='b' && str.charAt(1)=='a' && str.charAt(2)=='d') ||
                (str.charAt(1)=='b' && str.charAt(2)=='a' && str.charAt(3)=='d');
    }

    public static boolean bobThere(String str) {
        String[] strings = str.split("");
        for (int i = 0; i <strings.length-2 ; i++) {
            if(strings[i].equals("b") && strings[i+2].equals("b")){
                return true;
            }
        }
        return false;
    }

    public static String repeatEnd(String str, int n) {
        if(n>str.length()){
            return "";
        }
        String string = str.substring(str.length() - n);
        return string + string.repeat(n - 1);
    }


}
