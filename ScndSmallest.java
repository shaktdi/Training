package week1.day2;

import java.util.Scanner;

public class ScndSmallest {

	public static void main(String[] args) {
		int x = 0;
		int num [] = new int[3];
		Scanner sc = new Scanner (System.in);
		for (int a =0 ; a<num.length ; a++) {
		System.out.println("Enter The Input Number: "+ (a+1));
		num[a] = sc.nextInt();
		sc.close();
		}
		 if (num[0]>num[1] && num[0]>num[2]) {
	        	x= 1;
	        } else if (num[1]>num[0] && num[1]>num[2]) {
	        	x= 2;
	        } else if (num[2]>num[0] && num[2]>num[1]) {
	        	x= 3;
	        }
			
         if (x == 3) {
        	 if(num[0]>num[1])
        	 {
        		 System.out.println("The Second smallest number is "+ num[0]);
        	 }
        	 else
        	 {
        		 System.out.println("The Second smallest number is "+ num[1]); 
        		 
        	 }
         }
        	 if (x == 2) {
            	 if(num[0]>num[2])
            	 {
            		 System.out.println("The Second smallest number is "+ num[0]);
            	 }
            	 else
            	 {
            		 System.out.println("The Second smallest number is "+ num[2]); 
            		 
            	 }
        	 }
            	 
            	 if (x == 1) {
                	 if(num[1]>num[2])
                	 {
                		 System.out.println("The Second smallest number is "+ num[1]);
                	 }
                	 else
                	 {
                		 System.out.println("The Second smallest number is "+ num[2]); 
                		 
                	 }
                	 }
        	 
		}
}
	

	
 

