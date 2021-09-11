package yaz2021_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class C99_OrtakList {

	public static void main(String[] args) {
		
		 
	
	List<String> list1= new ArrayList<>();
    list1.add("John");
    list1.add("Brad");
    list1.add("Ange");
    list1.add("Sofia");
    list1.add("Emily");
    
    
    List<String> list2= new ArrayList<>();
    list2.add("sofia");
    list2.add("brad");
    list2.add("grace");
    list2.add("emily");
    list2.add("hazel");
    
	
	
	
	
	ortakList(list1,list2);

	}

	private static void ortakList(List<String> list1, List<String> list2) {
		// TODO Auto-generated method stub
		
		List<String> ortakIsimler =new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i++) {// list1 den isimleri getirdi
	           
	           for (int j = 0; j < list2.size(); j++) { // list2 den isimleri getirdi
	               
	               if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
	                   
	                   ortakIsimler.add(list1.get(i));
	               }
	               
	           }
	           
	       }
	       System.out.println(ortakIsimler);
		
	}

}
