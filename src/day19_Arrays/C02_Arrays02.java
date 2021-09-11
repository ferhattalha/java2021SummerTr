package day19_Arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {

		int arr[]=new int[5];

		System.out.println(Arrays.toString(arr));
		
		// olusturulan bu array'in uzunlugunu degistirebilirmiyim ?
		
		
		// arr[6]=5;   Hata verir  // Array'in length'i sonradan degistirilemez.
		// 	Array'i kullanýssýz yapan bu özelligidir.
		
		
		arr[2]=1;
		System.out.println(Arrays.toString(arr)); // [0, 0, 1, 0, 0]
		
		
		arr=new int[6];  // ekleme yapmaz 6 elementlik yeni bir array atar
		System.out.println(Arrays.toString(arr));   // [0, 0, 0, 0, 0, 0]
		
		// ARRAY'in length'i DEGÝSTÝRÝLEMEZ........
	}

}
