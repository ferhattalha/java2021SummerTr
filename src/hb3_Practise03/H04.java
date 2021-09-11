package hb3_Practise03;

import java.util.Scanner;

public class H04 {

	/*
	 * 123=1+2+3=6 kullanýcýdan alýnan bir sayinin basamaktaki rakam degerlerinin
	 * toplamini while loop ile hesaplayan bbir method yazýnýz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		int sayi = scan.nextInt();
		rakamTopla(sayi);

	}

	private static int rakamTopla(int sayi) {
		int toplam = 0;

		do {
			toplam += sayi % 10;
			sayi /= 10;
		} while (sayi > 0);

		System.out.println("girdiginiz sayinin rakamlar toplami : " + toplam);
		return toplam;

	}

}
