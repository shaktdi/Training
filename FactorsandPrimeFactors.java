package week8.day15and16;

import java.util.Scanner;

public class FactorsandPrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input Number -");
		int num;
		num = sc.nextInt();
		sc.close();
		FactorsandPrimeFactors nsfact = new FactorsandPrimeFactors();
		nsfact.nonstaticFactors(num);
		System.out.println();
		System.out.println("All Prime factors of " +num+ " are");
		FactorsandPrimeFactors.staticPrimeFactors(num);
		
	}
	
	public void nonstaticFactors(int a)
	{
		System.out.println("All factors of " +a+ " are");
		for(int i = 1 ; i <= a ; i++)
		{
			if (a%i == 0)
			{
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	public static void staticPrimeFactors(int b)
	{
		int j;
		
		for(int i =2 ; i <= b ; i++ )
		{
			if (b % i == 0  ) 
			{
				for( j=2;j<=i;j++)
				{
					if(i%j==0)
					{
						break;
					}
					
				}
				if(i==j)
				{
					System.out.print(i + " ");
				}	
				
			}
				
		}
		
	}
	
}
