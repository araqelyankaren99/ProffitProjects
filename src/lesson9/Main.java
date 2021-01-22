package lesson9;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Karen", "Araqelyan", 17, 9, 12);
        Student student2 = new Student("Emma", "Harutyunyan", 10, 9.5, 5);
        Student student3 = new Student("Hayk", "Petrosyan", 10, 8, 5);
        Student student4 = new Student("Artur", "Harutyunyan", 11, 5, 5);
        Student student5 = new Student("Aram", "Gasparyan", 18, 5, 12);

        Student[] students = new Student[]{student1, student2, student3, student4, student5};
        info(students);
        System.out.println("avgRating = " + avgRating(students));
        System.out.println("12 grade students");
        print(students);
        System.out.println("5 grade students");
        printStudents(students);
    }

    public static void info(Student[] students) {
        for (Student s : students
        ) {
            System.out.println("name = " + s.getName() + ", " + "surname = " + s.getSurname());
        }
        print(students);
    }

    public static double avgRating(Student[] students) {
        int result = 0, count = 0;
        for (Student s : students
        ) {
            count++;
            result += s.getRating();
        }
        return (double) result / count;
    }

    public static void print(Student[] students) {
        for (Student s : students
        ) {
            if (s.getGrade() == 12) {
                System.out.println("name = " + s.getName() + ", age = " + s.getAge());
            }
        }
    }

    public static void printStudents(Student[] students) {
        for (Student s : students
        ) {
            if (s.getGrade() == 5) {
                if (s.getRating() >= 9) {
                    System.out.println("name = " + s.getName() + ", excellent, " + " surname = " + s.getSurname() +
                            " age = " + s.getAge() + " rating = " + s.getRating() + " grade = " + s.getGrade());
                } else if (s.getRating() >= 7 && s.getRating() < 9) {
                    System.out.println("name = " + s.getName() + ", percussion, " + " surname = " + s.getSurname() +
                            " age = " + s.getAge() + " rating = " + s.getRating() + " grade = " + s.getGrade());
                } else {
                    System.out.println("name = " + s.getName() + ", mediocre, " + " surname = " + s.getSurname() +
                            " age = " + s.getAge() + " rating = " + s.getRating() + " grade = " + s.getGrade());
                }
            }
        }
    }
}