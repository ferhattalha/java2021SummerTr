package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {

	public static void main(String[] args) {


		// Kullan�c�dan bir c�mle ve bir kelime al�n 
		// C�mlede kelimenin kullan�l�p kullan�lmad���n� yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz");
		
		String cumle=scan.nextLine();
		
		
		System.out.println("L�tfen bir kelime giriniz");
        String kelime=scan.nextLine();
	
		if (cumle.indexOf(kelime)!= -1) {
			System.out.println("Kelime c�mlede kullan�lm��");
			
		} else {
			System.out.println("Kelime c�mlede kullan�lmam��");
		}
		
		// contains() kullan�m�
		
		if (cumle.contains(kelime)) {
			System.out.println("Kelime c�mlede kullan�lm��");
			
		} else {
			System.out.println("Kelime c�mlede kullan�lmam��");
		}
		
		scan.close();
	}

}
