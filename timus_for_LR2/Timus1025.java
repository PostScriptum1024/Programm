package timus_for_LR2;

import java.util.Scanner;
import java.util.ArrayList;


public class Timus1025 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> voters = new ArrayList<>();
    
        int count_of_groups = in.nextInt();
        
        int i = 0;
        while (i < count_of_groups) {
        	voters.add(in.nextInt());
        	i = i + 1;       	
        }
               
        int summ = 0;
        for (int a = 0; a < count_of_groups; a++) {
        	summ = summ + voters.get(a);
        }
        System.out.println(summ / count_of_groups + 1);
        }

}
