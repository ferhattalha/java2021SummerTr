package day02VariablesScanner;

import java.util.Scanner;

public class C05_odev {

	public static void main(String[] args) {
		
		// Java Ders Notlar� 34  sayfa �devi
		
		// 1. Kullanicidan iki tamsayi al�p bu say�larin toplam,fark ve carpimini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("ODEV");
        
		
		int sayi1,sayi2,toplama,c�karma,carpma;
		
		System.out.println("L�tfen 1.Operenti Giriniz:");
		sayi1= scan.nextInt();
		
		System.out.println("L�tfen 2.Operenti giriniz:");
		sayi2= scan.nextInt();
		
		toplama =sayi1+sayi2;
		c�karma =sayi1-sayi2;
		carpma =sayi1 *sayi2;
		
		System.out.println("Girilen sayilar�n toplami:" +" " +toplama + "\n" +"Girilen say�lar�n Farki:" + c�karma + "\n" + "Girilen sayilarin �arpimi:" + carpma);
		
		System.out.println("�stedi�iniz i�lemler yap�ld�.");
		
		// 2.soru Kullan�c�dan karenin bir kenar uzunlugunu al�n ve karenin �evresini ve alan�n� hesaplay�n
		
		
		System.out.println("Karenin �evresi ve alan�");// Karenin alan� = sayi1*4
		
		
		int birkenar = scan.nextInt();
		
		int karenincevresi=birkenar*4;
				
	    int kareninalani= birkenar*birkenar;
	  

		System.out.println("Karenin cevresi: " +karenincevresi);
		System.out.println("Karenin alani : " +kareninalani);
		
			
		
		// 3-soru = Kullan�c�dan dikd�rtgen prizman�n uzun, k�sa kenar�n� al�p y�ksekli�ini isteyip hacmini hesaplayin
		
		
		System.out.println("Dikd�rtgenler prizmas� hacmi");
		
		System.out.println("Cismin uzunlugunu yaz�n");
		
		int u = scan.nextInt();
		
		System.out.println("Cismin derinligini yaz�n");
		
		int d = scan.nextInt();
		
		System.out.println("Cismin y�ksekligini yaz�n");
		
		int y = scan.nextInt();
		

		
		int prizmaninhacmi= u*d*y;
		
		
		System.out.println("Dikd�rtgenler prizmasi hacmi: " +prizmaninhacmi);

		scan.close();
		
	}

}
