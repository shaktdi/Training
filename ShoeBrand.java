package week2.day4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ShoeBrand {

	public static void main(String[] args) {
		
		Map<String,Integer> ShoeBrdCnt = new TreeMap <> ();
		ShoeBrdCnt.put("Bata", 250);
		ShoeBrdCnt.put("Adidas", 240);
		ShoeBrdCnt.put("Puma", 100);
		ShoeBrdCnt.put("Khadims", 300);
		ShoeBrdCnt.put("Paragon",350);
		ShoeBrdCnt.put("Luna", 280);
		ShoeBrdCnt.put("VKCPride", 350);
		ShoeBrdCnt.put("Miamicushion", 50);
		ShoeBrdCnt.put("Woodlands", 25);
		ShoeBrdCnt.put("Hushpuppies", 10);
		
		System.out.println(ShoeBrdCnt);
        int max = 0;
        int min = 0;
        int temp = 0;
        
        for (Entry<String,Integer> each : ShoeBrdCnt.entrySet()) {
        	if (max < each.getValue()) {
        		max = each.getValue();
        	}
        }
        
        System.out.println("The Shoe Brand with max count is ");
        
        for (Entry<String,Integer> each1 : ShoeBrdCnt.entrySet()) {
        	if (max == each1.getValue()) {
        		System.out.print(" " + each1.getKey());
        		System.out.println(" " + each1.getValue());
        	}
        }  
        
        temp = max;
        for (Entry <String,Integer> each2: ShoeBrdCnt.entrySet()) {
        	 if ( temp > each2.getValue())
        	 {
        		 min = each2.getValue();
        		 temp = min;
        	 }
        }
       System.out.println("The Shoe Brand with min count is ");
        
        for (Entry<String,Integer> each3 : ShoeBrdCnt.entrySet()) {
        	if (min == each3.getValue()) {
        		System.out.print(" " + each3.getKey());
        		System.out.print(" " + each3.getValue());
        	  }
        }      
			
	}
}

