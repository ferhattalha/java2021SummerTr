package day43_abstractClasses;

public abstract class Volvo {    // ABSTRACT CLASS

	public abstract void kap�();  // ABSTRACT METHOD
	
	public abstract void motor();  // ABSTRACT METHOD
	
	public  void sunroof() {     // concrate method
		
		System.out.println("sunroof ile geceleri mehtaba dal�p yoldan ��kma");
		
		
		// ABSTRACT CLASSLARDAN OBJE CREAT EDEMEY�Z...
		// ABSTRACT CLASS'DA HEM ABSTRACT HEMDE CONCTATE CLASS OLAB�L�R.
	}

}
