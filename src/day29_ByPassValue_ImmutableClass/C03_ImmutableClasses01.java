package day29_ByPassValue_ImmutableClass;

public class C03_ImmutableClasses01 {

	public static void main(String[] args) {

		int sayý = 10;

		for (int i = 0; i < 10000; i++) {
			i++;

		}

		// Bu kodu calýstýrdýgýmýzda 13. satýra kadar java kaç obje üretir.
		// Bu soruyu cevaplamak icin degiskenin data türüne bakmalýyýz
		// sayýnýn veri türü: int
		// int mutable

		String str = "A";

		for (int i = 0; i < 10000; i++) {
			i++;
		
		// i int oldugu icin sadece 1 tane variable oluþturulur ama str string oldugundan
		//	10001 obje olusturulur.
			
		}
		
	}

}
