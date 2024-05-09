import java.util.Arrays;

public class Example6_6 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(cut(array, 2)));
        System.out.println(Arrays.toString(cut(array, 8)));

    }

    public static int[] cut (int[] array, int n){
        if (n > array.length){
            return Arrays.copyOf(array, array.length);
        }
        return Arrays.copyOfRange(array, 0,n);
    }
}
