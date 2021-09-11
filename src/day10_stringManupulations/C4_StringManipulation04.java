package day10_stringManupulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
        
		/*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
        kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
           - Girilen kelime cumlede kullanilmamis.
           - Girilen kelime cumlede 1 kere kullanilmis.
           - Girilen kelime cumlede 1�den fazla kullanilmis.
        */
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle yaz�n�z");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("L�tfen bir kelime yaz�n�z");
        String kelime=scan.next().toLowerCase();
       
       int ilkKullan�mIndexi= cumle.indexOf(kelime);
       
       int sonKullanimIndexi=cumle.lastIndexOf(kelime);
       
	   System.out.println(ilkKullan�mIndexi);   // 0
	   System.out.println(sonKullanimIndexi);   // 16
    	
	   if (ilkKullan�mIndexi==-1) {
		   System.out.println("Girilen kelime c�mlede kullan�lmam��");	
	}  else if (ilkKullan�mIndexi==sonKullanimIndexi) {
		System.out.println("Girilen kelime c�mlede 1 kere kullan�lm��");
		
	  }else {
	  System.out.println("Girilen kelime c�mlede birden fazla kullan�lm��");
	}
	   scan.close();
	} 		   
    		   
}
