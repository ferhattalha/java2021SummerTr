package day22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List02 {

	public static void main(String[] args) {
		
		List<Integer> sayilar=new ArrayList<>();
		
		sayilar.add(10);
		sayilar.add(20);
		
		System.out.println(sayilar.size()); // 2
		System.out.println(sayilar.isEmpty()); // fulse
		System.out.println(sayilar); // [10, 20]
		
		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar); // [10, 20, 30, 40]
		
		//System.out.println(sayilar.remove(2)); // 30
	    int silinenEleman=sayilar.remove(2);
		
		System.out.println(sayilar); // [10, 20, 40]
		
		sayilar.add(silinenEleman);
		
		System.out.println(sayilar);  // [10, 20, 40, 30]
		
		// remove ikinci y�ntem olarak direk silmek istedi�imiz degeri yazabiliriz
		
	//	sayilar.remove(20);
	//	System.out.println(sayilar); Hata : Eger listemiz say�lardan olusuyorsa biz silmesini istedigimiz
	//	elementi yazd���m�zda java index olarak alg�lar. String list icin b�yle bir problem olmaz.
		
		List<String> isimler=new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Ay�e");
		isimler.add("Zeki");
		
		System.out.println(isimler);  //[Ali, Ay�e, Zeki]
		
		System.out.println(isimler.remove("Zeki")); // True
		
		System.out.println(isimler); // [Ali, Ay�e]
		
		isimler.remove("Ay�e");
		System.out.println(isimler); // [Ali]
		
		boolean sonuc=isimler.remove("Mehmet");
		
		if(sonuc) {
			
			System.out.println("Mehmet'i buldum ve sildim ");
			
		} else {
		
		System.out.println("Mehmet'i bulamad�m ve silemedim"); // Mehmet'i bulamad�m ve silemedim

	}

		isimler.remove(0);
		
		System.out.println(isimler);
		
		isimler.add("Ali");
		isimler.add("Ay�e");
		isimler.add("Zeki");
		
		System.out.println(isimler); //[Ali, Ay�e, Zeki]

		 isimler.removeAll(isimler);
		
		 System.out.println(isimler);// []
		
}
}