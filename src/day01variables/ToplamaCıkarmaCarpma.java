package day01variables;

import java.util.Scanner;

public class ToplamaCýkarmaCarpma {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("ODEV");
		
		
		int sayi1,sayi2,toplama,cýkarma,carpma,bolme;
		
		System.out.println("Lütfen 1.Operenti Giriniz:");
		sayi1= scan.nextInt();
		
		System.out.println("Lütfen 2.Operenti giriniz:");
		sayi2= scan.nextInt();
		
		toplama =sayi1+sayi2;
		cýkarma =sayi1-sayi2;
		carpma =sayi1 *sayi2;
		bolme=sayi1/sayi2;
		
		System.out.println("Girilen sayilarýn toplami:" +" " +toplama + "\n" +"Girilen sayýlarýn Farki:" + cýkarma + "\n" + "Girilen sayilarin Çarpimi:" + carpma +"\n" +"Girilen sayýlarýn bölümü :"+ bolme );
		
		System.out.println("Ýstediðiniz iþlemler yapýldý.");
		
		scan.close();
		
	
	}

}
