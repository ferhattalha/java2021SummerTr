package hb1_Practise01;

import java.util.Scanner;

public class Hb03_Odev02 {

	public static void main(String[] args) {
		
         
   
		    Scanner scan = new Scanner(System.in);
	        System.out.println("L�tfen i�lem se�iniz.\n1:Toplama\n2:��karma\n3:�arpma\n4:B�lme");
	        int intIslem = scan.nextInt();
	        System.out.println("L�tfen birinci say�y� giriniz");
	        double dblSayi1 = scan.nextDouble();
	        System.out.println("L�tfen ikinci say�y� giriniz");
	        double dblSayi2 = scan.nextInt();
	        switch(intIslem)
	        {
	            case 1:
	                double dblToplam = dblSayi1 + dblSayi2;
	                System.out.println("Toplama ��leminin Sonucu:" + dblToplam);
	                break;
	            case 2:
	                double dblCikarma = dblSayi1 - dblSayi2;
	                System.out.println("��karma ��leminin Sonucu:" + dblCikarma);
	                break;
	            case 3:
	                double dblCarpma = dblSayi1 * dblSayi2;
	                System.out.println("�arpma ��leminin Sonucu:" + dblCarpma);
	                break;
	            case 4:
	                if (dblSayi2 == 0)
	                {
	                    System.out.println("B�len say� 0 olamaz");
	                }
	                else
	                {
	                    double dblBolme = dblSayi1 / dblSayi2;
	                    System.out.println("B�lme ��leminin Sonucu:" + dblBolme);
	                }
	                break;
	                
	           
	        }
	        
	        scan.close();
	        
	    }
	
	
	}