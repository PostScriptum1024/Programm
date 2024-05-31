import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i ++){
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }

        System.out.println("Массив #1:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив #2:");
        System.out.println(Arrays.toString(arr2));

        int[] arr_result = find_duplicate_elements(arr1, arr2);

        System.out.println("Дублированные элементы из двух массивов:");
        System.out.println(Arrays.toString(arr_result));
    }

    public static int[] find_duplicate_elements(int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(elements1 -> Arrays.stream(arr2)
                .anyMatch(elements2 -> elements2 == elements1))
                .toArray();
    }
}
