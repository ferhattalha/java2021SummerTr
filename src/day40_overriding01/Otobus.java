package day40_overriding01;

public class Otobus extends Arac {

	int yolcuSayısı;

	public Otobus(String renk, int motor, String model, int yolcuSayısı) {
		super(renk, motor, model); // prentten gelecek fields
		this.yolcuSayısı = yolcuSayısı;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayısı=" + yolcuSayısı + ", model=" + model + ", getRenk()=" + getRenk() + ", getMotor()="
				+ getMotor() ;
	}
	
	
	   
	
	
	
	
}
