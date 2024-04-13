package example_for_LR2;

import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Введите любое число");
		int number = in.nextInt();
		
		if ((5 <= number) & (number <= 10)) {
			System.out.println("Ваше число находится в пределах от 5 до 10 включительно");
		}
		else {
			System.out.println("Ваше число не находится в пределах от 5 до 10 включительно");
		}
	}
}
