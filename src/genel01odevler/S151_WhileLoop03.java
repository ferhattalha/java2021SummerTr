package genel01odevler;

import java.util.Scanner;

public class S151_WhileLoop03 {

	public static void main(String[] args) {
		
	//	Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
	//	dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz
		
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen  pozitif bir baslangýç sayýsý giriniz");
		
		int ilksayi=scan.nextInt();
		
        System.out.println("Lütfen  pozitif bir bitis degeri giriniz");
		
		int sonsayi=scan.nextInt();

		int sayi=ilksayi;
		
		while(sayi <=sonsayi) {
		
			
			if (sayi%2==0) {
				
				
				System.out.println(sayi+" ");
			}
			sayi++;
			
			scan.close();
		}
		
		
	}

}
