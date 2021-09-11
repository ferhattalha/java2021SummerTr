package day14_metodCreationFoorLoop;

import java.util.Scanner;

public class C06_MetodCreationFoorLoop01 {

	public static void main(String[] args) {
		
		
		//Soru 1 ) Kullanicidan bir sayi alin. 
		//Bu sayinin tek mi cift mi oldugunu, 
		//sifirdan buyuk mu kucuk mu oldugunu, 
		//ayrica ve 100’den buyukse 
		//birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen bir tam sayý yazýnýz");
		
		int sayi=scan.nextInt();
		
		tekMiCiftmiYazdir(sayi);
		sifirlaKarsilastir(sayi);
		istenenBasamaklariYazdir(sayi);
		
		scan.close();	
	}

	private static void istenenBasamaklariYazdir(int sayi) {
		
		if (sayi <100) {
			System.out.println("Girdiginiz sayýnýn birler basamagý : " + sayi%10);
			
		} else {
			
			int rakamlarToplami=0;
			int rakam=0;
			
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
					
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			
			System.out.println("Sayýnýn birler,onlar ve yuzler basamagindaki rakamlarin toplami :  "+ rakamlarToplami);
		}
		
	}

	
	
	public static void sifirlaKarsilastir(int sayi) {

     if(sayi>0) {
    	 
    	 System.out.println("Girilen sayý pozitif");
    	
     }	else if (sayi <0 ) {
    	 System.out.println("Girilen sayý negatif");
		
	}  else {
		
		System.out.println(" 0 sayýsý negatif veya pozitif degildir");
	}
	
		
	}

	public static void tekMiCiftmiYazdir(int sayi) {
   
	if (sayi%2==0) {
		System.out.println("Sayý cift sayýdýr");
		
	} else {
		System.out.println("Sayý tek sayýdýr");
	}
   
		
	}

}
