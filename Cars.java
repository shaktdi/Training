package week1.day1;

public class Cars {
	
	//This method returns the Car Models based on the brand
	public String carModel (String brandName) {
		if (brandName.equalsIgnoreCase("Honda")){
			return "Honda City , Honda Amaze , Honda Brio";
		    }
			else if (brandName.equalsIgnoreCase("Hyundai"))	{
			return "Hyundai i10 , Hyundai i20 , Hyundai Creta";
			}
			else if (brandName.equalsIgnoreCase("Maruthi")) {
			return "Maruthi Omni , Maruthi 800 , Maruthi Swift";	
			}
			else {
				return "This Brand is Not available in the showroom";
			}
				
		}
}

