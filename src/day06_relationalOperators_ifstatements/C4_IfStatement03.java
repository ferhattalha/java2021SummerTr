package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C4_IfStatement03 {

	public static void main(String[] args) {
		
        // 2. soru

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen istediðiniz gün isminin ilk harfini giriniz");

		char harf =scan.next().toLowerCase().charAt(0);
		
		if (harf=='p') {
			System.out.println("pazartesi,persembe veya pazar");	
		}
		if (harf=='s') {
			System.out.println("sali");
	    }
		if (harf=='c') {
			System.out.println("carsamba, cuma , cumartesi");
        }

		scan.close();
     }
	
}		