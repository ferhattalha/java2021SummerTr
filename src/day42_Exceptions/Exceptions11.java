package day42_Exceptions;

import java.util.Scanner;

public class Exceptions11 {

	public static void main(String[] args) {
		
		/* Soru: Kullanicidan yasini girmesini isteyin.
		Kodunuzu kullanici sifirdan kucuk bir sayi girerse
		Exception verecek sekilde yazin.*/
		


		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ya��n�z� giriniz");
		int yas=scan.nextInt();
	
	/*	1. yol   TRY CATCH KULLANMADAN
		if (yas>=0) {
			
			System.out.println("yas�n�z"+yas);
		}else {
			throw new IllegalArgumentException();
			
		}
		System.out.println();
		
		System.out.println("dewamkee");
		
		*/
		
	//	2. yol   TRY CATCH KULLANARAK
		
		try {
			if (yas>=0) {
				
				System.out.println("yas�n�z"+yas);
			}else {
				throw new IllegalArgumentException();
			}	
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			
		}
		
		System.out.println();
		
		System.out.println("dewamkee yaz�s�n� okuduysan kod bu sat�ra kadar sorunsuz run olmustur..");
		
		scan.close();
	}
	
	

}
