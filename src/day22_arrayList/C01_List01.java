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
		isimler.add("Ay�e");
		isimler.add("Fatma");
		System.out.println(isimler);
		isimler.add("Ali");
		System.out.println(isimler); // index kullanmazsak sona ekler.
		
		// �zel bir index'te kullanmak istersek o zaman index'li add metodunu kullanmal�y�z
		
		isimler.add(3,"Nihan");
		System.out.println(isimler); // [Ali, Veli, Ay�e, Nihan, Fatma, Ali]
		
		isimler.add(0, "Mehmet");
		System.out.println(isimler);  //[Mehmet, Ali, Veli, Ay�e, Nihan, Fatma, Ali]

		List<String> yeniList=new ArrayList<>();
		yeniList.add( "F�rat");
        System.out.println(yeniList);	// F�rat
        
        
        yeniList.addAll(isimler);
          System.out.println(yeniList); // [F�rat, Mehmet, Ali, Veli, Ay�e, Nihan, Fatma, Ali]
         
          // bir de int elementlerin oldugu bir liste olu�tural�m
          
          List<Integer> sayilar=new ArrayList<>();	// int primitive, Integer wrapper class ve non-primitive dir.
          
          sayilar.add(5);
          
          // yeniList'e say�lar listi eklenir mi?
          
        //  yeniList.add(sayilar);  // String bir listeye int liste eklenemez.Farkl� bir data t�r�nden liste ve element ekleyemeyiz
          
          
	
	
	}

}
