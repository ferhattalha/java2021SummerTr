package genel01odevler;

import java.util.Scanner;

public class S75_08Soru {

	public static void main(String[] args) {

		// Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap
		// yazdirin.
		// Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
		// 60 – 80.000 arasinda ise “Konusabiliriz”,
		// 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen teklif edilen maasý giriniz");

		int maas = scan.nextInt();

		if (maas >= 80000) {

			System.out.println("Kabul ediyorum");
		} else if (maas >= 60000 && maas < 80000) {

			System.out.println("Konusabiliriz");
		} else if (maas < 60000) {

			System.out.println("Maalesef Kabul edemem");
		}

		scan.close();
	}
}