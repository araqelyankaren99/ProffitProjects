package lesson13and14and22;


import java.util.Arrays;

public class DataStorage {

    private User[] array = new User[16];
    private int size = 0;


    public void add(User value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        User[] tmp = new User[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }


    public User[] getArray() {
        return array;
    }

    public String[] userNames(){
        String[] result = new String[array.length];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] != null) {
                result[i] = array[i].getUsername();
            }
        }

        return  result;
    }

    @Override
    public String toString() {
        return "DataStorage{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
