package lesson19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> integerStringGen1 = new Gen<>(1, "y", "z");
        Gen<Integer, String> integerStringGen2 = new Gen<>(1, "y", "z");
        Gen<Integer, String> integerStringGen3 = new Gen<>(2, "y", "z");
        Gen<Integer, String> integerStringGen4 = new Gen<>(2, "y", "z");
        Gen<Integer, String> integerStringGen5 = new Gen<>(3, "y", "z");
        Gen<Integer, String> integerStringGen6 = new Gen<>(3, "y", "z");
        Gen<Integer, String> integerStringGen7 = new Gen<>(4, "y", "z");
        Gen<Integer, String> integerStringGen8 = new Gen<>(4, "y", "z");
        Gen<Integer, String> integerStringGen9 = new Gen<>(5, "y", "z");
        Gen[] gens = new Gen[]{integerStringGen1, integerStringGen2, integerStringGen3
                , integerStringGen4, integerStringGen5, integerStringGen6, integerStringGen7,
                integerStringGen8, integerStringGen9};
        check(gens);
    }

    private static void check(Gen[] gens) {
        List<Gen> genList = new ArrayList<>();
        Set<Gen> genSet = new LinkedHashSet<>(Arrays.asList(gens));
        for (int i = 0; i < gens.length; i++) {
            for (int j = 0; j < gens.length - 1; j++) {
                if (gens[j].equals(gens[j + 1])) {
                    genList.add(gens[j]);
                }
            }
        }
        Set<Gen> genSet1 = new LinkedHashSet<>(genList);
        for (Gen g : genSet1
        ) {
            System.out.println(g + " element equals " + g);
        }
        genSet.removeAll(genSet1);
        for (Gen g : genSet
        ) {
            System.out.println(g);
        }
    }
}
