package genel01odevler;

import java.util.Scanner;

public class S78_Soru10A {

	public static void main(String[] args) {
		
		//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
		//Kural 1: 4 ile bolunemeyen yillar artik yil deðildir
		//Kural 2: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan 
		//sadece 400’un kati olan yillar artik yildir
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen artýk yýl kontrolü icin bir yýl giriniz");

		int yýl=scan.nextInt();
        
        if(yýl%4!=0) {
        	System.out.println("Girdiginiz yýl artýk yýl degil");
        	
		} else {
			
			if (yýl%100==0  && yýl%400==0) {
				System.out.println("Girdiginiz yýl artýk yýl");
		
			}  else if (yýl%100==0  && yýl%400!=0) {
				System.out.println("Girdiginiz yýl artýk yýl degil");
	
		  }  else  {
			System.out.println("Girdiginiz yýl artýk yýl");
			
		} 
		scan.close();
	 }
	}
}
