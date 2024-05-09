import java.util.Arrays;

public class Example6_10 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] result = min_max(numbers);

        System.out.println(Arrays.toString(result));
    }

    public static int[] min_max (int... numbers){
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers){
            if (number > max){
                max = number;
            }
            else if (number < min){
                min = number;
            }
        }
        return new int[] {min, max};
    }
}
