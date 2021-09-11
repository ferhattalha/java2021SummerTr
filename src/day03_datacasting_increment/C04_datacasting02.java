package day03_datacasting_increment;

public class C04_datacasting02 {

	public static void main(String[] args) {
		
		
		double sayi1= 1000.14 ;
		
		int sayi2= (int) sayi1;
		// int - doube'a otomatik çevrilmez  manual onay ister
		// Bu esitligin sagına (int) yazarak yaparız
		// Bu onayla data kaybı ve degisimi olur
		
		System.out.println("double degisken : " + sayi1);
		System.out.println("int degisken : " + sayi2);

		byte sayi3 = (byte) sayi2;
		
		
		System.out.println("byte degisken : " + sayi3);
		
		// hatta data kücük data türüne uyması icin degistirilebilir

		
		int sayi4=95;
		int sayi5=10;
		
		
		double sayi6= 2000;
		
		System.out.println(sayi6/sayi5);
		
		double sayi7= 5;
		
		System.out.println(sayi4/sayi7);
		
	}

}
