package lesson15;

import java.util.Date;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentStorage studentStorage = new StudentStorage();
        LessonStorage lessonStorage = new LessonStorage();
        boolean isRan = true;
        comment();
        while (isRan) {
            String string = scanner.nextLine();
            switch (string) {

                case "0":
                    isRan = false;
                    break;

                case "1":
                    System.out.println("Please enter name ");
                    String name = scanner.nextLine();
                    boolean validName = name.matches("[A-Z][a-z]*");
                    if (!validName) {
                        throw new RuntimeException("invalid name");
                    }

                    System.out.println("Please enter surname ");
                    String surname = scanner.nextLine();
                    boolean validSurname = surname.matches("[A-Z][a-z]*");
                    if (!validSurname) {
                        throw new RuntimeException("invalid surname");
                    }

                    System.out.println("Please enter phone");
                    String phone = scanner.nextLine();
                    boolean validPhone = phone.matches("^\\+374\\d{8}");
                    if (!validPhone) {
                        throw new RuntimeException("invalid phone");
                    }

                    System.out.println("Please enter email");
                    String email = scanner.nextLine();
                    boolean validEmail = email.matches("^(.+)@(.+)$");
                    if (!validEmail) {
                        throw new RuntimeException("invalid email");
                    }

                    System.out.println("Please enter lessons names");
                    String lesson1 = scanner.nextLine();
                    String[] lessonNames = lesson1.split(",");


                    System.out.println("Please enter lessons durations");
                    String lesson2 = scanner.nextLine();
                    String[] lessonDuration = lesson2.split(",");
                    int[] lessonDurationInts = new int[lessonDuration.length];
                    for (int i = 0; i < lessonDuration.length; i++) {
                        lessonDurationInts[i] = Integer.parseInt(lessonDuration[i]);
                    }

                    System.out.println("Please enter lessons price");
                    String lesson3 = scanner.nextLine();
                    String[] lessonPrice = lesson3.split(",");
                    double[] doubleLessonPrice = new double[lessonPrice.length];
                    for (int i = 0; i < lessonPrice.length; i++) {
                        doubleLessonPrice[i] = Double.parseDouble(lessonPrice[i]);
                    }

                    System.out.println("Please enter lessons lecturerNames");
                    String lesson4 = scanner.nextLine();
                    String[] lessonLecturerName = lesson4.split(",");
                    int length1 = lessonNames.length;
                    int length2 = lessonDurationInts.length;
                    int length3 = lessonPrice.length;
                    int length4 = lessonLecturerName.length;
                    if (length1 != length2 || length1 != length3 || length1 != length4) {
                        throw new RuntimeException("invalid data");
                    }

                    Lesson[] lessons = new Lesson[length1];
                    for (int i = 0; i < lessons.length; i++) {
                        Lesson lesson = new Lesson(lessonNames[i],
                                lessonDurationInts[i], doubleLessonPrice[i], lessonLecturerName[i]);
                        lessons[i] = lesson;
                        lessonStorage.add(lessons[i]);
                    }

                    System.out.println("Please enter rating");
                    double rating = Double.parseDouble(scanner.nextLine());

                    Student student = new Student(name, surname, phone, email,
                            new Date(), lessons, rating);
                    studentStorage.add(student);
                    break;

                case "2":
                    System.out.println("Please enter lesson name");
                    String lessonName2 = scanner.nextLine();

                    System.out.println("Please enter lesson duration");
                    int lessonDuration2 = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please enter lesson price");
                    double lessonPrice2 = Double.parseDouble(scanner.nextLine());

                    System.out.println("Please enter lesson lecturerName");
                    String lessonLecturerName2 = scanner.nextLine();

                    Lesson lesson = new Lesson(lessonName2, lessonDuration2, lessonPrice2,
                            lessonLecturerName2);
                    lessonStorage.add(lesson);
                    break;

                case "3":
                    studentStorage.print();
                    break;

                case "4":
                    lessonStorage.print();
                    break;

                case "5":
                    System.out.println("Please enter student name");
                    String studentName = scanner.nextLine();
                    Student studentByName = studentStorage.getStudentByName(studentName);

                    System.out.println("Please enter lessons name");
                    String lessonsName = scanner.nextLine();
                    String[] lessonsNames = lessonsName.split(",");
                    Lesson[] lessons1 = studentByName.getLessons();
                    for (int i = 0; i < lessons1.length - 1; i++) {
                        lessons1[i].setName(lessonsNames[i]);
                    }
                    break;

                case "6":
                    System.out.println("Please enter lesson name");
                    String lessonName = scanner.nextLine();
                    Lesson lessonByLessonName = lessonStorage.getLessonByLessonName(lessonName);
                    Student studentByLesson = studentStorage.getStudentByLesson(lessonByLessonName);
                    System.out.println(studentByLesson);
            }
        }
    }

    private static void comment() {
        System.out.println("0_Exit");
        System.out.println("1_ADD_STUDENT");
        System.out.println("2_ADD_LESSON");
        System.out.println("3_PRINT_STUDENTS");
        System.out.println("4_PRINT_LESSONS");
        System.out.println("5_CHANGE_STUDENT_LESSON");
        System.out.println("6_PRINT_STUDENTS_BY_LESSON_NAME");
    }
}