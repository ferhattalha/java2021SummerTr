package hb1_Practise01;

import java.util.Scanner;

public class Hb_24 {

	public static void main(String[] args) {
		
		
		//kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz
		// ad ayri soyad ayri sekilde ekrana yaziniz

		
        Scanner scan = new Scanner(System.in);

		
		System.out.print("Lütfen adýnýzý ve soy adýnýzý giriniz : ");
		
		String adSoyad=scan.nextLine();
		
		String ad= adSoyad.substring(0, adSoyad.indexOf(" "));
		String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
		
		System.out.println("adýnýz : " +ad +"\n" + "soyadýnýz : "+ soyad);
		
		scan.close();
	}

}
