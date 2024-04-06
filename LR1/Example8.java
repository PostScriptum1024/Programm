import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input current day of the week: ");
        String DotW = in.nextLine();

        System.out.println("Input current month: ");
        String month = in.nextLine();

        System.out.println("Input current date: ");
        int date = in.nextInt();


        System.out.println("Date: " +  " " + DotW + " " + date + " " + month);
    }
}
