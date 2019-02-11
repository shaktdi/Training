package week1.day2;

public class StringExercise {
	
	int num ;
	public StringExercise() {
		num = 2;
		System.out.println("i am inside constructor");
	}
	
	public void test() {
		System.out.println("test "+num);  
	}

	public static void main(String[] args) {
		StringExercise obj = new StringExercise();
		obj.test();
		
	}

}
