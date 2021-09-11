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
		
		// remove ikinci yöntem olarak direk silmek istediðimiz degeri yazabiliriz
		
	//	sayilar.remove(20);
	//	System.out.println(sayilar); Hata : Eger listemiz sayýlardan olusuyorsa biz silmesini istedigimiz
	//	elementi yazdýðýmýzda java index olarak algýlar. String list icin böyle bir problem olmaz.
		
		List<String> isimler=new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Ayþe");
		isimler.add("Zeki");
		
		System.out.println(isimler);  //[Ali, Ayþe, Zeki]
		
		System.out.println(isimler.remove("Zeki")); // True
		
		System.out.println(isimler); // [Ali, Ayþe]
		
		isimler.remove("Ayþe");
		System.out.println(isimler); // [Ali]
		
		boolean sonuc=isimler.remove("Mehmet");
		
		if(sonuc) {
			
			System.out.println("Mehmet'i buldum ve sildim ");
			
		} else {
		
		System.out.println("Mehmet'i bulamadým ve silemedim"); // Mehmet'i bulamadým ve silemedim

	}

		isimler.remove(0);
		
		System.out.println(isimler);
		
		isimler.add("Ali");
		isimler.add("Ayþe");
		isimler.add("Zeki");
		
		System.out.println(isimler); //[Ali, Ayþe, Zeki]

		 isimler.removeAll(isimler);
		
		 System.out.println(isimler);// []
		
}
}