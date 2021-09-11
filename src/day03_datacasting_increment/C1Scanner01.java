package day03_datacasting_increment;

import java.util.Scanner;

public class C1Scanner01 {

	public static void main(String[] args) {
		
	// Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		 
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra ENTER'a basýnýz");
	
	// syso içinde alt satira gecmek istedigimizde \n yazarýz.
	// \n den sonra bosluk býrakýrsak ikinci stýrýn basýnda bosluk olur
	
	String name=scan.nextLine();
	String surname=scan.nextLine();
	
	// next() sadece ilk kelimeyi alýr, girilen deger uzunsa ilk kelimeden sonra kalýr
	// nextline() ise o satýrýn sonuna kadar girilen tüm degerleri alýr
		
	System.out.println("Isminiz : " + name +"\nSoyisminiz : "+ surname + "\nKursumuza katiliminiz alinmistir, tesekkür ederiz");	
	
	
	scan.close();
	
	
	
	}

}
