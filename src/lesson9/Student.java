package lesson9;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double rating;
    private int grade;

    public Student(String name, String surname, int age, double rating, int grade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.rating = rating;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getRating() {
        return rating;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                ", grade=" + grade +
                '}';
    }
}
