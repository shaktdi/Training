package week3.day6;

public class ScndMaxNum {

	public static void main(String[] args) {
		int temp = 0;
		int i , a;
		int num [] = {20,340,21,879,92,21,474,83647,-200};
		//int num[] = { -100,-200,-300,-350,-400,-450,-500};
		
		for (i =0 ;i<num.length-1 ;i++) {
			
			for (int j=i+1; j<num.length;j++) {
				
				if (num[i]>num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		    a = num.length - 2;
			System.out.println("The Second Maximum Number is " + num[a]);	
	}
}

