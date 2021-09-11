package hb1_Practise01;

import java.util.Scanner;

public class Hb03_Odev02 {

	public static void main(String[] args) {
		
         
   
		    Scanner scan = new Scanner(System.in);
	        System.out.println("Lütfen iþlem seçiniz.\n1:Toplama\n2:Çýkarma\n3:Çarpma\n4:Bölme");
	        int intIslem = scan.nextInt();
	        System.out.println("Lütfen birinci sayýyý giriniz");
	        double dblSayi1 = scan.nextDouble();
	        System.out.println("Lütfen ikinci sayýyý giriniz");
	        double dblSayi2 = scan.nextInt();
	        switch(intIslem)
	        {
	            case 1:
	                double dblToplam = dblSayi1 + dblSayi2;
	                System.out.println("Toplama Ýþleminin Sonucu:" + dblToplam);
	                break;
	            case 2:
	                double dblCikarma = dblSayi1 - dblSayi2;
	                System.out.println("Çýkarma Ýþleminin Sonucu:" + dblCikarma);
	                break;
	            case 3:
	                double dblCarpma = dblSayi1 * dblSayi2;
	                System.out.println("Çarpma Ýþleminin Sonucu:" + dblCarpma);
	                break;
	            case 4:
	                if (dblSayi2 == 0)
	                {
	                    System.out.println("Bölen sayý 0 olamaz");
	                }
	                else
	                {
	                    double dblBolme = dblSayi1 / dblSayi2;
	                    System.out.println("Bölme Ýþleminin Sonucu:" + dblBolme);
	                }
	                break;
	                
	           
	        }
	        
	        scan.close();
	        
	    }
	
	
	}