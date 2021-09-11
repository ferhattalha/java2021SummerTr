package day02VariablesScanner;

import java.util.Scanner;

public class C05_odev {

	public static void main(String[] args) {
		
		// Java Ders Notlarý 34  sayfa ödevi
		
		// 1. Kullanicidan iki tamsayi alýp bu sayýlarin toplam,fark ve carpimini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("ODEV");
        
		
		int sayi1,sayi2,toplama,cýkarma,carpma;
		
		System.out.println("Lütfen 1.Operenti Giriniz:");
		sayi1= scan.nextInt();
		
		System.out.println("Lütfen 2.Operenti giriniz:");
		sayi2= scan.nextInt();
		
		toplama =sayi1+sayi2;
		cýkarma =sayi1-sayi2;
		carpma =sayi1 *sayi2;
		
		System.out.println("Girilen sayilarýn toplami:" +" " +toplama + "\n" +"Girilen sayýlarýn Farki:" + cýkarma + "\n" + "Girilen sayilarin Çarpimi:" + carpma);
		
		System.out.println("Ýstediðiniz iþlemler yapýldý.");
		
		// 2.soru Kullanýcýdan karenin bir kenar uzunlugunu alýn ve karenin çevresini ve alanýný hesaplayýn
		
		
		System.out.println("Karenin çevresi ve alaný");// Karenin alaný = sayi1*4
		
		
		int birkenar = scan.nextInt();
		
		int karenincevresi=birkenar*4;
				
	    int kareninalani= birkenar*birkenar;
	  

		System.out.println("Karenin cevresi: " +karenincevresi);
		System.out.println("Karenin alani : " +kareninalani);
		
			
		
		// 3-soru = Kullanýcýdan dikdörtgen prizmanýn uzun, kýsa kenarýný alýp yüksekliðini isteyip hacmini hesaplayin
		
		
		System.out.println("Dikdörtgenler prizmasý hacmi");
		
		System.out.println("Cismin uzunlugunu yazýn");
		
		int u = scan.nextInt();
		
		System.out.println("Cismin derinligini yazýn");
		
		int d = scan.nextInt();
		
		System.out.println("Cismin yüksekligini yazýn");
		
		int y = scan.nextInt();
		

		
		int prizmaninhacmi= u*d*y;
		
		
		System.out.println("Dikdörtgenler prizmasi hacmi: " +prizmaninhacmi);

		scan.close();
		
	}

}
