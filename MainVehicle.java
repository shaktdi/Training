package week2.day3;

public class MainVehicle {

	public static void main(String[] args) {
		Car myCar = new Car ();
		Bike myBike = new Bike ();
		
		myCar.speed();
		myCar.gear();
		myCar.brake();
		myCar.noOfseats();
		myCar.accelerator();
		myCar.model();
		myCar.color();
		myCar.carPrice(1500000);
		
		myBike.speed();
		myBike.gear();
		myBike.brake();
		myBike.noOfseats();
		myBike.accelerator();
		myBike.model();
		myBike.color();
		myBike.bikePrice(99999);
		

	}

}
