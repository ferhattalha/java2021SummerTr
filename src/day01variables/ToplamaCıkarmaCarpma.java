package day01variables;

import java.util.Scanner;

public class ToplamaC�karmaCarpma {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("ODEV");
		
		
		int sayi1,sayi2,toplama,c�karma,carpma,bolme;
		
		System.out.println("L�tfen 1.Operenti Giriniz:");
		sayi1= scan.nextInt();
		
		System.out.println("L�tfen 2.Operenti giriniz:");
		sayi2= scan.nextInt();
		
		toplama =sayi1+sayi2;
		c�karma =sayi1-sayi2;
		carpma =sayi1 *sayi2;
		bolme=sayi1/sayi2;
		
		System.out.println("Girilen sayilar�n toplami:" +" " +toplama + "\n" +"Girilen say�lar�n Farki:" + c�karma + "\n" + "Girilen sayilarin �arpimi:" + carpma +"\n" +"Girilen say�lar�n b�l�m� :"+ bolme );
		
		System.out.println("�stedi�iniz i�lemler yap�ld�.");
		
		scan.close();
		
	
	}

}
