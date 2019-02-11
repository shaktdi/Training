package week3.day6;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		
		int a,b=1,j;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number of rows to be printed: ");
		a = sc.nextInt();
		sc.close();
		
		for (int i = 0 ; i < a ; i++) {
			
			for ( j = b ; j <= i+b ; j++) 
			{
			   System.out.print(j); 
		    }
			b=j;
			System.out.println();
	}
}
}
