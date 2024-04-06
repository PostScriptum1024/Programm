import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();
        int year = 2024;
        int Brth_Yr = year - age;

        System.out.println("Your birthday year is: " + Brth_Yr);
    }
}
