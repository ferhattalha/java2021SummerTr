package genel01odevler;

import java.util.Scanner;

public class S75_06DigerC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen iki sayi giriniz ve enter a basýnýz");

		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		if (sayi1 > 0 && sayi2 > 0) {
			System.out.println("sayilarin toplamý :" + (sayi1 + sayi2));
		} else if (sayi1 < 0 && sayi2 < 0) {
			System.out.println("sayilarin carpýmý :" + sayi1 * sayi2);

		} else if (sayi1 == 0 || sayi2 == 0) {
			System.out.println("sifir carpmaya gore yutan elemandir");

		} else {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		}

		scan.close();
	}
}
