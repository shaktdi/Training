package week1.day2;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number - ");
		int inNum = sc.nextInt();
		sc.close();
        if (inNum%2 == 0) {
        	System.out.println(inNum + " Is a Even Number");
		} else {
			System.out.println(inNum + " Is a Odd Number");
		}

	}

}
