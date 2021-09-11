package day24_ForEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop01 {

	public static void main(String[] args) {
		
		/*
        2 )    Input olarak verilen 2 listeyi Parametre olarak kabul edip, 
               ortak isimleri yazdiran bir method yaziniz
       
       INPUT :     list1={Ali,Veli,Ayse,Fatma,Omer}
                   list2={Ali,Kemal,Hatice,Fatma,Omer,Yusuf}
       OUTPUT =[Ali,Fatma,Omer]
        */
       
       List<String> list1= new ArrayList<>();
       list1.add("ALI");
       list1.add("Veli");
       list1.add("Ayse");
       list1.add("Fatma");
       list1.add("Omer");
       
       
       List<String> list2= new ArrayList<>();
       list2.add("Ali");
       list2.add("Kemal");
       list2.add("Hatice");
       list2.add("FATma");
       list2.add("Omer");
       list2.add("Yusuf");

       // bu listedeki isimlerden uzunlugu 4 harften fazla olan isimleri yazdýralým 
       
       // for-each loop index veya size'a bakmadan tek tek tüm elementleri bize getirir.
       
       for (String each : list1) {
		
    	   System.out.print(each+" ");
    	   
    	if(each.length()>4) {
    		
    		System.out.println(each+" ");
    	}
	}
       
	}
}

