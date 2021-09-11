package day22_arrayList;

import java.util.ArrayList;
import java.util.List;


public class C01_List01 {

	public static void main(String[] args) {
		
		
		List<String> isimler= new ArrayList<>();
		// Add metodu listenin sonuna ekleme yapar.
		
		isimler.add("Ali");
		System.out.println(isimler);
		isimler.add("Veli");
		isimler.add("Ayþe");
		isimler.add("Fatma");
		System.out.println(isimler);
		isimler.add("Ali");
		System.out.println(isimler); // index kullanmazsak sona ekler.
		
		// özel bir index'te kullanmak istersek o zaman index'li add metodunu kullanmalýyýz
		
		isimler.add(3,"Nihan");
		System.out.println(isimler); // [Ali, Veli, Ayþe, Nihan, Fatma, Ali]
		
		isimler.add(0, "Mehmet");
		System.out.println(isimler);  //[Mehmet, Ali, Veli, Ayþe, Nihan, Fatma, Ali]

		List<String> yeniList=new ArrayList<>();
		yeniList.add( "Fýrat");
        System.out.println(yeniList);	// Fýrat
        
        
        yeniList.addAll(isimler);
          System.out.println(yeniList); // [Fýrat, Mehmet, Ali, Veli, Ayþe, Nihan, Fatma, Ali]
         
          // bir de int elementlerin oldugu bir liste oluþturalým
          
          List<Integer> sayilar=new ArrayList<>();	// int primitive, Integer wrapper class ve non-primitive dir.
          
          sayilar.add(5);
          
          // yeniList'e sayýlar listi eklenir mi?
          
        //  yeniList.add(sayilar);  // String bir listeye int liste eklenemez.Farklý bir data türünden liste ve element ekleyemeyiz
          
          
	
	
	}

}
