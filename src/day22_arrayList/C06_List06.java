package day22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_List06 {

	public static void main(String[] args) {
		
		
		// 100'den büyük ilk 20  fibonacci sayýlarýný bir list olarak yazdýrýn.
		
		
				List<Integer> fibonacci = new ArrayList<>();
				List<Integer> istenenSayilar = new ArrayList<>();
				
				
				fibonacci.add(0);
				fibonacci.add(1);
				
				int count=1;
				int sayi=1;
				int i=1;
				
				do {
					sayi=fibonacci.get(i-1)+fibonacci.get(i);
					fibonacci.add(sayi);
					if(sayi>100) {
						istenenSayilar.add(sayi);
						count++;
						
						
					}
				
					i++;
				
				} while(count <=20);
				
				System.out.println(istenenSayilar); 
				System.out.println(fibonacci);
				
				}
	          
	}


