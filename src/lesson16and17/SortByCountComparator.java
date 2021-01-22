package lesson16and17;

import java.util.Comparator;

public class SortByCountComparator implements Comparator<Lesson> {
    @Override
    public int compare(Lesson lesson1, Lesson lesson2) {
        return Integer.compare(lesson1.getCount(),lesson2.getCount());
    }
}
