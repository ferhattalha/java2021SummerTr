package day19_Arrays;

import java.util.Arrays;

public class C01_Array01 {

	public static void main(String[] args) {

		short arr1[] = new short[5];

		System.out.println(arr1); // arr1 bir array, data t�r� non-primitive
									// short arr'in degil icine koyacag�m�z degerin data t�r�

		// eger non primitive bir datay direk syso ile yazd�rmaya �al���rsak
		// jav bize arr'nin referans bilgisini yazd�r�r.

		System.out.println(arr1[1]);

		String isimler[] = new String[4];

		
		
		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";
		System.out.println(Arrays.toString(isimler)); // yazd�rma

		String isimler2[] = { "Ali", "Veli", "Ay�e", "Fatma" };
		System.out.println(Arrays.toString(isimler2)); // yazd�rma
 
		// isimler array'inki veli yerine Hasan yazal�m.

		isimler2[1] = "Hasan";

		// isimler[5]="Hakan"; // java 5. index var m� yok mu bilmiyor.
		// syntex ac�s�ndan sorun olmad�g� icin CTE vermiyor.
		// ama run ettigimizde 5. index'i bulamad�g�m�z icin hata verir.

		System.out.println(isimler.length);

		// System.out.println(isimler[3]); // fatma
		// System.out.println(isimler2[1]);// hasan

		// t�m elemanlar� yazd�rma
		// 2. yol loop kullanma

		// System.out.println();
		
		for (int i = 0; i < isimler2.length; i++) {

			// System.out.print(isimler2[i]+" ");

			// 2.yol array class'�ndan yard�m al�r�z

			System.out.println(Arrays.toString(isimler));

		}
	}

}
