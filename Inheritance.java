package week2.day3;

public class Inheritance {

	public static void main(String[] args) {
		
           Redmi newRed = new Redmi ();
           Mobile newMob = new Mobile ();
           
           newRed.downLoad();
           newRed.IsPostPaid();
           newRed.call();
           newMob.downLoad();
           newMob.call();
           newMob.IsSwitchedOff();
           String Red = newMob.coLor("Redie"); 
           System.out.println("The colour is " + Red);
	}

}
