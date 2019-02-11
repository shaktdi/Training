package week6.day11and12;


public class StaticandNonStatic {
	
	public static String staticstring = "hello";
	public String nonstaticstring = "world";
	
	
	public static void main(String[] args) {
		printstatic();
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.printnonstatic();

	}
	
	public static void printstatic() {
		StaticandNonStatic obj1 = new StaticandNonStatic();
		System.out.println(staticstring);
		System.out.println(obj1.nonstaticstring);
		
	}

	public void printnonstatic() {
		System.out.println(staticstring);
		System.out.println(nonstaticstring);
	}

}
