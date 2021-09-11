package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C91_ObebOkek {

	public static void main(String[] args) {
		
		//en büyük ortak böleni bulma
	
		        Scanner scan = new Scanner(System.in);
				System.out.println("lütfen 2 sayi giriniz");
				int sayi1 = scan.nextInt();
				int sayi2 = scan.nextInt();
				int ortakBolen = 1;
				
		
                    for (int i = 1; i <=(sayi1+sayi2); i++) {
					if (sayi1 % i == 0 && sayi2 % i == 0) {

						ortakBolen = i;
						}
					}
					System.out.println("girilen sayýlarýn ebobu : " + ortakBolen);
					
					System.out.println();
					
					//en küçük ortak katý bulalým
					
					for (int i = 1; i <= sayi1*sayi2; i++) {
						if (i%sayi1==0 && i%sayi2==0) {
							
							System.out.println("girilen sayýlarýn ekoku :" + i);
							break;    
							
							//break yazmamýn sebebi, ortak katlardan en küçüðünü aradýðým için, ilkini bulup for dan cýksýn
							//yoksa üst sýnýra kadar bütün ortak katlarý yazdýrýr
						}	
					}
	}
}