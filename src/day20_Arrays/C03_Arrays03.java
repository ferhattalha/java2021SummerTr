package day20_Arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
        // Verilen bir arry'i büyükten kücüge sýralayan bir metod yazdýrýn.
		// int myArray[]= {9,15,11};

		// Arrays.sort(myArray);

		// System.out.println(Arrays.toString(myArray));
		// }

		int[] arr = { 3, 15, 10, 11, 9 };

		arr = arrayiSýrala(arr);
		arrayTers(arr);

	//	System.out.println(Arrays.toString(arrayTers(arr)));  //  [15, 11, 10, 9, 3]
		
		arr=arrayTers(arr);
		System.out.println(Arrays.toString(arr));  //  [15, 11, 10, 9, 3]
		
	}

	private static int[] arrayTers(int[] arr) {
		int[] temp = new int[arr.length]; // Eski array ile ayný uzunlukta array olusturduk

		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length - 1 - i];
		
		}
		
		return temp;
	}

	private static int[] arrayiSýrala(int[] arr) {

		Arrays.sort(arr);
		return arr;
	}
}
