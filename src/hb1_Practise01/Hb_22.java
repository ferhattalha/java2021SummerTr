package hb1_Practise01;

import java.util.Scanner;

public class Hb_22 {

	public static void main(String[] args) {

		// Kullan�c�dan alaca��n� bir stringde
		// bo�luk karakterinin olup olmad���n� kontrol ediniz.

		
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz ");
        String name1=scan.nextLine();
        
        if (name1.contains(" ")) {
        	System.out.println("Bo�luk var");
		} else {
			System.out.println("Bo�luk karakteri yoktur");
		}
	}

}
