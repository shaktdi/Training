package week7.day13and14;

import java.util.Scanner;

public class Diamondvidya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);  
		System.out.print("Please enter a Number to print pattern: ");  
		int numb = input.nextInt();  
		input.close();
		int count=2;
		
		for(int i=1;i<=numb;i=i+2) 
		{
			if(i!=numb)
				for(int l=1;l<=numb-count;l++)
				{
					System.out.print(" ");
				}
			
		for(int j=1;j<=i;j++)
		{
			
			if(j<=numb)
			{
				
				System.out.print(j +" " );
			}
		}
		
		if(i!=numb)
			for(int l=1;l<=numb-count;l++)
			{
				System.out.print(" ");
			}
		System.out.println();
		count++;
		}
		
		count--;
		
		for(int i=numb-2;i>=1;i=i-2) 
		{
		
			if(i!=numb)
				for(int l=1;l<=numb-count;l++)
				{
					System.out.print(" ");
				}
		for(int j=1;j<=i;j++)
		{
			if(j<=numb)
			{
				
				System.out.print(j +" " );
			}
		}
		if(i!=numb)
			for(int l=1;l<=numb-count;l++)
			{
				System.out.print(" ");
			}
		System.out.println();
		count--;
		}

	}

}
