package day38_�nheritance_Soru;

public class Animal1 {

	public void beslenme() {
		
		System.out.println("t�m hayvanlar beslenir");
	}
	
	protected  void tatl�() {
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