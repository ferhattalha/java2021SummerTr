package genel01odevler;

import java.util.Scanner;

public class Github_04 {

	public static void main(String[] args) {
		
	     //*Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.

		 // r=7;

		// Pi=3.14

		//Ipucu:

		// Dairenin Cevresi : 2Pir

		// Dairenin Alani : Pirr

		// Ornek Cikti:

		// 43.96

		// 153.86
   

	    
	    Scanner scan = new Scanner(System.in);
	    
	    int r=7;
	    double alan,cevre,pi = 3.14;
	    
	    
	    System.out.println("Daire yarý çapýný giriniz : ");
	    r = scan.nextInt();
	    cevre = 2 * pi * r;
	    alan = pi * (r*r);
	    System.out.println(cevre+"\n" +""+ alan+"\n");
	   
	    scan.close();
	  }
	}