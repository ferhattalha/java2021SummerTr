package day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		
		// 7 ) Kullanicidan ismini alýp bas ismini yazdirin
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		// charAt (0) index 0 birinci harf
		
		System.out.println("Lütfen ismimi alýp ismimin bas harfini yazdýrýn:" 
			+  ilkHarf);
	    
		
		scan.close();	
		
	}

}
