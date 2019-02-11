package week1.day2;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		
		int sum = 0;
		//int sumNum [] = {13,25,9,56,54,89,17};
		//int sumNum [] = new int [20];
		int length = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Length of the Input Numbers: ");
		length = sc.nextInt();
		int sumNum [] = new int [length];
		
		for (int a =0 ; a<length ; a++) {
			System.out.println("Enter the Numbers: "+ (a+1));
			sumNum[a] = sc.nextInt();
		}
		sc.close();
		
		for (int i =0 ; i<length ; i++) {
			  sum = sumNum[i] + sum;
		}
		System.out.println("The Sum of Numbers in the Array is " + sum);
	}

}
