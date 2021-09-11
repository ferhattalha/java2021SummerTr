package inheritance04;

public class Yönetici extends Calýsan {

	

	public Yönetici(String isim, int maas, String departman) {
		super(isim,maas,departman);
		
	}

	public void zamMiktarý(int zam) {
     System.out.println("yapýlacak zam miktarý: "+zam);
	}
}