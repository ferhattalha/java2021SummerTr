package day03_datacasting_increment;

import java.util.Scanner;

public class C1Scanner01 {

	public static void main(String[] args) {
		
	// Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		 
	Scanner scan = new Scanner(System.in);
	
	System.out.println("L�tfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra ENTER'a bas�n�z");
	
	// syso i�inde alt satira gecmek istedigimizde \n yazar�z.
	// \n den sonra bosluk b�rak�rsak ikinci st�r�n bas�nda bosluk olur
	
	String name=scan.nextLine();
	String surname=scan.nextLine();
	
	// next() sadece ilk kelimeyi al�r, girilen deger uzunsa ilk kelimeden sonra kal�r
	// nextline() ise o sat�r�n sonuna kadar girilen t�m degerleri al�r
		
	System.out.println("Isminiz : " + name +"\nSoyisminiz : "+ surname + "\nKursumuza katiliminiz alinmistir, tesekk�r ederiz");	
	
	
	scan.close();
	
	
	
	}

}
