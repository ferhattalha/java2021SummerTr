package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {
		
		// Cal��   1. soru
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir sayi giriniz");
		
		int girilenSayi=scan.nextInt();
		
		if (girilenSayi%2==0) {
			System.out.println("Girdiginiz say� cift sayi");	
		}
		if (girilenSayi%2==1) {
			System.out.println("Girdiginiz sayi tek sayi");	
		}
		if (girilenSayi<0) {
			System.out.println("L�tfen pozitif bir tamsay� girin");	
		}
		
		scan.close();
	}

}
