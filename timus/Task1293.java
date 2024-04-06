import java.util.Scanner;
public class Task1293 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("1 число - количество панелей, 2 и 3 - стороны панелей: ");

        String[] E_panels = in.nextLine().split(" ");
        int count_P = Integer.decode(E_panels[0]);
        int square_A = Integer.decode(E_panels[1]);
        int square_B = Integer.decode(E_panels[2]);

        int Square = square_A * square_B;
        int count_S = (count_P * Square) * 2;

        System.out.println("Требуемое количество сульфида: " + count_S);

    }
}
