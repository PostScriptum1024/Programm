import java.util.Arrays;

public class Example6_7 {
    public static void main(String[] args) {
        char[] array = {'a', 'b','c','d','e','f'};

        int[] code = to_code(array);

        System.out.println(Arrays.toString(code));
    }

    public static int[] to_code(char[] array){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++){
            result[i] = (int) array[i];
        }
        return result;
    }
}
