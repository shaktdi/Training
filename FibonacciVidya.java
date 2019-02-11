package week1.day2;

import java.util.Scanner;

public class FibonacciVidya {

	public static void main(String[] args) {

		
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number: ");
		n= sc.nextInt();
		sc.close();
		
		int a = 0;
		int b = 1;
		int sum = 1;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(sum);
        
		for (int i =0;i<n; i=b+0) {
			b = sum;
			sum = sum+i;
			if (sum <n) {
			System.out.println(sum);
			}
		}
	}

}
