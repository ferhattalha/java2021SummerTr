package genel01odevler;

import java.util.Scanner;

public class S119_04 {

	public static void main(String[] args) {

		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
		// yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen bir isim giriniz");

		String name = scan.nextLine();

		System.out.println("Lütfen bir soyisim giriniz");

		String surname = scan.nextLine();

		if (name.length() > (surname.length())) {

			System.out.println("Ýsminiz soy isminizden uzun");

		}  else if (name.length() < (surname.length())) {

			System.out.println("Soyisminiz isminizden uzun");

		} else {
		
		System.out.println("Ýsminiz ile soy isminiz ayný uzunlukta");
		
		scan.close();
	}

}
}