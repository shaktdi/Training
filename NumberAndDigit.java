package week4.day8;

import java.util.Scanner;

public class NumberAndDigit {

	public static void main(String[] args) {
		
		int a , b ;
		
		String txt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input Number :");
		a = sc.nextInt();
		System.out.println("Enter the Input digit");
		b = sc.nextInt();
		txt = Integer.toString(a);
		sc.close();
		
		for (int i = a-1; i < a ; i--) 
		{
			int j = i;
			int count = 0;
			   for (int x =0 ; x < txt.length() ; x++) 
			  {
			    if(j%10 == b ) 
			    {
				count ++;
			    }
			    j=j/10;
			  }
			
			if (count == 0) 
			{
				System.out.println(i);
				break;
			}
			
			
	}
		
		
		

	}

}
