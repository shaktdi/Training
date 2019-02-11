package week1.day2;

public class StrFind {

	public static void main(String[] args) {
	   String word = "Welcome To Automation World";
	   String splitWord [] = word.split(" ");
	   for (String eachword:splitWord) {
		   if (eachword.startsWith("W")) {
			   System.out.println(eachword);
		   }
		   if (eachword.endsWith("n")) {
			   System.out.println(eachword);
			}
				
		   }
	   
	   for (String eachword:splitWord) {
		   if (eachword.startsWith("A")) {
			   System.out.print(eachword + " ");
		   }
		   if (eachword.endsWith("d")) {
			   System.out.print(eachword);
			}
				
		   }
	     
	   }
	  
	   

	}
