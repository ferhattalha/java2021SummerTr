package hb1_Practise01;

import java.util.Scanner;

public class Hb_22 {

	public static void main(String[] args) {

		// Kullanýcýdan alacaðýný bir stringde
		// boþluk karakterinin olup olmadýðýný kontrol ediniz.

		
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz ");
        String name1=scan.nextLine();
        
        if (name1.contains(" ")) {
        	System.out.println("Boþluk var");
		} else {
			System.out.println("Boþluk karakteri yoktur");
		}
	}

}
