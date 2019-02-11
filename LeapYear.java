package week3.day6;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Required Year: ");
		year = sc.nextInt();
		sc.close();
		
		if (year % 4 == 0 && year % 400 == 0)
		{
			System.out.println("is a Leap Year");
		}	
		else if (year % 4 == 0 )
		{
			
			if(year%100==0)
			System.out.println("is Not a Leap Year");
			else
			System.out.println("is  a Leap Year");	
			
		} 
		else 
		{
			System.out.println("is not  a Leap Year");
		}

	}


}
