package day02VariablesScanner;

public class C01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-Farklý 3 data turunda variable oluþturun ve bunlarý yazdýrýn
		
		String kelime = "Merhaba";// satýrdaki kod sonunda mutlaka ; kullanilmalidir
		
		System.out.println(kelime); // Kelimenin variable oldugunu anar ve variable'in degerini yazdýrýr
		
		System.out.println("kelime"); // Kelime yazdýrýr
		
		int sayi=1000;
		
		System.out.println(sayi); // 20
		
		// yazdirirken basina aciklama eklemek istersem
		// girilen sayi : 20
		// eger degisken ve açiklamayi birlikte yazdirmak istersek
		// "acýklama " + variableIsmi
		
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
		
		
		// Iki farkli tamsayý data türünde 2 variable olusturun  bunlarýn toplamini yazdýrýn
		
		int sayi1 = 10;
		byte sayi2 = 5;
		
		System.out.println( sayi1 + sayi2 );
		
		// toplama isleminin basýna acýklama yazmak istersek
		// iki sayýnýn toplamý = 15
		
		System.out.println("iki sayýnýn toplamý" + (sayi1 + sayi2));
		
		// String ve sayisal islemleri birlikte yaptýrdýðýmýzda matematiksel iþlemi parantez icine alýn
		
		// 4 Bir tamsayi ve bir ondalik varible olusturun ve bunlarýn toplamini yazdýrýn
		
		int sayi3 = 15;
		double sayi4 = 3.14;
		
		System.out.println(sayi3 + sayi4) ;
	
	     // toplam : 18.14 
	
		System.out.println("toplam:" + ( sayi3 + sayi4));
		
		
		// 5 - char data türünde bir variable olusturun ve yazdýrýn
		
		char karakter= '?';
		
		System.out.println(karakter);
		
		System.out.println("Girilen karakter :" + karakter);
		
		// 6- 
		
		int sayi5 = 20;
		char harf ='M';
		
		System.out.println( harf + sayi5); // 20M
		
		// char data türündeki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devreye girer
		// Java o karakter yerine ASCII toblosundaki deðeri kullanýr
		
			
		
	
	}

}
