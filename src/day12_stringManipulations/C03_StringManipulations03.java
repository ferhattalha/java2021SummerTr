package day12_stringManipulations;

import java.util.Scanner;

public class C03_StringManipulations03 {

	public static void main(String[] args) {

		/*
		 * Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
		 * sagliyorsa �Sifre basari ile tanimlandi�, sartlari saglamazsa �Islem
		 * basarisiz,Lutfen yeni bir sifre girin� yazdirin - Ilk harf buyuk harf olmali
		 * - Son harf kucuk harf olmali - Sifre bosluk icermemeli - Sifre uzunlugu en az
		 * 8 karakter olmali
		 * 
		 * mehmet akbay�r 10:09 PM haluk hoca biraz yap�l� g�z�k�yo hocam :)) :smile: 2
		 */

		Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen sifrenizi giriniz");
        String sifre= scan.nextLine();
        
        boolean ilkHarfKont = sifre.charAt(0)>= 'A' && sifre.charAt(0) <= 'Z';
        boolean sonHarfKont = sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
        
        boolean spaceKontrol= !sifre.contains(" ");
        boolean uzunlukKontrol= sifre.length()>=8;
        
        
        if (ilkHarfKont && sonHarfKont && spaceKontrol && uzunlukKontrol) {
        	
        	System.out.println("Sifre ba�ar� ile tamamland�");
        	
		} else {
			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
			
			
		}
        
        scan.close();
	}

}
