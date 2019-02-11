package week5.day9and10;

import java.util.Scanner;

public class StringUnique {

	public static void main(String[] args) {
		 String txt;
		 int txtsize;
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the Input String");
         txt = sc.nextLine();
         sc.close();
         
         txt = txt.toLowerCase().replaceAll("\\s", "");
         txtsize = txt.length();
         char[] txtchar = new char [txtsize];
         txtchar = txt.toCharArray();
         String output ="";
         
         for (int i =0 ; i<txtsize ; i++) 
         {
        	 if (output.indexOf(txtchar[i]) == -1)
        	 {
        		 output = output + txtchar[i];
        	 }
         }
         
         System.out.println(output);
	}
}


