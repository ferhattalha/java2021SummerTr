package basar�l�Market01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Market01 {

	public static List<String> �r�nler = new ArrayList();
	public static List<Double> fiyatlar = new ArrayList();
	public static List<String> sepetteki�r�nler = new ArrayList();
	public static List<Double> sepettekiFiyat = new ArrayList();
	public static List<Double> sepettekiKilo = new ArrayList();

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		�r�nler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havu�", "Elma", "Muz", "�ilek", "Kavun",
				"�z�m", "Limon"));
		fiyatlar.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.5, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));

		int �r�nNo;
		double kg = 0;
		String devam;
		double toplam;

		do {
			�r�nleriListele();
			System.out.println("Almak istediginiz �r�n�n numaras�n� giriniz");
			�r�nNo = scan.nextInt();
			System.out.println("ka� kg �r�n almak istiyorsunuz");
			kg = scan.nextDouble();
			sepeteEkle(�r�nNo, kg);
			toplam = sepetYazd�r();
			System.out.println();
			System.out.println("devam etmek istiyor musunuz(E/H)");
			devam = scan.next();
		} while (devam.equalsIgnoreCase("E"));

		�demeYap(toplam);

	}

	public static void �demeYap(double toplam) {

		Scanner scan = new Scanner(System.in);
		double miktar = 0;
		System.out.println("-------------------------------------------------");

		System.out.println("�demeniz gereken miktar=" + toplam);

		System.out.println("-------------------------------------------------");

		do {
			System.out.println("Ne kadar paran�z var");
			miktar += scan.nextDouble();

			if (miktar < toplam) {
				System.out.println("Paran�z yetersiz,ekleme yap�n");
				System.out.println("ekleme yapacag�n�z miktar=" + (toplam - miktar));

			}
		} while (miktar <= toplam);

		System.out.println("-------------------------------------------------");
		System.out.println("�u ana kadar" + miktar + "kadar �deme yapt�n�z");
		System.out.println("toplam borcunuz " + toplam);
		System.out.println("-------------------------------------------------");
		System.out.println("Para �st�n�z : " + (miktar - toplam));
		System.out.println("Bizi tercih etti�iniz i�in te�ekk�rler");

	}

	public static void sepeteEkle(int �r�nNo, double kg) {

		sepetteki�r�nler.add(�r�nler.get(�r�nNo));

		sepettekiKilo.add(kg);

		sepettekiFiyat.add(fiyatlar.get(�r�nNo) * kg);
	}

	public static double sepetYazd�r() {

		double sepettekiToplam = 0;

		System.out.println("\t�R�N\tK�LO\t\tF�YAT");
		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < sepetteki�r�nler.size(); i++) {

			System.out.println(
					"\t" + sepetteki�r�nler.get(i) + "\t" + sepettekiKilo.get(i) + "\t" + sepettekiFiyat.get(i));

			sepettekiToplam += sepettekiFiyat.get(i);

		}
		return sepettekiToplam;
	}

	public static void �r�nleriListele() {

		System.out.println("NO\tURUNLER\t\tF�YATLAR");
		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < �r�nler.size(); i++) {

			System.out.println(i + "\t" + �r�nler.get(i) + "\t" + fiyatlar.get(i));

		}

	}

}
