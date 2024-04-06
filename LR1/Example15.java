import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first component: ");
        int first = in.nextInt();

        System.out.println("Input secondary component: ");
        int secondary = in.nextInt();

        int summ = first + secondary;
        int difference = first - secondary;

        System.out.println("Sum: " + summ);
        System.out.println("Diff: " + difference);
    }
}
