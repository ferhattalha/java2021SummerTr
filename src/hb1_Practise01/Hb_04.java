package hb1_Practise01;

import java.util.Scanner;

public class Hb_04 {

	public static void main(String[] args) {
		
		/*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu ortalama
        120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?
        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.
     */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen mesafe giriniz");
		
		double mesafe=scan.nextDouble();
		
		System.out.println("L�tfen h�z giriniz");
      
        double h�z=scan.nextDouble();
        
        double sure=(mesafe/h�z);
        
        System.out.println("Ortalama hedefe varma s�reniz  :" + sure);
        
        scan.close();
        
        
	}

}
