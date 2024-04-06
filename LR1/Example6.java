import java.util.Scanner;
public class Example6 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Input your surname: ");
        String surname = in.nextLine();

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input your patronymic: ");
        String patronymic = in.nextLine();


        System.out.println("Hello, " + surname + " " + name + " " + patronymic);
    }
}
