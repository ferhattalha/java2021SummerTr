package day02VariablesScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
    // 1- soru: Kullan�c�dan iki tamsay� al�p bu say�lar�n toplam,fark ve carp�m�n� yazd�r�n
		
    // kullanicidan deger almak icin 3 ad�m atmaliyiz
		
	// 1- Scanner objesi olu�tural�n
		
	Scanner scan = new Scanner(System.in);
	
	// 2- kullan�c�dan ne istedigimizi yazd�ral�m
	
	System.out.println("L�tfen iki tamsay� giriniz");
	
	
	// 3- next metodunu kullanarak girilen degerleri al�p olu�turacag�m�z varibale'lara atayalim
	
	int sayi1 = scan.nextInt();
	int sayi2 = scan.nextInt();
	
	System.out.println("Girdi�iniz sayilarin toplami : " + (sayi1+sayi2));
	System.out.println("Girdi�iniz sayilarin fark� : " + (sayi1-sayi2));
	System.out.println("Girdi�iniz sayilarin �arp�m� : " + (sayi1*sayi2));
	scan.close();
		
	}

}
