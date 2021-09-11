package day02VariablesScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
    // 1- soru: Kullanýcýdan iki tamsayý alýp bu sayýlarýn toplam,fark ve carpýmýný yazdýrýn
		
    // kullanicidan deger almak icin 3 adým atmaliyiz
		
	// 1- Scanner objesi oluþturalýn
		
	Scanner scan = new Scanner(System.in);
	
	// 2- kullanýcýdan ne istedigimizi yazdýralým
	
	System.out.println("Lütfen iki tamsayý giriniz");
	
	
	// 3- next metodunu kullanarak girilen degerleri alýp oluþturacagýmýz varibale'lara atayalim
	
	int sayi1 = scan.nextInt();
	int sayi2 = scan.nextInt();
	
	System.out.println("Girdiðiniz sayilarin toplami : " + (sayi1+sayi2));
	System.out.println("Girdiðiniz sayilarin farký : " + (sayi1-sayi2));
	System.out.println("Girdiðiniz sayilarin çarpýmý : " + (sayi1*sayi2));
	scan.close();
		
	}

}
