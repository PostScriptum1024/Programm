import java.util.Scanner;

public class Example3_4for {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1-е число");
        int a = in.nextInt();

        System.out.println("Введите 2-е число");
        int b = in.nextInt();

        for (int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
