import java.util.Arrays;

public class Example6_9 {
    public static void main(String[] args) {
        char[] array = {'a','b','c','d','e','f','g'};

        swap_elements(array);

        System.out.println(Arrays.toString(array));
    }

    public static void swap_elements (char[] array){
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
