package lesson15;

import java.util.Arrays;

public class StudentStorage {
    private Student[] array = new Student[16];
    private int size = 0;

    public void add(Student value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Student[] tmp = new Student[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public Student getStudentByName(String name) {
        for (int i = 0; i <size ; i++) {
            if (array[i].getName().equals(name)) {
                return array[i];
            }
        }
        return null;
    }


    public Student getStudentByLesson(Lesson lesson){
        for (int i = 0; i <size ; i++) {
            Lesson[] lessons = array[i].getLessons();
            if(lessons[i].equals(lesson)){
                return array[i];
        }
    }
        return null;
    }
    @Override
    public String toString() {
        return "StudentStorage{" + "array=" + Arrays.toString(array) + ", size=" + size + '}';
    }
}
