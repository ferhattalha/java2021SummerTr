package hb1_Practise01;

import java.util.Scanner;

public class Hb_29 {

	public static void main(String[] args) {
		
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
       Scanner scan=new Scanner(System.in);
       
       System.out.println("Degistireceginiz birimi giriniz : ");
       
       String birim=scan.nextLine();
       System.out.println("Çevireceginiz birimin miktarýný giriniz : ");
       double miktar=scan.nextDouble();
       
       cevirici(birim,miktar);
       
	}
	
	
	
		public static void cevirici(String birim,double miktar) {
		
		switch (birim)	{
		case "saat": {
			System.out.println(miktar*3600);
			break;
		}
			case "mil":{
				System.out.println(miktar*1.6);
			break;

		}
		case "gram": {
			System.out.println(miktar*1000);
		break;
		
		}	
		default:
		System.out.println("hatalý veri girdiniz");
		}
	
	}
		

}

