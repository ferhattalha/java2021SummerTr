package day17_nestedForLoop_whileLoops;

import java.util.Scanner;

public class C06_WhileLoop04 {

	public static void main(String[] args) {
	//	Soru 7 ) Kullanicidan pozitif bir sayi alin 
    //    ve bu sayinin rakamlari toplamini yazdirin

		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen pozitif bir sayý  giriniz : ");
		
		int sayý=scan.nextInt();
		
		int i =sayý;
		int rakamlarToplamý=0;
		int rakam=0;
	
		
		while (i>0) {
			rakam=sayý%10;
			rakamlarToplamý+=rakam;
			i/=10;
			
			scan.close();
		}
		
		System.out.println("girdiginiz " + sayý + " sayýsýnýn rakamlar toplamý : "+rakamlarToplamý);
		
		scan.close();
	}

}
