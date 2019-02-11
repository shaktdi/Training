package week3.day6;

public class ArmstrongVidya {

	public static void main(String[] args) {
		
        int a , x , y , sum , temp;	
		for (int i = 100 ; i <= 999 ; i++) {
			temp=i;
			a = 0;
			sum = 0;
			while( a<3)
			{
		    x = temp / 10; 
			y = temp % 10;
			sum= (y*y*y +  sum);
			temp=x;
			a++;
			
			}
		
			if ( i == sum) {
				System.out.println(i);
			}
	}
}
}
