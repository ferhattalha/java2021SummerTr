package day40_overriding01;

public class Otobus extends Arac {

	int yolcuSay�s�;

	public Otobus(String renk, int motor, String model, int yolcuSay�s�) {
		super(renk, motor, model); // prentten gelecek fields
		this.yolcuSay�s� = yolcuSay�s�;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSay�s�=" + yolcuSay�s� + ", model=" + model + ", getRenk()=" + getRenk() + ", getMotor()="
				+ getMotor() ;
	}
	
	
	   
	
	
	
	
}
