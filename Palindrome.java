package week2.day4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int a , count = 0 , b = 1 ;
		String txtb;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number: ");
		a = sc.nextInt();
		txtb = Integer.toString(a);
		sc.close();
		
		for (int i = 0 ; i < txtb.length() ; i ++) {
			if (txtb.charAt(i) == txtb.charAt(txtb.length() - b)) {
				count++;
			} 
			b = b +1;
		}
		if (count == txtb.length()) {
			System.out.println("The Provided Number " + a + " Is a Palindrome");
		}
		else {
			System.out.println("The Provided Number " + a + " Is Not a Palindrome");
		}
	}

}
