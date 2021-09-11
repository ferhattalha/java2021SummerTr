package hb1_Practise01;

import java.util.Scanner;

public class Hb_03 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar
		 * ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 Output : Girdiginiz sayinin birler basamagi : 3
		 * Girdiginiz sayinin onlar basamagi : 5 Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int x = 853;

		int birler = x % 10;
		int onlar = x / 10 % 10;
		int yuzler = x / 100 % 10;

		System.out.println(yuzler + "\n" + onlar + "\n" + birler + "\n");

		System.out.println("girdiginiz sayinin birler basamagi : " + birler);

		System.out.println("girdiginiz sayinin onlar basamagi : " + onlar);

		System.out.println("girdiginiz sayinin yuzler basamagi : " + yuzler);
		
		System.out.println("girdiginiz sayinin birler basamagi : " + birler + "\n" + "girdiginiz sayinin onlar basamagi : " + onlar
						+ "\n" + "girdiginiz sayinin yuzler basamagi : " + yuzler);

		scan.close();
	}

}
