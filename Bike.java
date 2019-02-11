package week2.day3;

public class Bike extends PassengerVehicle implements Vehicle{

	@Override
	public void speed() {
		System.out.println("The Max speed of Bike is 180 Km");
		
	}

	@Override
	public void gear() {
		System.out.println("The No of gears in bike is 4");
		
	}

	@Override
	public void brake() {
		System.out.println("The Bike has a Normal Brake");
		
	}

	@Override
	public void noOfseats() {
        System.out.println("No of seats in Bike is 2");
		
	}
	
	public void color() {
		System.out.println("The Bike is in Black Color");
	}
    
	public void bikePrice (long price) {
		if (price > 100000) {
			System.out.println("The Bike is costly");
		} else {
			System.out.println("The Bike is affordable");
		}
	}

}
