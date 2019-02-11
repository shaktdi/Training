package week7.day13and14;

public class DuplicateInArray {

	public static void main(String[] args) {
		int a [] = {1,2,4,2,3,4,5,6,7,5};
		int b [] = new int [9];
		int i;
		int x = 0;
		System.out.println("The Duplicated Numbers are");
		
		for (i = 0 ; i <= 8 ; i++)
		{
			x = i + 1;
			for (int j = x ; j<=9 ; j++)
			{
				
				if (a[i] == a[j])
				{
					b[i] = a[i];
					System.out.print(b[i]+" ");
				}
			}
		}
		
	}

}
