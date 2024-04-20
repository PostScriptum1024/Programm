import java.util.Scanner;

public class Example3_3for {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите желаемый размер выводимой последовательности чисел Фибоначи");
        int count = in.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 0; i < count; i++){

            int c = a + b;
            a = b;
            b = c;

            System.out.println(a);
        }
    }
}
