package day17_nestedForLoop_whileLoops;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		
		/* Kullanýcýdan toplamak üzere sayý isteyin.
		 * Toplam 200 oluncaya kadar sayý istemeye devam edin
		 * Toplam 200 ü gectiginde 
		 * kullanýcýnýn kac sayý girdiðini ve bu sayýlarýn 
		 * toplamýnýn kaç oldugunu yazdýrýn
		 */
		
		// for loop da bir islem yapmak icin tekrar sayýsýný bilek gerekir
		// While loop da ise adým sayýsý degil bitirme kosulu önemlidir
		
        Scanner scan=new Scanner(System.in);
		
		
		int sayý=0;
		int toplam=0;
		int sayac=0;
				
		
		while(toplam < 200) {
			System.out.println("Lütfen toplamak icin bir sayý girin");
	     sayý=scan.nextInt();
		
		toplam+=sayý;
		sayac++;
		}
		// toplamýn 200 ü gectigine eminiz
		System.out.println("toplam " + sayac + "adet sayý girdiniz ve bu sayýlarýn toplamý " + toplam );
	
		scan.close();
	}

}
