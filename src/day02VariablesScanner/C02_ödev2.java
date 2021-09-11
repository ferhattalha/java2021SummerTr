package day02VariablesScanner;

import java.util.Scanner;

public class C02_ödev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Dikdörtgenler prizmasý hacmi");
		
		System.out.println("Cismin uzunlugunu yazýn");
		
		int u = scan.nextInt();
		
		System.out.println("Cismin derinligini yazýn");
		
		int d = scan.nextInt();
		
		System.out.println("Cismin yüksekligini yazýn");
		
		int y = scan.nextInt();
		

		
		int prizmaninhacmi= u*d*y;
		
		
		System.out.println("Dikdörtgenler prizmasi hacmi: " +prizmaninhacmi);

		scan.close();
		
		
		
	}

}
