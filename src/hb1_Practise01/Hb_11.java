package hb1_Practise01;

import java.util.Scanner;

public class Hb_11 {

	public static void main(String[] args) {
		
		 /*  Problem Tanýmý
        Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi yapan kodu yazýnýz
        a'nýn karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çýktýsý
        a sayýsýný giriniz: 5
        b sayýsýný giriniz: 3
        c sayýsýný giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan = new Scanner(System.in);

		
		System.out.print("Lütfen a sayýsýný giriniz : ");
		double a=scan.nextDouble();
		System.out.print("Lütfen b sayýsýný giriniz : ");
		double b=scan.nextDouble();
		System.out.print("Lütfen c sayýsýný giriniz : ");
		double c=scan.nextDouble();
		
		double sonuc=((a*a)-(b*b))/(c*3);
		System.out.println("sonuc : "+ sonuc);
		
		scan.close();
	
	}

	
	
	
}
