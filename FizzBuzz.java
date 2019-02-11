package week2.day4;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int a , b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number:1 ");
		a = sc.nextInt();
		System.out.println("Enter The Input Number:2 ");
		b = sc.nextInt();
		sc.close();
		
		if (a <=b) {
			
		} else {
			System.out.println("The value of a " + a + " is greater than b " + b + ". Provide a Valid Input" );
			System.exit(0);
		}
        for (int i = a ; i <= b ; i++) {
        	if (i % 3 == 0 && i% 5 == 0) {
        		System.out.print("FIZZBUZZ ");
        	} else if (i % 5 ==0) {
        		System.out.print("BUZZ ");
        	} else if (i % 3 == 0) {
        		System.out.print("FIZZ ");
        	} else {
        		System.out.print(i + " ");
        	}
        	
        }
	}

}
