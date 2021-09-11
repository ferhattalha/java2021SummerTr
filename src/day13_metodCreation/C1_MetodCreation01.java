package day13_metodCreation;

public class C1_MetodCreation01 {

	public static void main(String[] args) {

		// Bir metod'u olusturmak o metodu calýþtýrmak icin yeterli degildir.
		// Eger bir metodu calýstýrmak istersek
		// Metod Call (o metodu çagirmalýyýz)

		// Metod call yapmak icin metodun'un adý ve parametreleri yazýlmalýdýr.

		toplama(20, 40);

		// sadece matod call yapýtýgýmýzda metod çalýþýr
		// Eger metodun icinde bir sey yazdýrýyorsak ancak console'da o yazýyý görürüz
		// ancak metodumuz return type'a sahipse bize bir sonuc return edecektir.
		// bu sonucu ya direk yazdýrýrýz
		
		System.out.println(toplama(15,20));
		
		// veya donen sonucu bir variable'a atayabiliriz
		
		int sonuc= toplama(10,15);
		
		System.out.println(sonuc);
		
	}

	
	
	
	public static int toplama(int sayi1, int sayi2) {

		System.out.println("metod calýstý");
		
		return sayi1 + sayi2;

		
		
	}

}