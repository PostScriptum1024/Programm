import java.util.Scanner;

public class Example3_3while {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите желаемый размер выводимой последовательности чисел Фибоначи");
        int count = in.nextInt();

        int a = 0;
        int b = 1;
        int q = 0;

        while(q < count){

            int c = a + b;
            a = b;
            b = c;

            q += 1;

            System.out.println(a);
        }
    }
}
