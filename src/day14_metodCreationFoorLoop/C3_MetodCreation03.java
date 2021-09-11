package day14_metodCreationFoorLoop;

import java.util.Scanner;

public class C3_MetodCreation03 {

	public static void main(String[] args) {
		
	/*	Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
	 - @ isareti icermiyorsa gecersiz email yazdirin
	 - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
	 - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen e mail adresinizi giriniz");
		String email=scan.nextLine();
		
		emailKontrolEt(email);
		
		scan.close();
		}

	public static void emailKontrolEt(String email) {
		
		if (!email.contains("@")) {
			
			System.out.println("Gecersiz e mail");
			
		}else if (!email.contains("@gmail.com")) {
			
			System.out.println("Lütfen gmail adresinizi giriniz");
		
	} else if (!email.endsWith("@gmail.com")) {
		
		System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		
 	} else {
 		System.out.println("mail adresiniz basarý ile kaydedildi");
 	}

		
	}
}