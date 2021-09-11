package hb_Pracitise04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HB02 {

	public static void main(String[] args) {
		
		
		 /*
		   Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin
		   toplamýný bulunuz. Sonucu ekrana yazdýrýnýz.
		   1 3 5 8
		    */
		        List<String> list=new ArrayList<>();
		        Scanner scan = new Scanner(System.in);
		        System.out.println("listeniz sayi giriniz : ");
		        System.out.println("sayi girisiniz bitirmek için 'q' giriniz ");
		         int toplam=0;
		        String islem="";
		        
		        while (!islem.equalsIgnoreCase("q")) {
		            System.out.print("sayi giriniz : ");
		            islem=scan.nextLine();
		            list.add(islem);
		        }
		        list.remove(list.size()-1);// liste giren son eleman q yu sildik
		        for (String w : list) {
		            int a=Integer.parseInt(w);
		                    toplam+=a*a;
		        }
		        System.out.println(list+" nin elemanlari kareleri toplami : "+toplam);
		    }
	

	}


