package lesson13and14and22;

public class WorkStorage {
    private Work[] array = new Work[16];
    private int size = 0;

    public void add(Work value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Work[] tmp = new Work[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
