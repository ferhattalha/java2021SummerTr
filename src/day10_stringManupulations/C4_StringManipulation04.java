package day10_stringManupulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
        
		/*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
        kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
           - Girilen kelime cumlede kullanilmamis.
           - Girilen kelime cumlede 1 kere kullanilmis.
           - Girilen kelime cumlede 1’den fazla kullanilmis.
        */
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle yazýnýz");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lütfen bir kelime yazýnýz");
        String kelime=scan.next().toLowerCase();
       
       int ilkKullanýmIndexi= cumle.indexOf(kelime);
       
       int sonKullanimIndexi=cumle.lastIndexOf(kelime);
       
	   System.out.println(ilkKullanýmIndexi);   // 0
	   System.out.println(sonKullanimIndexi);   // 16
    	
	   if (ilkKullanýmIndexi==-1) {
		   System.out.println("Girilen kelime cümlede kullanýlmamýþ");	
	}  else if (ilkKullanýmIndexi==sonKullanimIndexi) {
		System.out.println("Girilen kelime cümlede 1 kere kullanýlmýþ");
		
	  }else {
	  System.out.println("Girilen kelime cümlede birden fazla kullanýlmýþ");
	}
	   scan.close();
	} 		   
    		   
}
