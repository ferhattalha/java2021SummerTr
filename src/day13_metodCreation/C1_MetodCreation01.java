package day13_metodCreation;

public class C1_MetodCreation01 {

	public static void main(String[] args) {

		// Bir metod'u olusturmak o metodu cal��t�rmak icin yeterli degildir.
		// Eger bir metodu cal�st�rmak istersek
		// Metod Call (o metodu �agirmal�y�z)

		// Metod call yapmak icin metodun'un ad� ve parametreleri yaz�lmal�d�r.

		toplama(20, 40);

		// sadece matod call yap�t�g�m�zda metod �al���r
		// Eger metodun icinde bir sey yazd�r�yorsak ancak console'da o yaz�y� g�r�r�z
		// ancak metodumuz return type'a sahipse bize bir sonuc return edecektir.
		// bu sonucu ya direk yazd�r�r�z
		
		System.out.println(toplama(15,20));
		
		// veya donen sonucu bir variable'a atayabiliriz
		
		int sonuc= toplama(10,15);
		
		System.out.println(sonuc);
		
	}

	
	
	
	public static int toplama(int sayi1, int sayi2) {

		System.out.println("metod cal�st�");
		
		return sayi1 + sayi2;

		
		
	}

}