package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C97_DakikaHesap {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("l�tfen y�l ve g�ne �evirmek istedi�iniz dakika giriniz ");   
	        long dakika=scan.nextLong();
	        
	        long yil= dakika/525600;
	        long kalan= dakika%525600;
	        long g�n= kalan/1440;
	        
	    System.out.println(dakika +" dakika yakla��k " +yil + " y�l " +g�n+ " g�nd�r");
	        
}
}