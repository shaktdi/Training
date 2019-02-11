package week1.day2;

public class InnerClassExercise {
	
	static class NestedClass{
		public void test() {
			System.out.println("static in a class");
		}		
	} 

	public static void main(String[] args) {
		InnerClassExercise.NestedClass obj = new InnerClassExercise.NestedClass();
		obj.test();

	}

}
