package day43_abstractClasses;

public abstract class Volvo {    // ABSTRACT CLASS

	public abstract void kapý();  // ABSTRACT METHOD
	
	public abstract void motor();  // ABSTRACT METHOD
	
	public  void sunroof() {     // concrate method
		
		System.out.println("sunroof ile geceleri mehtaba dalýp yoldan çýkma");
		
		
		// ABSTRACT CLASSLARDAN OBJE CREAT EDEMEYÝZ...
		// ABSTRACT CLASS'DA HEM ABSTRACT HEMDE CONCTATE CLASS OLABÝLÝR.
	}

}
