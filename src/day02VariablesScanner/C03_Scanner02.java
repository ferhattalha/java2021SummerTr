package day02VariablesScanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		
		// 6. soru : Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
	
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz");
		
		String name = scan.next();
		
		System.out.println("Lütfen soyisminizi giriniz");
		
		String surname= scan.next();
		
		// Isim - soyisim : +Ferhat+  +Kaymak
		
		System.out.println("Isim - soyisim : " + name +" "+ surname);
		
		
		scan.close();
		

	}

}
