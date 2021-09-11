package day12_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations02 {

	public static void main(String[] args) {
		
		//Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
		 // kart no : **** **** **** 1234

		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen isminizi  yaz�n�z");
		
		String isim=scan.nextLine();
		
		System.out.println("L�tfen  soy isminizi yaz�n�z");
		
		String soyisim=scan.nextLine();
		
		System.out.println("L�tfen kredi kart� numaran�z� giriniz");
		
		String kkNo=scan.nextLine();
		
		String isimDuzenlenmis = isim.substring(0,1).toUpperCase() + // �lk harfi b�y�k olarak verir.
		                         isim.substring(1).replaceAll("\\w", "*"); // �lk harften sonraki t�m hafleri *'a cevirir
		
		String soyisimDuzenlenmis= soyisim.substring(0,1).toUpperCase()+
		                           soyisim.substring(1).replaceAll("\\w", "*");
		
		String kkNoDuzenlenmis= "**** **** **** " + kkNo.substring(15);
		
		
		 System.out.println("isim-soyisim : "+ isimDuzenlenmis +" " + soyisimDuzenlenmis + "\n" +"kart no : " + kkNoDuzenlenmis);                      
		
		 scan.close();
	}

}
