package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C96_SaniyeHesap {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	      
		
		System.out.println("l�tfen saniyeye �evirmek istedi�iniz saati giriniz "); 
        int saat=scan.nextInt();
        
        System.out.println("l�tfen saniyeye �evirmek istedi�iniz dakikay� giriniz ");
        int dakika=scan.nextInt();
        
        System.out.println("l�tfen saniyeye �evirmek istedi�iniz saniyeyi giriniz ");
        int saniye=scan.nextInt();
        
        System.out.println(saat +"saat " + dakika + "dakika " +saniye + "saniye ==>");
        System.out.println((saat*3600+dakika*60+saniye) +" saniye" );
        scan.close();

	}

}
