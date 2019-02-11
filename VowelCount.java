package week8.day15and16;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String :");
		String inString;
		inString = sc.nextLine().toLowerCase();
		sc.close();
		char[] charArray = inString.toCharArray();
		char[] vowArray = {'a','e','i','o','u'};
		int count = 0;
		
		for(int i=0; i<charArray.length; i++)
		{
			for(int j=0; j<vowArray.length;j++)
			{
				if(charArray[i] == vowArray[j])
				{
					count++;
				}
			}
			
		}
		System.out.println(count);
		

	}

}
