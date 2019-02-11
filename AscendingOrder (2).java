package week8.day15and16;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr = {1,9,6,7,3};
		int temp = 0;
		
		for(int i= 0 ; i<=arr.length -1 ; i++)
		{
			int x = i +1;
			for(int j=x ;j< arr.length ; j++ )
			{
				if (arr[i] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			 }
			
			System.out.print(arr[i] + " ");
		}

	}

}
