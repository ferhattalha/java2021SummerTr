package genel01odevler;

import java.util.Scanner;

public class S78_Soru10A {

	public static void main(String[] args) {
		
		//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
		//Kural 1: 4 ile bolunemeyen yillar artik yil de�ildir
		//Kural 2: 4�un kati olmasina ragmen 100 ile bolunebilen yillardan 
		//sadece 400�un kati olan yillar artik yildir
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen art�k y�l kontrol� icin bir y�l giriniz");

		int y�l=scan.nextInt();
        
        if(y�l%4!=0) {
        	System.out.println("Girdiginiz y�l art�k y�l degil");
        	
		} else {
			
			if (y�l%100==0  && y�l%400==0) {
				System.out.println("Girdiginiz y�l art�k y�l");
		
			}  else if (y�l%100==0  && y�l%400!=0) {
				System.out.println("Girdiginiz y�l art�k y�l degil");
	
		  }  else  {
			System.out.println("Girdiginiz y�l art�k y�l");
			
		} 
		scan.close();
	 }
	}
}
