package day19_Arrays;

import java.util.Arrays;

public class C01_Array01 {

	public static void main(String[] args) {

		short arr1[] = new short[5];

		System.out.println(arr1); // arr1 bir array, data türü non-primitive
									// short arr'in degil icine koyacagýmýz degerin data türü

		// eger non primitive bir datay direk syso ile yazdýrmaya çalýþýrsak
		// jav bize arr'nin referans bilgisini yazdýrýr.

		System.out.println(arr1[1]);

		String isimler[] = new String[4];

		
		
		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";
		System.out.println(Arrays.toString(isimler)); // yazdýrma

		String isimler2[] = { "Ali", "Veli", "Ayþe", "Fatma" };
		System.out.println(Arrays.toString(isimler2)); // yazdýrma
 
		// isimler array'inki veli yerine Hasan yazalým.

		isimler2[1] = "Hasan";

		// isimler[5]="Hakan"; // java 5. index var mý yok mu bilmiyor.
		// syntex acýsýndan sorun olmadýgý icin CTE vermiyor.
		// ama run ettigimizde 5. index'i bulamadýgýmýz icin hata verir.

		System.out.println(isimler.length);

		// System.out.println(isimler[3]); // fatma
		// System.out.println(isimler2[1]);// hasan

		// tüm elemanlarý yazdýrma
		// 2. yol loop kullanma

		// System.out.println();
		
		for (int i = 0; i < isimler2.length; i++) {

			// System.out.print(isimler2[i]+" ");

			// 2.yol array class'ýndan yardým alýrýz

			System.out.println(Arrays.toString(isimler));

		}
	}

}
