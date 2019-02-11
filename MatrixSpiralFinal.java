package week5.day9and10;

import java.util.Scanner;

public class MatrixSpiralFinal {

	public static void main(String[] args) {
		int a , b , temp = 1, m= 0 , n =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Input No of Rows");
		a = sc.nextInt();
		System.out.println("Input No of columns");
		b = sc.nextInt();
		sc.close();
		int [] [] arr= new int [a] [b];
		
		for (int i = 0 ; i<a ; i++) {
			for (int j=0 ; j<b ; j++) {
				System.out.print(temp + " ");
				arr[i][j] = temp;
				temp ++;
			}
			System.out.println();
		}
		
        //while (m<a && n<b) {
        	
        	for (int i =n ; i<b ; i++) {
        		System.out.print(arr[m][i] + " ");
        	}
        	m++;
        	
        	for (int i =m ; i<a ; i++) {
        		System.out.print(arr[i][b-1] + " ");
        	}
        	m++;
        	
        	
        }
        	
        	
        	
        	
        	
        	
        }
	//}

