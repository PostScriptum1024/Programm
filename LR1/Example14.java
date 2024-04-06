import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input your number: ");
        int num = in.nextInt();

        System.out.println(num - 1);
        System.out.println(num);
        System.out.println(num + 1);
        System.out.println(pow(num-1, 2) + pow(num, 2) + pow(num+1, 2) + 2*((num-1)*num) + 2*(num-1)*(num+1) + 2*(num*(num+1)));

    }


    public static int pow(int value, int powValue){                 // Функция возведения числа в любую степень
        int result = 1;

        for (int a = 1; a <= powValue; a++){
            result = result * value;
        }
        return result;
    }
}
