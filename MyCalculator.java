package week1.day1;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		int add = myCalc.add(15, 20);
		System.out.println("The Addition value is " + add);
		int subtract = myCalc.subtract(14, 25);
		System.out.println("The Subtraction value is " + subtract);
        int multiply = myCalc.multiply(14, 22);
        System.out.println("The Multiplication value is " + multiply);
        int divide = myCalc.divide(15, 2);
        System.out.println("The Divided value is "+ divide);
	}

}
