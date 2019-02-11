package week2.day3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a;
		int y = 1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number: ");
		a = sc.nextInt();
		sc.close();
	
	for ( int i = a ; i> 0;i--)
	{
			y = y * i;		
	}

	 System.out.println("The Factorial of " + a + " is " + y);
}
}

