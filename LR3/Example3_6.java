import java.util.Scanner;

public class Example3_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        if (count > 0) {
            int numbers[] = new int[count];

            int q = 0;
            int w = 0;

            for (int i = 0; w < numbers.length; i++) {
                if (i % 5 == 2) {
                    numbers[q] = i;
                    w += 1;
                    q += 1;
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
        else {
            System.out.println("Введите положительное число, отличное от нуля!");
        }
    }
}
