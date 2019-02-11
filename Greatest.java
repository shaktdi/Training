package week1.day2;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		int grtNum [] = new int [3];
		Scanner sc = new Scanner (System.in);
		for (int a =0 ; a<grtNum.length ; a++) {
			System.out.println("Enter Number : "+ (a+1));
			grtNum[a] = sc.nextInt();
		}
		sc.close();
        if (grtNum[0]>grtNum[1] && grtNum[0]>grtNum[2]) {
        	System.out.println(grtNum[0] + "Is the Greatest Number");
        } else if (grtNum[1]>grtNum[0] && grtNum[1]>grtNum[2]) {
        	System.out.println(grtNum[1] + " Is the Greatest Number");
        } else if (grtNum[2]>grtNum[0] && grtNum[2]>grtNum[1]) {
        	System.out.println(grtNum[2] + " Is the Greatest Number");
        }
		

	}

}
