package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C91_ObebOkek {

	public static void main(String[] args) {
		
		//en b�y�k ortak b�leni bulma
	
		        Scanner scan = new Scanner(System.in);
				System.out.println("l�tfen 2 sayi giriniz");
				int sayi1 = scan.nextInt();
				int sayi2 = scan.nextInt();
				int ortakBolen = 1;
				
		
                    for (int i = 1; i <=(sayi1+sayi2); i++) {
					if (sayi1 % i == 0 && sayi2 % i == 0) {

						ortakBolen = i;
						}
					}
					System.out.println("girilen say�lar�n ebobu : " + ortakBolen);
					
					System.out.println();
					
					//en k���k ortak kat� bulal�m
					
					for (int i = 1; i <= sayi1*sayi2; i++) {
						if (i%sayi1==0 && i%sayi2==0) {
							
							System.out.println("girilen say�lar�n ekoku :" + i);
							break;    
							
							//break yazmam�n sebebi, ortak katlardan en k�����n� arad���m i�in, ilkini bulup for dan c�ks�n
							//yoksa �st s�n�ra kadar b�t�n ortak katlar� yazd�r�r
						}	
					}
	}
}