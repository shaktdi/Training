package week1.day2;

public class StaticExercise {
	
	static int num1 = 10;
	int num2 = 10;
	public void counter() {
		num1++;
		num2++;
		System.out.println("static num: "+num1);
		System.out.println("non-static num: "+num2); 
	}

	public static void main(String[] args) {
		StaticExercise obj = new StaticExercise();
		obj.counter();
		obj.counter();
		StaticExercise obj1 = new StaticExercise();
		obj1.counter();
		obj.counter();
		obj1.counter();

	}

}
