package genel01odevler;

import java.util.Scanner;

public class S78_10Soru {

	public static void main(String[] args) {
		
		//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
		//Kural 1: 4 ile bolunemeyen yillar artik yil deðildir
		//Kural 2: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan 
		//sadece 400’un kati olan yillar artik yildir
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Lütfen istediginiz yýlý giriniz");
		
		int girilenYil =scan.nextInt();
		
		if (((girilenYil % 4) == 0) && ((girilenYil % 100) == 0) && ((girilenYil % 400) == 0) && ((girilenYil % 4000) != 0))
			System.out.println(girilenYil + " artýk yýldýr");
			else
		System.out.println(girilenYil + " artýk yýl deðildir.");
		System.out.println();
		
		 {
			
		  }
		
		 scan.close();
     }
}

	

