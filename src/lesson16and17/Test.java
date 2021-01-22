package lesson16and17;

import java.util.*;

public class Test {
    static List<Student> studentList = new ArrayList<>();
    static Set<Lesson> lessonSet = new LinkedHashSet<>();

    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("Math analiz", 20000, 5);
        Lesson lesson2 = new Lesson("Diskret Matematica", 30000, 3);
        Lesson lesson3 = new Lesson("Cragravorum", 40000, 7);
        lessonSet.add(lesson1);
        lessonSet.add(lesson2);
        lessonSet.add(lesson3);
        Student student1 = Student.createStudent("Karen", "Araqelyan", "Ysu", lessonSet);

        Student student2 = new Student("Emma", "Harutyunyan", 21, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        Student student3 = new Student("Anna", "Petrosyan", 22, "YSU",
                List.of(9, 8, 9, 9, 8, 6, 9, 8, 9, 8, 9), lessonSet);

        Student student4 = new Student("Artur", "Poghosyan", 23, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        Student student5 = new Student("Aram", "Harutyunyan", 24, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        Student student6 = new Student("Hayk", "Sargsyan", 25, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        Student student7 = new Student("Azat", "Gevorgyan", 25, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        Student student8 = new Student("Hakob", "Grigoryan", 24, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        Student student9 = new Student("Ashot", "Davtyan", 23, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        Student student10 = new Student("Armine", "Hakobyan", 22, "YSU",
                List.of(9, 8, 7, 9, 8, 6, 5, 8, 9, 8, 9), lessonSet);

        grouping(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);

        System.out.println();
        System.out.println();

        for (Lesson l : lessonSet
        ) {
            System.out.println(l);
        }

        System.out.println();
        System.out.println();

        sortByName();

        for (Lesson l : lessonSet
        ) {
            System.out.println(l);
        }

        System.out.println();
        System.out.println();

        sortByPrice();

        for (Lesson l : lessonSet
        ) {
            System.out.println(l);
        }

        System.out.println();
        System.out.println();

        sortByCount();

        for (Lesson l : lessonSet
        ) {
            System.out.println(l);
        }
    }


    public static void grouping(Student student1, Student student2, Student student3, Student student4, Student student5,
                                Student student6, Student student7, Student student8, Student student9, Student student10) {
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

        sortByAge();

        for (Student student : studentList
        ) {
            System.out.println(student);
        }

        mix();

        System.out.println();
        System.out.println();

        for (Student student : studentList
        ) {
            System.out.println(student);
        }
    }

    public static void sortByAge() {
        studentList.sort(new SortByAgeComparator());
    }

    public static void mix() {
        Collections.shuffle(studentList);
    }

    public static void sortByName() {
        List<Lesson> lessonList = new ArrayList<>(lessonSet);
        lessonList.sort(new SortByNameComparator());
    }

    public static void sortByPrice() {
        List<Lesson> lessonList = new ArrayList<>(lessonSet);
        lessonList.sort(new SortByPriceComparator());
    }

    public static void sortByCount() {
        List<Lesson> lessonList = new ArrayList<>(lessonSet);
        lessonList.sort(new SortByCountComparator());
    }
}
