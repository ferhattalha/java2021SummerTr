package day42_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions07 {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4};
		
		System.out.println(arr[1]); // 2
		
		System.out.println(arr[3]);// 4
		
	//	System.out.println(arr[5]); // ArrayIndexOutOfBoundsExceptios Unchecked
		
		
		List<String> gzlisans=new ArrayList<>(Arrays.asList("Merve","hakan","f�rat"));
		System.out.println(gzlisans.get(2)); 
		System.out.println(gzlisans.get(0));
		System.out.println(gzlisans.get(5)); 
		
		// INTERW�EW SORUSU
		
		// Array ve List'lerde olmayana bir index ile i�lem yap�l�rsa
		// java IndexOutOfBoundsException unchecked hatas� verir.
	}

}
