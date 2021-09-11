package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C94 {

	public static void main(String[] args) {
		
		/*Kullanýcýdan dakika girmesini isteyin, Dakikalarý birkaç yýl ve gün sayýsýna dönüþtürmek için bir Java programý yazýn.

		INPUT:

		Dakika sayýsý: 3456789

		OUTPUT :

		3456789 dakika yaklaþýk 6 yýl 210 gündür*/

		 Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen dakika giriniz");
	        long dakika=scan.nextLong();

	        long yil= dakika/525600;
	        long kalan= dakika%525600;
	        long gün= kalan/1440;
	        
	        System.out.println(dakika +" dakika yaklaþýk " +yil + " yýl " +gün+ " gündür");
	        
	        
	        
	        scan.close();
	
	}

}
