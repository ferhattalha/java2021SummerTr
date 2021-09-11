package day03_datacasting_increment;

public class C3_datacasting_ {

	public static void main(String[] args) {
		
		// Data Casting Yapma 
		
		byte sayi1= 55;
		
		System.out.println("byte degisken ile : " + sayi1);
		
		short sayi2= sayi1; // sayi2 diye bir variable olusturuldu ve deger olarak 
		                    // sayi1'in değeri atandı
		
		System.out.println("short degisken ile : " + sayi2);
		
		int sayi3=sayi2;
		
		System.out.println("int degisken ile : " + sayi3);
		
		float sayi4=sayi3;
		
		System.out.println("float degisken ile : " + sayi4);
		
		double sayi5=sayi4;
		
		System.out.println("double degisken ile : " + sayi5);
		
		float sayi6=(float)sayi3;
		System.out.println("float degisken ile : " + sayi6);
	}

}
