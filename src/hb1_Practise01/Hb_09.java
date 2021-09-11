package hb1_Practise01;

import java.util.Scanner;

public class Hb_09 {

	public static void main(String[] args) {
		
		/*
         * Kullanýcýdan vize ve final notlarýný alýnýz. Kullanýcýn istediði oranlarda
         * vize ve final yüzdeleri not ile not ortalamasýný hesaplayýp not ortalamasýný
         * yazdýrýp 50 ve büyük ise "Tebrikler dersi baþarý ile geçtiniz..." küçük ise
         * "Malesef dersten kaldýnýz..." yazdýrýnýz
         */
		
       Scanner scan = new Scanner(System.in);

		
		System.out.print("Lütfen vize1 notu giriniz : ");
		
		double vize1=scan.nextDouble();
		
		System.out.print("Lütfen vize2 notu giriniz : ");
		double vize2=scan.nextDouble();
		
		System.out.print("Lütfen fýnall notu giriniz : ");
		double fýnall=scan.nextDouble();
		
		
		double ortalama = ((vize1+vize2)/2*0.3)+(fýnall*0.7);
		
		
	
		if (ortalama>50) {
			
			System.out.print("Tebrikler dersi baþarý ile geçtiniz...");
			
		} else  {
			System.out.print("Malesef dersten kaldýnýz...");
		
		}
		
		scan.close();
		
	}


}
