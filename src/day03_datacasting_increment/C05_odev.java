package day03_datacasting_increment;

public class C05_odev {

	public static void main(String[] args) {
		
		// 1. soru byte veri tipinde bir degisken olusturun, short,int,float ve double data tipindeki birer degisken olusturup ad�m ad�m widening yap�p yazd�r�n
		
       
		byte sayi1= 125;
		
		System.out.println("byte degisken ile : " + sayi1);
		
		short sayi2= sayi1; // sayi2 diye bir variable olusturuldu ve deger olarak 
		                    // sayi1'in de�eri atand�
		
		System.out.println("short degisken ile : " + sayi2);
		
		int sayi3=sayi2;
		
		System.out.println("int degisken ile : " + sayi3);
		
		float sayi4=sayi3;
		
		System.out.println("float degisken ile : " + sayi4);
		
		double sayi5=sayi4;
		
		System.out.println("double degisken ile : " + sayi5);
		
		
		// 2.soru int veri t�r�nde bir degisken olusturun ve ad�m ad�m narrowing yap�n ve yazd�r�n
		
		int sayi6= 1234;
		
		System.out.println("int degisken ile : " + sayi6);
		
		short sayi7 = (short) sayi6;
		
		System.out.println("short degisken ile : " + sayi7);
		
		byte sayi8 = (byte) sayi7;
		
		System.out.println("byte degisken ile : " + sayi8);
		
		// 3. soru  float data turunda bir veri olusturun ve yazd�r�n
		
		
		float sayi9= 1.1234f;
		
		System.out.println("fload degisken ile : " + sayi9);
		
		// 4. soru double 255.36 say�s�n� int'a sonra byte cevirme yazd�rma
		
		
		double sayi10= 255.36;
		
		System.out.println("double degisken ile : " + sayi10);
		
		int sayi11 = (int) sayi10;
		
		System.out.println("int degisken ile : " + sayi11);
		
		byte sayi12 = (byte) sayi11;
		
		System.out.println("byte degisken ile : " + sayi12);
		
		// 5. soru int 2 sayiyi birbirine b�ld�r�n ve sonucu yazdirin
		
		int sayi13= 55;
		int sayi14= 11;
		
		System.out.println("Sayilarin b�l�m� : " + (sayi13 /sayi14));
		
		// 6. soru int bir say�y� double bir say�ya b�l�n ve sonucunu yazd�r�n
		
		int sayi15= 55;
		double sayi16=5.5f;
		
		System.out.println("int sayi dauble say�ya b�l�m� : " + (sayi15 /sayi16));
		
		// 7. soru Farkl� data tipleri ile islem yap�n ve sonucu yazdirin
		
		
		int sayi17 = 55;
		char harf ='M';
		
		System.out.println( harf + sayi17); 
		
		
		
		
	}

}
