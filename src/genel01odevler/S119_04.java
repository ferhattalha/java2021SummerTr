package genel01odevler;

import java.util.Scanner;

public class S119_04 {

	public static void main(String[] args) {

		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
		// yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen bir isim giriniz");

		String name = scan.nextLine();

		System.out.println("L�tfen bir soyisim giriniz");

		String surname = scan.nextLine();

		if (name.length() > (surname.length())) {

			System.out.println("�sminiz soy isminizden uzun");

		}  else if (name.length() < (surname.length())) {

			System.out.println("Soyisminiz isminizden uzun");

		} else {
		
		System.out.println("�sminiz ile soy isminiz ayn� uzunlukta");
		
		scan.close();
	}

}
}