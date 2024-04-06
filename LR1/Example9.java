import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input any month: ");
        String month = in.nextLine();

        System.out.println("Input the number of days in a month: ");
        int count = in.nextInt();


        System.out.println("Month: " + month);
        System.out.println("Days in a month: " + count);
    }
}
