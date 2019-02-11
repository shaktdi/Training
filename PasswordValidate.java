package week4.day8;

import java.util.Scanner;

public class PasswordValidate {

	public static void main(String[] args) {
		String passWord;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Password to be Vaidated ");
		passWord = sc.next();
		sc.close();
		
	if ((passWord.length() >=10)) 
	{
		if (passWord.matches("[a-zA-z0-9]*")) {		 
		System.out.println("Password is having only letters and digits");
		
		   if (passWord.matches("(?=(.*[A-Z]){1})")) {
			   System.out.println("The Password is having at least one capital letter");
				 
				 if(passWord.matches("(?=(.*\\d){2})(?=(.*[A-Za-z]){2})")) {
				 System.out.println("The Password has atleast 2 numbers and digits");
				 System.out.println("This is a Valid Password");
			    } else 
			    {
			    System.out.println("The Password does not have atleast 2 numbers and digits");
			    }
				 
		    } else 		 
		    {
		    System.out.println("The Password does not have atleast one capital letter");
		    }	
	     } else 
	     {
	     System.out.println("Password is having characters other than letters and digits");
	     }
	} else 
	{
    System.out.println("Password should have atleast 10 characters");
	}		 
}

}

