package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {
		
		// Calýþ   1. soru
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		
		int girilenSayi=scan.nextInt();
		
		if (girilenSayi%2==0) {
			System.out.println("Girdiginiz sayý cift sayi");	
		}
		if (girilenSayi%2==1) {
			System.out.println("Girdiginiz sayi tek sayi");	
		}
		if (girilenSayi<0) {
			System.out.println("Lütfen pozitif bir tamsayý girin");	
		}
		
		scan.close();
	}

}
