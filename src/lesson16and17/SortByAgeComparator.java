package lesson16and17;

import java.util.Comparator;

public class SortByAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getAge(),student2.getAge());
    }
}
