package day02VariablesScanner;

import java.util.Scanner;

public class CO4_Scanner {

	public static void main(String[] args) {
		
		//Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen karenin bir kenar uzunlugunu giriniz");
		int kenar=scan.nextInt();
		
		int alanKare=kenar*kenar;
		
		System.out.println("Kenar uzunlugunu girdi�iniz karenin alan� : "+ alanKare);
		
		scan.close();
		
	

	}

}
