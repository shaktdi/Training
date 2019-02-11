package week1.day2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a;
		int [] num = new int [20];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number: ");
		a= sc.nextInt();
		sc.close();
		
		num[0] = 0;
		num[1] = 1;
		
		if (a==0) {
			System.out.println("Invalid Number");
		} else if (a == 1) {
			System.out.println(num[0]);
			System.out.println(num[1]);
			System.out.println(num[1]);
		  } else if (a >= 2) {
			System.out.println(num[0]);
			System.out.println(num[1]);
		  }
		
		for (int i =2; i<=a;i++) {
			
			num [i] = num[i-1] + num [i-2];
			if (num[i] < a) {
				System.out.println(num[i]);
			}
			
		}
		
	}

}
