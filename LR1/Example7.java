import java.util.Scanner;
public class Example7 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input your age: ");
        String age = in.nextLine();


        System.out.println("Your name is " + name + " and your age is " + age + ".");
    }
}
