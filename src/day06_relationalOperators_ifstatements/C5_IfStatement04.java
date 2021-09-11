package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_IfStatement04 {

	public static void main(String[] args) {
		
		
		// 4. soru 70 sayfa
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen kenar uzunluklarýndan birini tamsayi olarak giriniz");
		
        int kenar1=scan.nextInt();
        
        System.out.println("Lütfen diðer kenar uzunlugunu birini tamsayi olarak giriniz");
	
        int kenar2=scan.nextInt();
     
      if (kenar1==kenar2) {
		System.out.println("girdiginiz dikdortgen bir kare");
	}
      if (kenar1!=kenar2) {
    	  System.out.println("Lütfen tamsayi giriniz"); 
	}
      
        scan.close();
        
	}
	
}
