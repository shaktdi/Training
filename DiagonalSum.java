package week5.day9and10;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		int a , b , x = 1 , m = 0, n =0 , y , sum = 0 , sum1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows :");
		a = sc.nextInt();
		System.out.println("Enter the Number of Columns :");
		b = sc.nextInt();
		sc.close();
		
		int [] [] arr = new int [a] [b];
		
		
		for (int i =0 ; i<a ; i++) {
			
			for (int j =0 ; j<b ; j++) {
				System.out.print(x + " ");
				arr[i][j] = x;
				x++;
			}
			    System.out.println();
		}
		     y = a -1;
		     String display="";
		     int t=0;
		     //int[] dia1= new int[6];
         for ( int i =m ; i< a-1 ; i++) {
        	 for(int j= n ; j < y ; j++) {
        		 sum = sum + arr[i][j];
        		  display =    String.valueOf(arr[i][j])+","+ display;
        		 t++;
        	 }
        	 y--;
         }
         System.out.println("The Sum of upper diagonal is " + sum);
            int u =0;
         int[] dia2 = new int[6];
         for (int l = a-1; l>m ; l--) {
        	 for (int k=b-1; k> n ; k--) {
        		 sum1 = sum1+ arr[l][k];
        		 dia2[u] = arr[l][k];
        		 u++;
        	 }
        	 n++;
         }
         System.out.println("The Sum of lower diagonal is " + sum1);
	
       if(sum < sum1) 
       {
    	   String[] output =new String[t];
		   for ( int i =0 ; i< t ; i++) 
		   {
			   output = display.split(",");
			 System.out.print(output[i]+ " "); 
		   }
       }
	   else
	   {
		   for ( int i =0 ; i< 6 ; i++) 
		   {
			 System.out.print(dia2[i] + " "); 
		   }
	      
	   }
 }
	
}

