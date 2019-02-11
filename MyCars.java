package week1.day1;

public class MyCars {

	public static void main(String[] args) {
		Cars myCar = new Cars ();
		String carModel = myCar.carModel("Honda");
		System.out.println(carModel);
		String carModel2 = myCar.carModel("Hyundai");
		System.out.println(carModel2);
		String carModel3 = myCar.carModel("Maruthi");
		System.out.println(carModel3);
		String carModel4 = myCar.carModel("BMW");
		System.out.println(carModel4);
	}

}
