package day02VariablesScanner;

public class C01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-Farkl� 3 data turunda variable olu�turun ve bunlar� yazd�r�n
		
		String kelime = "Merhaba";// sat�rdaki kod sonunda mutlaka ; kullanilmalidir
		
		System.out.println(kelime); // Kelimenin variable oldugunu anar ve variable'in degerini yazd�r�r
		
		System.out.println("kelime"); // Kelime yazd�r�r
		
		int sayi=1000;
		
		System.out.println(sayi); // 20
		
		// yazdirirken basina aciklama eklemek istersem
		// girilen sayi : 20
		// eger degisken ve a�iklamayi birlikte yazdirmak istersek
		// "ac�klama " + variableIsmi
		
		System.out.println("girilen sayi :" + sayi);
		
		boolean tatildeMi =  true ;
		
		System.out.println(tatildeMi);
		
		// konsolda bu sene tatile gittiniz mi ? = true
		// bu sene tatile gittiniz mi ? = true
		
		// variable olmayan kisim : "bu sene tatile gittiniz mi ? ="
		// variableden gelen kisim : true
		
		System.out.println("bu sene tatile gittiniz mi ? : " + tatildeMi);

		String name = "Ferhat";
		
		String surname = "Kaymak";
		
		System.out.println("isminiz : " + name);
	
		System.out.println("soyisminiz : " + surname);
		
		
		// Iki farkli tamsay� data t�r�nde 2 variable olusturun  bunlar�n toplamini yazd�r�n
		
		int sayi1 = 10;
		byte sayi2 = 5;
		
		System.out.println( sayi1 + sayi2 );
		
		// toplama isleminin bas�na ac�klama yazmak istersek
		// iki say�n�n toplam� = 15
		
		System.out.println("iki say�n�n toplam�" + (sayi1 + sayi2));
		
		// String ve sayisal islemleri birlikte yapt�rd���m�zda matematiksel i�lemi parantez icine al�n
		
		// 4 Bir tamsayi ve bir ondalik varible olusturun ve bunlar�n toplamini yazd�r�n
		
		int sayi3 = 15;
		double sayi4 = 3.14;
		
		System.out.println(sayi3 + sayi4) ;
	
	     // toplam : 18.14 
	
		System.out.println("toplam:" + ( sayi3 + sayi4));
		
		
		// 5 - char data t�r�nde bir variable olusturun ve yazd�r�n
		
		char karakter= '?';
		
		System.out.println(karakter);
		
		System.out.println("Girilen karakter :" + karakter);
		
		// 6- 
		
		int sayi5 = 20;
		char harf ='M';
		
		System.out.println( harf + sayi5); // 20M
		
		// char data t�r�ndeki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devreye girer
		// Java o karakter yerine ASCII toblosundaki de�eri kullan�r
		
			
		
	
	}

}
