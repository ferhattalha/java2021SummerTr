package day29_ByPassValue_ImmutableClass;

public class C03_ImmutableClasses01 {

	public static void main(String[] args) {

		int say� = 10;

		for (int i = 0; i < 10000; i++) {
			i++;

		}

		// Bu kodu cal�st�rd�g�m�zda 13. sat�ra kadar java ka� obje �retir.
		// Bu soruyu cevaplamak icin degiskenin data t�r�ne bakmal�y�z
		// say�n�n veri t�r�: int
		// int mutable

		String str = "A";

		for (int i = 0; i < 10000; i++) {
			i++;
		
		// i int oldugu icin sadece 1 tane variable olu�turulur ama str string oldugundan
		//	10001 obje olusturulur.
			
		}
		
	}

}
