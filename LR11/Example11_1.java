import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example11_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++){
            array[i] = random.nextInt();
        }

        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));

        int[] array_result = filter_even_numbers(array);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array_result));
    }

    public static int[] filter_even_numbers(int[] array){
        return Arrays.stream(array)
                .filter(number -> number % 2 == 0)
                .toArray();
    }
}