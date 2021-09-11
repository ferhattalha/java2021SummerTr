package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C96_SaniyeHesap {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	      
		
		System.out.println("lütfen saniyeye çevirmek istediðiniz saati giriniz "); 
        int saat=scan.nextInt();
        
        System.out.println("lütfen saniyeye çevirmek istediðiniz dakikayý giriniz ");
        int dakika=scan.nextInt();
        
        System.out.println("lütfen saniyeye çevirmek istediðiniz saniyeyi giriniz ");
        int saniye=scan.nextInt();
        
        System.out.println(saat +"saat " + dakika + "dakika " +saniye + "saniye ==>");
        System.out.println((saat*3600+dakika*60+saniye) +" saniye" );
        scan.close();

	}

}
