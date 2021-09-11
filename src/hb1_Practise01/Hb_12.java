package hb1_Practise01;

import java.util.Scanner;

public class Hb_12 {

	public static void main(String[] args) {

		/*
		 * Problem Tanýmý Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü
		 * hesaplayan kod yazýnýz. Örnek Ekran Çýktýsý birinci kenar: 12 ikinci kenar: 5
		 * hipotenus: 13 kök almak için Math.sqrt(sayi) metodunu kullanýnýz
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lütfen a kenarýnýn uzunlugunu  giriniz : ");
		int a = scan.nextInt();
		System.out.print("Lütfen b kenarýnýn uzunlugunu giriniz : ");
		int b = scan.nextInt();

		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("ügeninizin hipotenusu :" + c);

		scan.close();

	}

}
