package hb2_Practise02;

import java.util.Scanner;

public class C04_Odev04 {

	public static void main(String[] args) {
		
		// Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.
        // continue komutu bulundugu kod blogunda mevcut islemi atlar.
        Scanner scan = new Scanner(System.in);
        int top = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("bir sayi giriniz : ");
            int sayi = scan.nextInt();
            if (sayi > 5 && sayi < 10) {
                System.out.println("girdiginiz sayi 5 ile 10 arasi oldugundan isleme girmeyecek");
                continue;
            }
            top += sayi;
        }
        System.out.println("girdiginiz sayilr toplamý :" + top);
        
        scan.close();
	}
}
