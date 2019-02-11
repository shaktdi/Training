package week2.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MobileModels {

	public static void main(String[] args) {
		Set<String> mobModels = new TreeSet<>();
		mobModels.add("Nokia");
		mobModels.add("Samsung");
		mobModels.add("Redmi");
		mobModels.add("Apple");
		mobModels.add("Motorola");
		
        for (String eachModel : mobModels) {
        	System.out.println(eachModel);
			
		}
        
        int size = mobModels.size();
        System.out.println("The Models available are " + size );
        
        List <String> everyMob = new ArrayList <> (mobModels);
        System.out.println("The Second Mobile Model is " + everyMob.get(1));
        
        String LastMobile = everyMob.get(everyMob.size() -1 );
        System.out.println("The Last Mobile Model is " + LastMobile);
        
        everyMob.remove(everyMob.size() -1);
        System.out.println("The last Mobile Model is removed");
        
        //for (String eachModel1 : everyMob) {
        	//System.out.println(eachModel1);
			
		//}
         int a = (everyMob.size() -1);
         
        for (int i = a ; i <= everyMob.size() ; i --) {
        	
        	if (i >= 0) {
        	System.out.println(everyMob.get(i));
        } else {
        	break;
        }
        
          
	}
	}
}
