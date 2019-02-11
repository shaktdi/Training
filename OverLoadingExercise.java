package week1.day2;

public class OverLoadingExercise {
	
	public static float area(float a) {
		return a*a; 
	}
	public int area(int a) {
		return a*a;
	}
	public int area(int a, int b) {
		return a*b;
	}
	public OverLoadingExercise() {
		this(10);
		System.out.println("no args");
	}
	public OverLoadingExercise(int a) {
		System.out.println("with one arg"); 
	}
	public OverLoadingExercise(int a, float b) {
		this();
		System.out.println("with two args");
	}

	public static void main(String[] args) {
		OverLoadingExercise obj = new OverLoadingExercise(5, 5.8f);
		System.out.println(obj.area(5));
		

	}

}
