import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input your birthday year: ");

        int BD = in.nextInt();
        int year = 2024;
        int age = year - BD;

        System.out.println("Your age is " + age);
    }
}
