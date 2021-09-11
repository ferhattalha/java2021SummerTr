package day42_Exceptions;

import java.util.Scanner;

public class Exceptions11 {

	public static void main(String[] args) {
		
		/* Soru: Kullanicidan yasini girmesini isteyin.
		Kodunuzu kullanici sifirdan kucuk bir sayi girerse
		Exception verecek sekilde yazin.*/
		


		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yaþýnýzý giriniz");
		int yas=scan.nextInt();
	
	/*	1. yol   TRY CATCH KULLANMADAN
		if (yas>=0) {
			
			System.out.println("yasýnýz"+yas);
		}else {
			throw new IllegalArgumentException();
			
		}
		System.out.println();
		
		System.out.println("dewamkee");
		
		*/
		
	//	2. yol   TRY CATCH KULLANARAK
		
		try {
			if (yas>=0) {
				
				System.out.println("yasýnýz"+yas);
			}else {
				throw new IllegalArgumentException();
			}	
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			
		}
		
		System.out.println();
		
		System.out.println("dewamkee yazýsýný okuduysan kod bu satýra kadar sorunsuz run olmustur..");
		
		scan.close();
	}
	
	

}
