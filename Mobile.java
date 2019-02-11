package week1.day1;

public class Mobile {
	
	public String model = "Note5a"; // string holding model name
	public int camcount = 2; // integer holding camera count
	
	// This method returns name of mobile
	public String getName(){
		return "Redmi";	
	}
	// This method returns if the mobile is switched ON or OFF
	public boolean IsSwitchedOff() {
		return false;
	}
	// This method returns if video is being watched in mobile
	public void WatchVideo() {
		System.out.println("Watching Video in YouTube");
	}
	// This method will print the model name based on the brand name provided in the base class
	public String getName(String phoneModel) {
		if (phoneModel.equalsIgnoreCase("IPhone")) {
			return "Apple";
		} else if (phoneModel.equalsIgnoreCase("Samsung"))
			return "Galaxy";
		else if (phoneModel.equalsIgnoreCase("Nokia"))
			return "Nokia Asha";
		else {
			return "No Name";
			}
		
	} 
	// This method returns the count of mobile based on the brand name
	public int getMobCnt (String mobName) {
		if (mobName.equalsIgnoreCase("Motorola")) {
			return 52;
		}else if (mobName.equalsIgnoreCase("OnePlus")) {
			return 150;
		}else {
			return 0;
		}
		
		
	}
	 }
		
		
	
	

