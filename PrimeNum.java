package week1.day2;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number - ");
		int inNum = sc.nextInt();
		int i;
		sc.close();
		
		for( i=2;i<inNum;i++)
		{
			if(inNum%i==0)
			{
				System.out.println(inNum + " Is Not a prime Number");
				break;
			}
			
		}
     	if(i==inNum)
		{

			System.out.println(inNum + " Is a prime Number");
		}
		
		}
		
	}

		
	


