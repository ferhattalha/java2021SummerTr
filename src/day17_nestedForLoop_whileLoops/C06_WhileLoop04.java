package day17_nestedForLoop_whileLoops;

import java.util.Scanner;

public class C06_WhileLoop04 {

	public static void main(String[] args) {
	//	Soru 7 ) Kullanicidan pozitif bir sayi alin 
    //    ve bu sayinin rakamlari toplamini yazdirin

		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen pozitif bir say�  giriniz : ");
		
		int say�=scan.nextInt();
		
		int i =say�;
		int rakamlarToplam�=0;
		int rakam=0;
	
		
		while (i>0) {
			rakam=say�%10;
			rakamlarToplam�+=rakam;
			i/=10;
			
			scan.close();
		}
		
		System.out.println("girdiginiz " + say� + " say�s�n�n rakamlar toplam� : "+rakamlarToplam�);
		
		scan.close();
	}

}
