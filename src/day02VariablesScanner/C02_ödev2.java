package day02VariablesScanner;

import java.util.Scanner;

public class C02_�dev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Dikd�rtgenler prizmas� hacmi");
		
		System.out.println("Cismin uzunlugunu yaz�n");
		
		int u = scan.nextInt();
		
		System.out.println("Cismin derinligini yaz�n");
		
		int d = scan.nextInt();
		
		System.out.println("Cismin y�ksekligini yaz�n");
		
		int y = scan.nextInt();
		

		
		int prizmaninhacmi= u*d*y;
		
		
		System.out.println("Dikd�rtgenler prizmasi hacmi: " +prizmaninhacmi);

		scan.close();
		
		
		
	}

}
