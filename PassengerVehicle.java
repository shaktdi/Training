package week2.day3;

public abstract class PassengerVehicle implements Vehicle {
	
	public void accelerator () {
		System.out.println("Apply Accelerator");
	}

	public void model () {
		System.out.println("2018 Model");
	}
	
	public abstract void noOfseats ();
	
	public void speed () {
		System.out.println("Speed from Abstarct Class");
	}
}
