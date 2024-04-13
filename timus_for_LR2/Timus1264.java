package timus_for_LR2;

import java.util.Scanner;

public class Timus1264 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите 2 числа через пробел: ");

		String[] NM = in.nextLine().split(" ");
		
		int N = Integer.decode(NM[0]);
		int M = Integer.decode(NM[1]);
		
		System.out.println(N * (M+1));
	}

}
