package lesson15;

import java.util.Arrays;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String phone;
    private String email;
    private Date registerDate;
    private Lesson[] lessons;
    private double rating;

    public Student(String name, String surname, String phone, String email, Date registerDate,
                   Lesson[] lessons, double rating) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.registerDate = registerDate;
        this.lessons = lessons;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Lesson[] getLessons() {
        return lessons;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + "," +
                " phone='" + phone + '\'' + ", email='" + email + '\'' + ", registerDate=" + registerDate +
                ", lessons=" + Arrays.toString(lessons) + ", rating=" + rating + '}';
    }
}
