package lesson16and17;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Lesson> {
    @Override
    public int compare(Lesson lesson1, Lesson lesson2) {
        return lesson1.getName().compareTo(lesson2.getName());
    }
}
