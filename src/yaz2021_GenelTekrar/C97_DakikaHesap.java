package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C97_DakikaHesap {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("lütfen yýl ve güne çevirmek istediðiniz dakika giriniz ");   
	        long dakika=scan.nextLong();
	        
	        long yil= dakika/525600;
	        long kalan= dakika%525600;
	        long gün= kalan/1440;
	        
	    System.out.println(dakika +" dakika yaklaþýk " +yil + " yýl " +gün+ " gündür");
	        
}
}