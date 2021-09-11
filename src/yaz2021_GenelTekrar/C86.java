package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C86 {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Bir sayi giriniz: ");
	        int sayi = scan.nextInt();
	        
	        System.out.print("Girdiðiniz sayinin tersten yazýlýsý = ");
	        while(sayi > 0) {
	            
	            System.out.print(sayi % 10);
	            sayi /= 10;
	        }
	    }

	}


