package day22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List05 {

	public static void main(String[] args) {
		
		
		// 200'e kadar olan fibonacci sayýlarýný bir list olarak yazdýrýn.
		
		
		List<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		
		int sayi=0;
		int index=1;
		
		while(sayi<200) {
		
		sayi=fibonacci.get(index)+fibonacci.get(index+1);
		
		if(sayi <200) {
			fibonacci.add(sayi);
		}
		
		
		index++;
		
		}
		
		System.out.println(fibonacci);
	}

}
