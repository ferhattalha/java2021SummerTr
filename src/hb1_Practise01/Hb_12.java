package hb1_Practise01;

import java.util.Scanner;

public class Hb_12 {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n�
		 * hesaplayan kod yaz�n�z. �rnek Ekran ��kt�s� birinci kenar: 12 ikinci kenar: 5
		 * hipotenus: 13 k�k almak i�in Math.sqrt(sayi) metodunu kullan�n�z
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("L�tfen a kenar�n�n uzunlugunu  giriniz : ");
		int a = scan.nextInt();
		System.out.print("L�tfen b kenar�n�n uzunlugunu giriniz : ");
		int b = scan.nextInt();

		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("�geninizin hipotenusu :" + c);

		scan.close();

	}

}
