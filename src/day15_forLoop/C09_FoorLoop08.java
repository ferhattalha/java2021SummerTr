package day15_forLoop;

import java.util.Scanner;

public class C09_FoorLoop08 {

	public static void main(String[] args) {
		
		// Soru 11 ) Interview Question Kullanicidan 10�den kucuk bir sayi isteyin 
		// ve girilen sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)

		Scanner scan = new Scanner(System.in);

		System.out.print("L�tfen bir say� giriniz : ");

		int say�=scan.nextInt();
		int faktoryel=1;
		
		
		
		for (int i = 1; i <=say� ; i++) {
		
			faktoryel*=i;	
		}
		System.out.println("Girdiginiz say�n�n faktoryeli : " + faktoryel);
		
		scan.close();
	}

}
