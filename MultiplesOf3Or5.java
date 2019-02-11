package week4.day8;

import java.util.Scanner;

public class MultiplesOf3Or5 {

	public static void main(String[] args) {
		int a ;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input Number :");
		a = sc.nextInt();
		sc.close();
		
		for (int i = 1; i < a ; i++) {
			  if (i%3 == 0 || i%5 == 0) {
				  System.out.println(i);
				  count = count + i;
			  }
			
		}
		System.out.println("The Sum of all Numbers is " +count);
	}
}
