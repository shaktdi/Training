package week3.day6;

public class Armstrong {

	public static void main(String[] args) {
		int a , b , c , x , y;
		int sum = 0;
		System.out.println("The Armstrong Numbers from 100 to 1000 are as follows");
		for (int i = 100 ; i <= 999 ; i++) {
			
			x = i / 10; // 115 11
			y = i % 10;
            y = x / 10;
            a = i % 10; // 115 5
            b = x % 10; // 11/10 = 1
            c = y % 10;
            a = a * a * a;
            b = b * b * b;
            c = c * c * c;
            sum = (a+b+c);
			
			if ( i == sum) {
				System.out.println(i);
			}
		}

	}

}
