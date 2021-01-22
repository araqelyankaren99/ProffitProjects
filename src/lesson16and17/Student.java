package lesson16and17;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String university;
    List<Integer> rating ;
    Set<Lesson> lessonSet;

    public Student(String name, String surname, int age, String university, List<Integer> rating,Set<Lesson> lessonSet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.university = university;
        this.rating = rating;
        this.lessonSet = lessonSet;
    }

    public int getAge() {
        return age;
    }

    public static Student createStudent(String name, String surname, String university,Set<Lesson> lessonSet){
        List<Integer> integerList = new ArrayList<>(10);
        int max = 30;
        int min = 14;
        int max1 = 10;
        int min1 = 0;
        int age1 = (int)(Math.random() * ((max - min) + 1)) + min;
        for (int i = 0; i <10 ; i++) {
            integerList.add((int)(Math.random() * ((max1 - min1) + 1)) + min1);
        }
        return new Student(name,surname,age1,university,integerList,lessonSet);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", rating=" + rating +
                '}';
    }



}
