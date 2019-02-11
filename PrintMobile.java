package week1.day2;

import java.util.Scanner;

public class PrintMobile {
 
	public static void main(String[] args) {
		String brandName [] = new String [10];
		Scanner sc = new Scanner (System.in);
		for (int a =0 ; a<brandName.length ; a++) {
			System.out.println("Enter Brand Name: "+ (a+1));
			brandName[a] = sc.next();
		}
		sc.close();
		for (String eachmobBrand : brandName) {
			System.out.println(eachmobBrand);
		}

	}

} 
