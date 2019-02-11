package week8.day15and16;

import java.util.Scanner;

public class NoofDaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input Month Number-");
		int inMonth;
		inMonth = sc.nextInt();
		System.out.println("Enter the input year -");
		int inYear;
		inYear = sc.nextInt();
		sc.close();
		
		switch (inMonth) {
		case 1:
			System.out.println("January "+inYear+ " has 31 days");
			break;
			
		case 2:
			if (inYear % 4 == 0 && inYear % 400 == 0)
			{
				System.out.println("February "+inYear+ " has 29 days");
			}	
			else if (inYear % 4 == 0 )
			{
				
				if(inYear%100==0)
				System.out.println("February "+inYear+ " has 28 days");
				else
				System.out.println("February "+inYear+ " has 29 days");	
				
			} 
			else 
			{
				System.out.println("February "+inYear+ " has 28 days");
			}
			
		case 3:
			System.out.println("March "+inYear+ " has 31 days");
			break;
        
		case 4:
			System.out.println("April "+inYear+ " has 30 days");
			break;

		case 5:
			System.out.println("May "+inYear+ " has 31 days");
			break;

		case 6:
			System.out.println("June "+inYear+ " has 30 days");
			break;

		case 7:
			System.out.println("July "+inYear+ " has 31 days");
			break;

		case 8:
			System.out.println("August "+inYear+ " has 31 days");
			break;

		case 9:
			System.out.println("September "+inYear+ " has 30 days");
			break;

		case 10:
			System.out.println("October "+inYear+ " has 31 days");
			break;
			
		case 11:
			System.out.println("November "+inYear+ " has 30 days");
			break;

		case 12:
			System.out.println("December "+inYear+ " has 31 days");
			break;

		default:
			System.out.println("Please Enter a valid Month");
			break;
		}
		
		
		

	}

}
