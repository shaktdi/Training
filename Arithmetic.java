package week2.day4;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int a , b , x = 0;
		String txt ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Input Number:1 ");
		a = sc.nextInt();
		System.out.println("Enter The Input Number:2 ");
		b = sc.nextInt();
		System.out.println("Enter the Arithmetic Operation to be performed");
		txt = sc.next();
		sc.close();
		
        switch (txt) {
        case "Add":
        	x = a + b;
        	System.out.println("The sum of two numbers is "+ x);
        	break;
        case "Subtract":
        	x = a - b;
        	System.out.println("The subtraction of two numbers is "+ x);
        	break;
        case "Multiply":
        	x = a * b;
        	System.out.println("The multiplication of two numbers is "+ x);
        	break;
        case "Divide":
            x = a / b;
            System.out.println("The division of two numbers is "+ x);
            break;
        default:
           System.out.println("Invalid Arithmetic operation");
           break;
                   
        }
	}

}
