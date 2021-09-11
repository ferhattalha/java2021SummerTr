package day14_metodCreationFoorLoop;

import java.util.Scanner;

public class C02_MetodCreation02 {

	public static void main(String[] args) {
		
		
		/* Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		Kullanici 2,3 veya 4 degerini girerse,
		kullanicidan bu sayilari girmesini isteyin ve sayilarin
        toplamini yazdirin. Kullanici toplamak istedigi sayi
        adedini 4�den buyuk girerse �Cok sayi girdiniz, ben toplayamam�
         yazdirin. */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ka� say� toplamak istiyorsunuz");
		
		int sayiAdedi=scan.nextInt();
		
		if (sayiAdedi <2) {
			System.out.println("Toplamak icin en az iki say� girmelisiniz");

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
			
			System.out.println("L�tfen d�rt tamsay� giriniz");
			
				int sayi1=scan.nextInt();
				int sayi2=scan.nextInt();
				int sayi3=scan.nextInt();
				int sayi4=scan.nextInt();
				
				System.out.println("D�rt say� girmeyi tercih ettiniz : " +"\nGirilen d�rt say�n�n toplam� : " + (sayi1 + sayi2 + sayi3+sayi4));
				
				scan.close();
		}
	public static void ucSayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen uc tamsay� giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		
		System.out.println("�� say� girmeyi tercih ettiniz : " +"\nGirilen �� say�n�n toplam� : " + (sayi1 + sayi2 + sayi3));
		
		scan.close();
	}

	public static void ikiSayiTopla() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen iki tamsay� giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();

		System.out.println("�ki say� girmeyi tercih ettiniz" + "\nGirilen iki say�n�n toplam� : " + (sayi1 + sayi2));

		scan.close();
	}
	

}
