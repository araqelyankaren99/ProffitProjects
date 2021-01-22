package lesson16and17;

import java.util.Comparator;

public class SortByPriceComparator implements Comparator<Lesson> {
    @Override
    public int compare(Lesson lesson1, Lesson lesson2) {
        return Integer.compare(lesson1.getPrice(),lesson2.getPrice());
    }
}
