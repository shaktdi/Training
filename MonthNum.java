package week1.day2;

import java.util.Scanner;

public class MonthNum {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number: ");
		a= sc.nextInt();
		sc.close();
		
		if (a == 1) {
			System.out.println("The " + a + " st Month of the year is January");
			System.out.println("Number of days in the Month of January is 31");
		} else if (a == 2) {
			System.out.println("The " + a + " nd Month of the year is February");
			System.out.println("Number of days in the Month of February is 28");
		} else if (a == 3) {
			System.out.println("The " + a + " rd Month of the year is March");
			System.out.println("Number of days in the Month of March is 31");
		} else if (a == 4) {
			System.out.println("The " + a + " th Month of the year is April");
			System.out.println("Number of days in the Month of April is 30");
		} else if (a == 5) {
			System.out.println("The " + a + " th Month of the year is May");
			System.out.println("Number of days in the Month of May is 31");
		} else if (a == 6) {
			System.out.println("The " + a + " th Month of the year is June");
			System.out.println("Number of days in the Month of June is 30");
		} else if (a == 7) {
			System.out.println("The " + a + " th Month of the year is July");
			System.out.println("Number of days in the Month of July is 31");
		} else if (a == 8) {
			System.out.println("The " + a + " th Month of the year is August");
			System.out.println("Number of days in the Month of August is 31");
		} else if (a == 9) {
			System.out.println("The " + a + " th Month of the year is September");
			System.out.println("Number of days in the Month of September is 30");
		} else if (a == 10) {
			System.out.println("The " + a + " th Month of the year is October");
			System.out.println("Number of days in the Month of October is 31");
		} else if (a == 11) {
			System.out.println("The " + a + " th Month of the year is November");
			System.out.println("Number of days in the Month of November is 30");
		} else if (a == 12) {
			System.out.println("The " + a + " th Month of the year is December");
			System.out.println("Number of days in the Month of December is 31");
		} else {
				System.out.println("Invalid Number");
			}
		}
		

	}


