package week2.day3;

import java.util.Scanner;

public class OddToUpper {

	public static void main(String[] args) {
		
		String txt = "";
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the Input string");
		txt = sc.nextLine();
		sc.close();
		txt = txt.replaceAll(" ", "");
		
		//for ( int i =1 ; i < txt.length() ; i = i+2) {
          //  System.out.print(txt.toUpperCase().charAt(i));
		//}
		
		for ( int i =0 ; i < txt.length() ; i++) {
			  if (i%2 == 0) {
	          System.out.print(txt.charAt(i));
			} else {
			  System.out.print(txt.toUpperCase().charAt(i));
			}
		}
		
		
		
				
	}

}
