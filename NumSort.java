package week1.day2;

import java.util.Scanner;

public class NumSort {

	public static void main(String[] args) {
		int temp = 0;
		int i;
		int num [] = new int[6];
		Scanner sc = new Scanner (System.in);
		for (int a =0 ; a<num.length ; a++) {
		System.out.println("Enter The Input Number: "+ (a+1));
		num[a] = sc.nextInt();
		
	}
		for (i =0 ;i<num.length-1 ;i++) {
			
			for (int j=i+1; j<num.length;j++) {
				
				if (num[i]>num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		sc.close();
		System.out.println("The ascending order of Numbers are ");
		for(int x=0; x<=num.length-1;x++)
		{
			System.out.println(num[x]);
		}
		}
		//System.out.println("The ascending order of Numbers are "+num[0] + " " + num[1] + " "+num [2] + " "+num [3]+ " "+num [4]);
		//System.out.println("The descending order of Numbers are "+num [4] + " " + num[3] + " " + num[2] + " " + num[1] + " "+num [0]);
		//System.out.println("The Second smallest Number is " + num[1]);
		//System.out.println("The smallest Number is " + num[0]);
		//System.out.println("The largest Number is "+ num[i]);

}

