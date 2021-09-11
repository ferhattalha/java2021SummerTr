package day07__ifElseStatements;

import java.util.Scanner;

public class C10_Odev05 {

	public static void main(String[] args) {
		
		/* Kullanicidan bir gun alin eger gun “Cuma” ise 
		 * ekrana “Muslumanlar icin kutsal 
		 *gun” yazdirin. “Cumartesi” ise ekrana 
		 **“Yahudiler icin kutsal gun” yazdirin. “Pazar” ise ekrana 
		 *“Hiristiyanlar icin kutsal gun” yazdirin
		 */
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen gun ismini giriniz ");
		
		String gunIsmi=scan.nextLine();
		
		if (gunIsmi.equals("Cuma")) {
		System.out.println("Muslumanlar icin kutsal gun");
		
		}
		
		if (gunIsmi.equals("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
	}
	
		if (gunIsmi.equals("Pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
   }
		
		scan.close();
 }
}