package week7.day13and14;

public class NumberCombinations {

	public static void main(String[] args) {
		int [] arr = {1,2,3};
		int length = arr.length;
		
		for(int i =0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();	
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
		for(int i =0; i<arr.length;i=i+2)
		{
			System.out.print(arr[i]);
		}
		    System.out.print(arr[length-2]);
		System.out.println();
		for(int j=1 ; j <arr.length; j++)
		{
			System.out.print(arr[j]);
		}
		System.out.print(arr[length-3]);
		System.out.println();
		for(int i=1 ; i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.print(arr[length-1]);
		System.out.println();
		System.out.print(arr[length-1]);
		for(int j = 0 ; j <=arr.length-2 ; j++)
		{
			System.out.print(arr[j]);
		}
	}

}
