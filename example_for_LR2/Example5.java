package example_for_LR2;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Введите любое четырехзначное и более число");
		int number = in.nextInt();
		
		if (number > 999) {
			
			
			int count = number / 1000;
			
			if ((count % 100 > 10) & (count % 100 < 15)) {
				System.out.println("В вашем числе " + count + " тысяч");
			}
			
			else {
				if (count % 10 == 1) {
					System.out.println("В вашем числе " + count + " тысяча");
					}
				else if ((2 < (count%10)) & ((count%10) < 5)){
					System.out.println("В вашем числе " + count + " тысячи");
					}
				else {
					System.out.println("В вашем числе " + count + " тысяч");
					}
				}
			
		}
		else {
			System.out.println("Вы ввели число меньше чем 1000");
			}


}
}
