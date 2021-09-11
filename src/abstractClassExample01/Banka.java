package abstractClassExample01;

public abstract class Banka {
	
	double bakiye;

	public Banka(double bakiye) {
		this.bakiye = bakiye;
		
	
	}
	
	public  Banka() {
		
		System.out.println("Hesap hareketleri");
		
	}

	abstract double paraYatör(double miktar);
	abstract double paraCek(double miktar);
}
