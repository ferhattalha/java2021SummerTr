package basarýlýMarket01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Market01 {

	public static List<String> ürünler = new ArrayList();
	public static List<Double> fiyatlar = new ArrayList();
	public static List<String> sepettekiÜrünler = new ArrayList();
	public static List<Double> sepettekiFiyat = new ArrayList();
	public static List<Double> sepettekiKilo = new ArrayList();

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ürünler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuç", "Elma", "Muz", "Çilek", "Kavun",
				"Üzüm", "Limon"));
		fiyatlar.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.5, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));

		int ürünNo;
		double kg = 0;
		String devam;
		double toplam;

		do {
			ürünleriListele();
			System.out.println("Almak istediginiz ürünün numarasýný giriniz");
			ürünNo = scan.nextInt();
			System.out.println("kaç kg ürün almak istiyorsunuz");
			kg = scan.nextDouble();
			sepeteEkle(ürünNo, kg);
			toplam = sepetYazdýr();
			System.out.println();
			System.out.println("devam etmek istiyor musunuz(E/H)");
			devam = scan.next();
		} while (devam.equalsIgnoreCase("E"));

		ödemeYap(toplam);

	}

	public static void ödemeYap(double toplam) {

		Scanner scan = new Scanner(System.in);
		double miktar = 0;
		System.out.println("-------------------------------------------------");

		System.out.println("ödemeniz gereken miktar=" + toplam);

		System.out.println("-------------------------------------------------");

		do {
			System.out.println("Ne kadar paranýz var");
			miktar += scan.nextDouble();

			if (miktar < toplam) {
				System.out.println("Paranýz yetersiz,ekleme yapýn");
				System.out.println("ekleme yapacagýnýz miktar=" + (toplam - miktar));

			}
		} while (miktar <= toplam);

		System.out.println("-------------------------------------------------");
		System.out.println("Þu ana kadar" + miktar + "kadar ödeme yaptýnýz");
		System.out.println("toplam borcunuz " + toplam);
		System.out.println("-------------------------------------------------");
		System.out.println("Para üstünüz : " + (miktar - toplam));
		System.out.println("Bizi tercih ettiðiniz için teþekkürler");

	}

	public static void sepeteEkle(int ürünNo, double kg) {

		sepettekiÜrünler.add(ürünler.get(ürünNo));

		sepettekiKilo.add(kg);

		sepettekiFiyat.add(fiyatlar.get(ürünNo) * kg);
	}

	public static double sepetYazdýr() {

		double sepettekiToplam = 0;

		System.out.println("\tÜRÜN\tKÝLO\t\tFÝYAT");
		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < sepettekiÜrünler.size(); i++) {

			System.out.println(
					"\t" + sepettekiÜrünler.get(i) + "\t" + sepettekiKilo.get(i) + "\t" + sepettekiFiyat.get(i));

			sepettekiToplam += sepettekiFiyat.get(i);

		}
		return sepettekiToplam;
	}

	public static void ürünleriListele() {

		System.out.println("NO\tURUNLER\t\tFÝYATLAR");
		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < ürünler.size(); i++) {

			System.out.println(i + "\t" + ürünler.get(i) + "\t" + fiyatlar.get(i));

		}

	}

}
