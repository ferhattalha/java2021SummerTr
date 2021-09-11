package hb1_Practise01;

import java.util.Scanner;

public class Hb03_Odev1 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 *
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
		 * indirim yapin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ka� adet �r�n ald���n�z� giriniz: ");
		int al�nanUrunSay�s� = scan.nextInt();

		int toplam = 0;
		int urunFiyat� = 0;
		int i = 1;

		while (i <= al�nanUrunSay�s�) {

			System.out.println("L�tfen ald���n�z " + i + ". �r�n�n fiyat�n� giriniz: ");
			urunFiyat� = scan.nextInt();

			i++;

			toplam += urunFiyat�;
		}

		System.out.println("M��teri kart�n�z var m�? \n\n 'EVET' ya da 'HAYIR'");
		char musteriKart� = scan.next().toUpperCase().charAt(0);

		if (musteriKart� == 'E') {

			if (al�nanUrunSay�s� >= 10) {

				System.out.println(
						"\nM��teri kart�n�z oldu�u i�in al��veri�inize %15 indirim uygulanm��t�r. Ek olarak 10'dan fazla �r�n ald���n�z i�in bu indirim %20'ye y�kseltilmi�tir. "
								+ "\n%20 indirim sonras� �demeniz gereken tutar: " + (toplam - toplam * 20 / 100)
								+ " TL");
			} else {
				System.out.println(
						"\nM��teri kart�n�z oldu�u i�in al��veri�inize %15 indirim uygulanm��t�r. \n%15 indirim sonras� �demeniz gereken tutar: "
								+ (toplam - toplam * 15 / 100) + " TL");
			}
		} else if (musteriKart� == 'H') {

			if (al�nanUrunSay�s� >= 10) {

				System.out.println("\\n10'dan fazla �r�n ald���n�z i�in al��veri�inize %15 indirim uygulanm��t�r. "
						+ "\n%15 indirim sonras� �demeniz gereken tutar: " + (toplam - toplam * 15 / 100) + " TL");
			} else {
				System.out
						.println("\\nBug�ne �zel %10 indirim kazand�n�z. \n%10 indirim sonras� �demeniz gereken tutar: "
								+ (toplam - toplam * 10 / 100) + " TL");
			}

		}
            scan.close();
	}

}
