package week1.day2;

public class CharCountInAString {

	public static void main(String[] args) {
		String txt = "BNY Mellon Technologies Ltd";
		String txt1 = txt.toLowerCase();
		txt1 = txt1.replace(" ", "");
		System.out.println(txt1);
		char[] chrArr = txt1.toCharArray();
		int count = 0;
		
		for(int i = 0 ; i <chrArr.length ; i++)
		{
			if(chrArr[i] == 'l')
			{
				count ++;
			}
		}
		System.out.println(count);

	}

}
