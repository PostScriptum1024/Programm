import java.util.Scanner;

public class Example3_5for {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int sum = 0;
        int count_in_sum = 0;

        for (int i = 0; count_in_sum < count; i++){
            if ((i % 3 == 1) | (i % 5 == 2)){
                sum += i;
                count_in_sum += 1;
            }

        }
        System.out.println("Сумма чисел удовлетворяющих условиям: " + sum);
        System.out.println("Количество чисел, использованных при работе программы: " + count_in_sum);

    }
}
