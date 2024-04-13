package example_for_LR2;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите любое число, чтобы проверить, делится ли оно на 3");
		int number = in.nextInt();
		
		
		if (number % 3 == 0) {
			System.out.println("Число " + number + " можно разделить на 3");
		}
		else {
			System.out.println("Число " + number + " нельзя разделить на 3");
		}
	}

}
