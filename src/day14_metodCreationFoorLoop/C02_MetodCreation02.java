package day14_metodCreationFoorLoop;

import java.util.Scanner;

public class C02_MetodCreation02 {

	public static void main(String[] args) {
		
		
		/* Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		Kullanici 2,3 veya 4 degerini girerse,
		kullanicidan bu sayilari girmesini isteyin ve sayilarin
        toplamini yazdirin. Kullanici toplamak istedigi sayi
        adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam”
         yazdirin. */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kaç sayý toplamak istiyorsunuz");
		
		int sayiAdedi=scan.nextInt();
		
		if (sayiAdedi <2) {
			System.out.println("Toplamak icin en az iki sayý girmelisiniz");

		} else if (sayiAdedi==2) {
			ikiSayiTopla();
			
		} else if (sayiAdedi==3) {
			ucSayiTopla();
			
		}else if (sayiAdedi==4) {
           dortSayiTopla();
		
		}  else {
           
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}
          scan.close();
		
	}
		
		public static void dortSayiTopla() {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Lütfen dört tamsayý giriniz");
			
				int sayi1=scan.nextInt();
				int sayi2=scan.nextInt();
				int sayi3=scan.nextInt();
				int sayi4=scan.nextInt();
				
				System.out.println("Dört sayý girmeyi tercih ettiniz : " +"\nGirilen dört sayýnýn toplamý : " + (sayi1 + sayi2 + sayi3+sayi4));
				
				scan.close();
		}
	public static void ucSayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen uc tamsayý giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		
		System.out.println("Üç sayý girmeyi tercih ettiniz : " +"\nGirilen üç sayýnýn toplamý : " + (sayi1 + sayi2 + sayi3));
		
		scan.close();
	}

	public static void ikiSayiTopla() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen iki tamsayý giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();

		System.out.println("Ýki sayý girmeyi tercih ettiniz" + "\nGirilen iki sayýnýn toplamý : " + (sayi1 + sayi2));

		scan.close();
	}
	

}
