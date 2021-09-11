package day40_overriding01;

public class Otobus extends Arac {

	int yolcuSayýsý;

	public Otobus(String renk, int motor, String model, int yolcuSayýsý) {
		super(renk, motor, model); // prentten gelecek fields
		this.yolcuSayýsý = yolcuSayýsý;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayýsý=" + yolcuSayýsý + ", model=" + model + ", getRenk()=" + getRenk() + ", getMotor()="
				+ getMotor() ;
	}
	
	
	   
	
	
	
	
}
