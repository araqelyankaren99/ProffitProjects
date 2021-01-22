import java.util.Arrays;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * ints.length) + 1;
        }
        System.out.println(Arrays.toString(ints));
        int max = ints[0];
        for (int anInt : ints) {
            if (anInt > max) {
                max = anInt;
            }
        }
        System.out.println(max);
        int count = 0;
        int multiple = 1;
        double avg;
        int sum = 0;
        int count1 = 0;
        for (int anInt : ints) {
            if (anInt % 2 == 0) {
                System.out.print(anInt + " ");
                count++;
                if(anInt==0){
                    continue;
                }
                multiple*=anInt;
            }
        }
        System.out.println();
        for (int anInt : ints) {
            if (anInt % 2 != 0) {
                System.out.print(anInt + " ");
            }
        }
        System.out.println(count);
        System.out.println(multiple);
        for (int anInt : ints) {
            count1++;
            sum += anInt;
        }
        avg = (double) sum/count1;
        System.out.println(avg);
        for (int i = 0; i <ints.length ; i++) {
            if(ints[i]<0){
                ints[i]=0;
            }
        }
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        for (int anInt : ints) {
            if (anInt % 2 == 0) {
                System.out.print(anInt + " ");
            }
        }
        for (int i = 0; i <ints.length ; i++) {
            if(ints[i]>(int) avg){
                System.out.print(i + " ");
            }
        }
    }
}
