package genel01odevler;

import java.util.Scanner;

public class H3_Odev {

	public static void main(String[] args) {
		
		/*
		 * A þehrinden uçamak isteyen bir kiþi B þehrine 500km C þehrine 700km D þehrine
		 * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
		 * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
		 * indirim gidis donus bilet alirsa yaþ indirimlerinden hariç 20% indirim bu
		 * kosullara gore yolcudan gideceði mesafeyi isteyip ucak bilet ucretini
		 * hesaplayan program yazýnýz
		 * 
		 */
		double kmBirimFiyat = 0.10;
		int mesafe = 0;
		double indirim = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz: ");
		int yas = scan.nextInt();
		System.out.println("Hangi sehre ucmak istersiniz (B,C,D): ");
		String sehir = scan.next();
		System.out.println("Biletiniz gidis donus mu belirtiniz (Gidis Donus = true/ Tek Yon = false) ");
		boolean biletTipi = scan.nextBoolean();
		
		// sehir olayini bu sekilde tanimlayip istedigimiz yerde kullanabiliriz
		// yeni bir sehir eklemek istersekte sadece burdan degistirmemiz yeterli
		// olacaktir
		if (sehir.equalsIgnoreCase("b")) {
			mesafe = 500;
		} else if (sehir.equalsIgnoreCase("c")) {
			mesafe = 700;
		} else if (sehir.equalsIgnoreCase("d")) {
			mesafe = 900;
		} else {
			System.out.println("Yanlis girdiniz. Sadece B,C veya D sehri olabilir");
		}
		
		if (yas < 12) {
			indirim = 0.5;
		} else if (yas >= 12 && yas <= 24) {
			indirim = 0.10;
		} else if (yas > 65) {
			indirim = 0.30;
		} else {
			System.out.println("size yas indirimi yapilamiyor");
		}
		
		double tekYonBiletFiyati = (mesafe * kmBirimFiyat) - (mesafe * kmBirimFiyat * indirim);
		
		if (biletTipi) {
			System.out.println("extra yuzde 20 indirim kazandiniz");
			double gidisDonusToplamFiyat = 2 * tekYonBiletFiyati - 2 * tekYonBiletFiyati * 0.2;
			System.out.println("bilet fiyatiniz : " + gidisDonusToplamFiyat);
		} else {
			System.out.println("bilet fiyatiniz : " + tekYonBiletFiyati);
		}
		scan.close();
	}
}