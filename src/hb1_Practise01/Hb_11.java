package hb1_Practise01;

import java.util.Scanner;

public class Hb_11 {

	public static void main(String[] args) {
		
		 /*  Problem Tan�m�
        Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi yapan kodu yaz�n�z
        a'n�n karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        �rnek Ekran ��kt�s�
        a say�s�n� giriniz: 5
        b say�s�n� giriniz: 3
        c say�s�n� giriniz: 1
        sonu� : 5.333333333333333
        */

        Scanner scan = new Scanner(System.in);

		
		System.out.print("L�tfen a say�s�n� giriniz : ");
		double a=scan.nextDouble();
		System.out.print("L�tfen b say�s�n� giriniz : ");
		double b=scan.nextDouble();
		System.out.print("L�tfen c say�s�n� giriniz : ");
		double c=scan.nextDouble();
		
		double sonuc=((a*a)-(b*b))/(c*3);
		System.out.println("sonuc : "+ sonuc);
		
		scan.close();
	
	}

	
	
	
}
