package day18_doWhileLoopScope;

import java.util.Scanner;

public class C01_WhileLoop01 {

	public static void main(String[] args) {
		
		
	//	Kullanýcýdan iki pozitif sayý isteyin
	// Kullanýcý negatif sayý girdiginde 
	//	girilen negatif sayýlarý yoksayýp yeniden deger isteyin.
	//	Kullanýcý dogru giris yaptýgýnda "well done" ve sayýlarýn carpýmýný yazdýrýn.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen iki pozitif tamsayý giriniz");

		
		int sayi1=0;
		int sayi2=0;
		
		while (sayi1 <=0 || sayi2 <=0) {
			
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			
			if (sayi1>0 && sayi2>0 ) {
				
				System.out.println("Well done \ngirilen sayýlarýn carpýmý : "+ (sayi1*sayi2));
			
			}  else {
				
				System.out.println("Lütfen iki pozitif sayý giriniz");
				
				scan.close();
			}
			
		}
		

	
	
		
		
		
		
		
	}

}
