package week4.day8;

import java.util.Scanner;

public class PasswordValidateNew {

	public static void main(String[] args) 
{
		String passWord;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Password to be Vaidated ");
		passWord = sc.next();
		sc.close();
		boolean isValid = passwordValidator(passWord);
		
		if (isValid == true) 
		{
            System.out.println("Your password is valid.");
        }
        else 
        {
            System.out.println("Your password is invalid.");
        }

}
	
	public static boolean passwordValidator(String passWord) {
		boolean isValid = true;
		int digit = 0;
		int letter = 0;
		int capLetter = 0;
		
		if (passWord.length() < 10) {
	        return false;
	    }
	    char ch;
	    /* Check if the password has 2 or more digits and letters */
	    for(int index = 0; index < passWord.length(); index++ ){
	        /* Check each char in the String */
	        ch = passWord.charAt( index );
	        if ( !Character.isLetterOrDigit(ch)){
	        	return false;
	        }
	        /* Check if it is a digit or not */
	        if( Character.isDigit(ch) ){
	            /* It is a digit, so increment digit */
		    digit ++;
	        } else if ( Character.isLetter(ch)) {
	        letter ++;
	        }
	        if(Character.isUpperCase(ch)) {
	        capLetter ++;
	        }
	    }
	    /* Now check for the count of digits in the password */
	    if( digit < 2 || letter <2 || capLetter <=1  ){
	        return false;
	    }
	return isValid;
	}
}