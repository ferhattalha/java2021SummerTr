package day18_doWhileLoopScope;

import java.util.Scanner;

public class C02_DoWhileLoop01 {
	
	public static void main(String[] args) {
		
		//	Kullan�c�dan iki pozitif say� isteyin
		// Kullan�c� negatif say� girdiginde 
		//	girilen negatif say�lar� yoksay�p yeniden deger isteyin.
		//	Kullan�c� dogru giris yapt�g�nda "well done" ve say�lar�n carp�m�n� yazd�r�n.
			
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("L�tfen iki pozitif tamsay� giriniz");

			
			int sayi1=5;
			int sayi2=10;
			
			do {
				
				 sayi1=scan.nextInt();
				 sayi2=scan.nextInt();
				
				 if (sayi1>0 && sayi2>0 ) {
						
						System.out.println("Well done \ngirilen say�lar�n carp�m� : "+ (sayi1*sayi2));
					
					}  else {
						
						System.out.println("L�tfen iki pozitif say� giriniz");
					}
				 
			} while (sayi1 <=0 || sayi2 <=0);
	
	scan.close();
}
}
