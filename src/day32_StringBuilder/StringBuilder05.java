package day32_StringBuilder;



public class StringBuilder05 {

	public static void main(String[] args) {

		
		StringBuilder sb1=new  StringBuilder("Rumeysa");
		
		System.out.println(sb1);// rümeysa

		sb1.append(" ").append("Çetinturk");
		// sb1.append(" ").append("Çetintürk"+ " " + "java"); bu þekilde olur
		
		System.out.println(sb1); // Rümeysa Çetintürk java
		
		String cümle="javayý çok sever";
		
		sb1.append("javayý cok sever",6,10);
		
		System.out.println(sb1); // Rümeysa Çetintürk cok
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.charAt(1);
		System.out.println(sb1.charAt(1));//u
		
		sb1.charAt(5);  // Bize sadece bilgi verir string builder'i degistirmez. Append degistirir
		System.out.println(sb1); // Rumeysa Çetinturk cok
		
		sb1.delete(17, 21);
		System.out.println(sb1); // Rumeysa Çetinturk
		
		sb1.deleteCharAt(16);
		System.out.println(sb1); // Rumeysa Çetintur
		
		String isim="Rumeysa Çetintur";
		System.out.println(sb1.equals(isim)); // fulse (String builder'da epuals farklý çalýþýr.Data türleri farklý oldugu için içirik ayný olmaz)
		
		StringBuilder sb2=new StringBuilder("Rumeysa Çetintur");
		
		System.out.println(sb1==sb2);  // false
		
		System.out.println(sb1.equals(sb2)); // false  String builder methodu stringten farklý çalýþýr ve ancak 
		                                     // ayný obje ile kýyaslandýgýndas true verir.
		
		System.out.println(sb1.equals(sb1)); // true
		
		sb1.indexOf("Çetin");
		
		System.out.println(sb1.indexOf("Çetin"));  // 8
		
		System.out.println(sb1.indexOf("e",6)); //9
		
		System.out.println(sb1.indexOf("Kazým")); // -1
		
	sb1.insert(7," "); // istedigimiz index'ten itibaren istenen stringi ekler
		
		 System.out.println(sb1);
		
		cümle="Merhaba dunya";
		
		sb1.insert(0,cümle,0,8);
		
		System.out.println(sb1);
		
		sb1.insert(25, cümle, 8, 13);
		
		System.out.println(sb1); // Merhaba Rumeysa  Çetinturdunya
		
		sb1.lastIndexOf("t");
		System.out.println(sb1.lastIndexOf("t"));//22
		System.out.println(sb1.lastIndexOf("a",22)); // 14
		
		sb1.replace(8, 15, "Seher");
		
		System.out.println(sb1); //Merhaba Seher Çetinturdunya
		
		sb1.reverse();
		System.out.println(sb1); // aynudrutniteÇ  reheS abahreM
		
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1); // Merhaba Seker  Çetinturdunya
		
		sb1.subSequence(8,13);
		System.out.println(sb1.subSequence(8,13)); //Seker
		
		sb1.substring(10);
		System.out.println(sb1.substring(8)); // Seker  Çetinturdunya
		
		sb1.subSequence(8, 13);
		System.out.println(sb1); // Merhaba Seker  Çetinturdunya
		sb1.substring(8, 13);
		System.out.println(sb1); // Merhaba Seker  Çetinturdunya
		
		sb1.toString();
		
		StringBuilder sb3=new StringBuilder("java cok güzel");
		StringBuilder sb4=new StringBuilder("java cok güzel");
		
		sb3.equals(sb4);
		System.out.println(sb3.equals(sb4)); // fulse
		
		sb3.toString().equals(sb4.toString());
		System.out.println(sb3.toString().equals(sb4.toString())); // true
		
		sb3.toString().concat("Insanýn sevdikce sevesi geliyor");
		System.out.println(sb3); // java cok güzel
		
		System.out.println(sb3.toString().concat(" Insanýn sevdikce sevesi geliyor")); // java cok güzel Insanýn sevdikce sevesi geliyor
		
		System.out.println(sb1.length()); // 28
		System.out.println(sb1.capacity());// 48
		
		sb1.trimToSize();
		
	System.out.println(sb1.length());  // 28
	System.out.println(sb1.capacity()); // 28
	
	
	System.out.println(sb3.compareTo(sb4)); // 0  Karakterleri sýradan kontrol eder (0 ise esittir)
	
		
		
	}
	
	
	
	
	

}
