package day03_datacasting_increment;

public class C04_datacasting02 {

	public static void main(String[] args) {
		
		
		double sayi1= 1000.14 ;
		
		int sayi2= (int) sayi1;
		// int - doube'a otomatik �evrilmez  manual onay ister
		// Bu esitligin sag�na (int) yazarak yapar�z
		// Bu onayla data kayb� ve degisimi olur
		
		System.out.println("double degisken : " + sayi1);
		System.out.println("int degisken : " + sayi2);

		byte sayi3 = (byte) sayi2;
		
		
		System.out.println("byte degisken : " + sayi3);
		
		// hatta data k�c�k data t�r�ne uymas� icin degistirilebilir

		
		int sayi4=95;
		int sayi5=10;
		
		
		double sayi6= 2000;
		
		System.out.println(sayi6/sayi5);
		
		double sayi7= 5;
		
		System.out.println(sayi4/sayi7);
		
	}

}
