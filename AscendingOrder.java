package week5.day9and10;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Input Number:");
		num = sc.nextInt();
		sc.close();
		String input;
		input = Integer.toString(num);
		int length = input.length();
		char [] inputchar = new char [length];
		inputchar = input.toCharArray();
		char temp ;
		String output = "";
		
		for (int i = 0 ; i < length-1 ; i++)
		{
			for (int j = i+1 ; j < length ; j++) 
			{
				if (inputchar[i] > inputchar[j]) 
				{
					temp = inputchar[i];
					inputchar[i] = inputchar[j];
					inputchar[j] = temp;
				}
			}
		}
		System.out.println(inputchar);
		
		for (int x= 0 ; x < length ; x++) 
		{
			if (output.indexOf(inputchar[x]) == -1)
			{
				output = output + inputchar[x];
			}
		}
		
		System.out.println(output);
		
	}

}
