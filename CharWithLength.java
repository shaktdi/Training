package week2.day4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharWithLength {

	public static void main(String[] args) {
		
		String txt = "";
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the Input string");
		txt = sc.next();
		sc.close();
		
		Map <Character,Integer> myMap = new LinkedHashMap <> ();
		char [] myChar = txt.toCharArray();
		
		for (char eachchchk : myChar) {
			if(myMap.containsKey(eachchchk)) {
				myMap.put(eachchchk, myMap.get(eachchchk) + 1);
			} else
				myMap.put(eachchchk, 1);
		}
		System.out.println(myMap);
	}
}
