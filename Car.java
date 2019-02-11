package week2.day3;

public class Car extends PassengerVehicle implements Vehicle{

	//@Override
	//public void speed() {
		//System.out.println("The max Speed of the car is 300 Km");
		
	//}

	//@Override
	public void gear() {
		System.out.println("We have 5 gears in the car");
		
	}

	@Override
	public void brake() {
		System.out.println("We have ABS brake in the car");
		
	}

	@Override
	public void noOfseats() {
		System.out.println("The Number of seats in car is 5");
		
	}
	
	public void color () {
		System.out.println("Red Color Car");
	}
	
	public void carPrice (long price) {
		if (price > 1400000) {
			System.out.println("The Car is costly");
		} else {
			System.out.println("The Car is affordable");
		}
	}

}
