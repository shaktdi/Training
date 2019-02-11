 package week1.day2;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		int count = 0 , x = 0 , y, sum = 0;
		String b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number: ");
		int a = sc.nextInt();
		b = Integer.toString(a);
		//b = sc.next().toString();
		//int a = Integer.parseInt(b);
		sc.close();
		
	while(count < b.length()) {
		x = a / 10; //578 57 5
		y = a % 10; //9 8 7
		
		if (y % 2 != 0) {
		    sum = y + sum; //9 7 (7+9=16) (16+5=21)
		}
		a = x; //578 57 5
		count ++;

	}
	System.out.println("The sum of Odd digits is "+ sum);
}
}


