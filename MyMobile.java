package week1.day1;

public class MyMobile {

	public static void main(String[] args) {
		Mobile objMobile = new Mobile();
		String name = objMobile.getName();
		System.out.println("Name of My Mobile is " + name);
		String model = objMobile.model;
		System.out.println("My Mobile Model is " + model);
		int camcount = objMobile.camcount;
		System.out.println("No Of Camera's " + camcount);
		objMobile.WatchVideo();
		boolean isSwitchedOff = objMobile.IsSwitchedOff();
		System.out.println("Turned OFF or ON "+ isSwitchedOff); 
		String name2 = objMobile.getName("IPhone");
		System.out.println("My Mobile Name is " + name2 );
		String name3 = objMobile.getName("Samsung");
		System.out.println("My Mobile Name is " + name3 );
		String name4 = objMobile.getName("Nokia");
		System.out.println("My Mobile Name is " + name4 );
		int mobCnt1 = objMobile.getMobCnt("Nokia");
		System.out.println("Nokia Count is " + mobCnt1);
		int mobCnt2 = objMobile.getMobCnt("OnePlus");
		System.out.println("OnePus Count is " + mobCnt2);
		int mobCnt3 = objMobile.getMobCnt("Motorola");
		System.out.println("Motorola Count is " + mobCnt3);
	}

}
