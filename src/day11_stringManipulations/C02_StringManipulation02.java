package day11_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulation02 {

	public static void main(String[] args) {

		// S oru 1) Kullanicidan email adresini girmesini isteyin,
		// mail @gmail.com iceriyorsa “Email adresiniz kaydedildi”, icermiyorsa “Lutfen
		// gmail mail adresinizi giriniz.. “ yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen email giriniz");

		String mail = scan.next();

		if (mail.contains("@gmail.com")) {
			System.out.println("Email adresiniz kaydedildi");

		} else {
			System.out.println("Lütfen gmail mail adresiniz kaydedildi");

			// *********ÖDEV ÝNDEXOF ÝLE ÇÖZ******

		}

		scan.close();

	}

}
