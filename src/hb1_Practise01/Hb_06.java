package hb1_Practise01;

import java.util.Scanner;

public class Hb_06 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini vize ortalamasinin
		 * %30'u final notunun %70 alarak gecme notunu hesaplayiniz
		 */

		Scanner scan = new Scanner(System.in);

		
		System.out.print("Lütfen vize1 notu giriniz : ");
		double v1=scan.nextDouble();
		System.out.print("Lütfen vize2 notu giriniz : ");
		double v2=scan.nextDouble();
		System.out.print("Lütfen final notu giriniz : ");
		double fl=scan.nextDouble();
		
		double vo= ((v1+v2)/2*0.3)+(fl*0.7);
		
		System.out.print("Geçme  notunuz : " + vo);
		 
		scan.close();
		
	     }
		
	 
	 

	}


