package example_for_LR2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите любое число");
		int number = in.nextInt();
		
		
		if ((number % 5 == 2) & (number % 7 == 1)) {
			System.out.println("Число " + number + " при делении на 5 имеет остаток 2, при делении на 7 имеет остаток 1");
		}
		else {
			System.out.println("Число " + number + " не удовлетворяет условиям");
		}
	}

}
