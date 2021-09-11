package day14_metodCreationFoorLoop;

import java.util.Scanner;

public class C04_MetodCreation04 {

	public static void main(String[] args) {

		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun.
		 */

        Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen ad�n�z� giriniz");
		
		String musteriIsmi=scan.next();
		
		System.out.println("L�tfen soyad�n�z� giriniz");
		
		String musteriSoyismi=scan.next();
		
		musteriSoyismi = ismiDuzelt(musteriSoyismi);
		
		System.out.println("L�tfen kredi kart numaran�z� arada bosluk olmadan yaz�n�z");
		
		String kkNo=scan.next();
		
		scan.close();
		
		musteriIsmi= ismiDuzelt(musteriIsmi);
		
		String yeniKkNo = kkNoDuzelt(kkNo);
		
		ismiDuzelt(musteriIsmi);
		kkNoDuzelt(kkNo);
		
		
		System.out.println(musteriIsmi+" "+musteriSoyismi+"\n"+ yeniKkNo);
		
	}

	public static String kkNoDuzelt(String kkNo) {
		kkNo=kkNo.replace(" ","");
		kkNo= kkNo.substring(0, 4)+" "+kkNo.substring(4,8)+" "+kkNo.substring(8,12)+" "+kkNo.substring(12,16);
		
		return kkNo;
	

		
	
	}

	private static String ismiDuzelt(String musteriIsmi) {
		
		musteriIsmi=musteriIsmi.trim(); // atama yapmazsak degisiklik kal�c� olmaz
		
		musteriIsmi=musteriIsmi.substring(0,1).toUpperCase() + musteriIsmi.substring(1).toLowerCase();
		
		return musteriIsmi;
	}

}
