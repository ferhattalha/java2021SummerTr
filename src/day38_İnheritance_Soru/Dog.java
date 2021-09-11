package day38_Ýnheritance_Soru;

public class Dog extends Animal1 {

	@ override  // mutlaka child'de yazýlýr parent ve 
	// child methodlarýnda iliþki kurar
	public void beslenme() {
		
		
		System.out.println("kemik ile beslenir");
	
}   @ override
	public  void tatlý() {
		System.out.println("fýstýk sarma");
	
}

    @ override
  protected String icecek() {
    	System.out.println("turþu suyu");
    	return "yarasýn";
    	
    }
    
	@Override
	public Integer topla() {
	
		return 41+54;
	}
	@Override
	
	// ezen ve ezilen arasýnda return type  P <==>Ç iliþkisi varsa
	// farklý bir durum olur.(Animal1 23 ile dog 35 satýr iliþkisi)
	
	public Dog fatih() {  
	
		return new Dog();
	} 
  
} 


	
	 
	
	