package day38_Ýnheritance_Soru;

public class Animal1 {

	public void beslenme() {
		
		System.out.println("tüm hayvanlar beslenir");
	}
	
	protected  void tatlý() {
		System.out.println("trelice");
	}
	
	protected String icecek() {
		System.out.println("nigde gazozu");
		return "ohhh";
	}
	
	public Integer topla() {
	
	return 34+6;
}
	public Animal1 fatih() {
		
		return new Animal1();
		
		
	}
}