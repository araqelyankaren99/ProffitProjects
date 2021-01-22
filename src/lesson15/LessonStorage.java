package lesson15;

public class LessonStorage {
    private Lesson[] array = new Lesson[16];
    private int size = 0;

    public void add(Lesson value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public Lesson getLessonByLessonName(String name) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(name)) {
                return array[i];
            }
        }
        return null;
    }
}