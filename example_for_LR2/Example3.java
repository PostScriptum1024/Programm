package example_for_LR2;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Введите любое число");
		int number = in.nextInt();
		
		if ((number % 4 == 0) & (number > 10)) {
			System.out.println("Ваше число делится без остатка на 4 и больше 10");
		}
		else {
			System.out.println("Ваше число не делится без остатка на 4 и/или меньше 10");
		}
	}

}
