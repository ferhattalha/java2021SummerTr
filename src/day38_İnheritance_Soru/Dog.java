package day38_�nheritance_Soru;

public class Dog extends Animal1 {

	@ override  // mutlaka child'de yaz�l�r parent ve 
	// child methodlar�nda ili�ki kurar
	public void beslenme() {
		
		
		System.out.println("kemik ile beslenir");
	
}   @ override
	public  void tatl�() {
		System.out.println("f�st�k sarma");
	
}

    @ override
  protected String icecek() {
    	System.out.println("tur�u suyu");
    	return "yaras�n";
    	
    }
    
	@Override
	public Integer topla() {
	
		return 41+54;
	}
	@Override
	
	// ezen ve ezilen aras�nda return type  P <==>� ili�kisi varsa
	// farkl� bir durum olur.(Animal1 23 ile dog 35 sat�r ili�kisi)
	
	public Dog fatih() {  
	
		return new Dog();
	} 
  
} 


	
	 
	
	