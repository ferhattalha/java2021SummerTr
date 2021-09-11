package day15_forLoop;

import java.util.Scanner;

public class C09_FoorLoop08 {

	public static void main(String[] args) {
		
		// Soru 11 ) Interview Question Kullanicidan 10’den kucuk bir sayi isteyin 
		// ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		Scanner scan = new Scanner(System.in);

		System.out.print("Lütfen bir sayý giriniz : ");

		int sayý=scan.nextInt();
		int faktoryel=1;
		
		
		
		for (int i = 1; i <=sayý ; i++) {
		
			faktoryel*=i;	
		}
		System.out.println("Girdiginiz sayýnýn faktoryeli : " + faktoryel);
		
		scan.close();
	}

}
