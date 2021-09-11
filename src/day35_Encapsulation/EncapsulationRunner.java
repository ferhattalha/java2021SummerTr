package day35_Encapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {

  Encapsulation obj1=new Encapsulation();
  
  System.out.println(obj1.getOkulIsmi());
  System.out.println(obj1.getOkulHesapNo());
  System.out.println(obj1.isOkulAcýkMý());
  
  obj1.setOkulIsmi("Mehmet Kolleji");
  System.out.println(obj1.getOkulIsmi());// Mehmet Kolleji
  
  Encapsulation obj2=new Encapsulation();
  System.out.println(obj2.getOkulIsmi()); // yýldýz kolleji
  
  
  
	}

}
