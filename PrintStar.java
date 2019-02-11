package week2.day4;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter how may stars has to be printed: ");
		a = sc.nextInt();
		sc.close();
		
		for (int i =1 ; i <= a ; i++) {
			
			for (int j =0; j<(a- (i-1)) ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
