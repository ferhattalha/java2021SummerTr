package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {

	public static void main(String[] args) {


		// Kullanýcýdan bir cümle ve bir kelime alýn 
		// Cümlede kelimenin kullanýlýp kullanýlmadýðýný yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle giriniz");
		
		String cumle=scan.nextLine();
		
		
		System.out.println("Lütfen bir kelime giriniz");
        String kelime=scan.nextLine();
	
		if (cumle.indexOf(kelime)!= -1) {
			System.out.println("Kelime cümlede kullanýlmýþ");
			
		} else {
			System.out.println("Kelime cümlede kullanýlmamýþ");
		}
		
		// contains() kullanýmý
		
		if (cumle.contains(kelime)) {
			System.out.println("Kelime cümlede kullanýlmýþ");
			
		} else {
			System.out.println("Kelime cümlede kullanýlmamýþ");
		}
		
		scan.close();
	}

}
