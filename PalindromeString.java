package week2.day4;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String txt , txt1;
		int b = 1 , count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Input String: ");
		txt = sc.nextLine();
		txt1 = txt.toLowerCase();
		sc.close();
		
        for (int i = 0 ; i < txt1.length() ; i++) {
        	if (txt1.charAt(i) == txt1.charAt(txt1.length() -b)) {
        		count ++;
        	}
        	b = b +1;   	
        }
        if (count == txt1.length()) {
        	System.out.println("The String " + txt + " is a Palindrome");
        } else {
        	System.out.println("The String " + txt + " is Not a Palindrome");
        }
	}

}
