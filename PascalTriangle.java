package week8.day15and16;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input Number");
		int num = sc.nextInt();
		sc.close();
		int value;
		
		for(int i=0; i <num ; i ++)
		{
			for(int j=num; j>i ; j--)
			{
				System.out.print(" ");
			}
			value = 1;
			for(int k=0 ; k<=i ; k++)
			{
				System.out.print(value + " ");
				value = value * (i-k)/(k+1);
			}
			System.out.println();
			
		}
		
	}

}
