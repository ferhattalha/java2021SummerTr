package hb1_Practise01;

import java.util.Scanner;

public class Hb_04 {

	public static void main(String[] args) {
		
		/*  Problem Tanýmý
        Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
        Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr?
        Örnek Ekran Çýktýsý
        Mesafeyi giriniz: 400
        Hýzý giriniz: 100
        Süre 4 saattir.
     */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen mesafe giriniz");
		
		double mesafe=scan.nextDouble();
		
		System.out.println("Lütfen hýz giriniz");
      
        double hýz=scan.nextDouble();
        
        double sure=(mesafe/hýz);
        
        System.out.println("Ortalama hedefe varma süreniz  :" + sure);
        
        scan.close();
        
        
	}

}
