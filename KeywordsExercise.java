package week1.day2;

public class KeywordsExercise {
	
	int num =10;
	public void test() {
		int num =5;
		System.out.println("Method level without this keyword " + num); 
		System.out.println("Class level with this Keyword " + this.num);
		
	}

	public static void main(String[] args) {
		KeywordsExercise obj = new KeywordsExercise();
		obj.test();

	}

}
