package day32_StringBuilder;



public class StringBuilder05 {

	public static void main(String[] args) {

		
		StringBuilder sb1=new  StringBuilder("Rumeysa");
		
		System.out.println(sb1);// r�meysa

		sb1.append(" ").append("�etinturk");
		// sb1.append(" ").append("�etint�rk"+ " " + "java"); bu �ekilde olur
		
		System.out.println(sb1); // R�meysa �etint�rk java
		
		String c�mle="javay� �ok sever";
		
		sb1.append("javay� cok sever",6,10);
		
		System.out.println(sb1); // R�meysa �etint�rk cok
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.charAt(1);
		System.out.println(sb1.charAt(1));//u
		
		sb1.charAt(5);  // Bize sadece bilgi verir string builder'i degistirmez. Append degistirir
		System.out.println(sb1); // Rumeysa �etinturk cok
		
		sb1.delete(17, 21);
		System.out.println(sb1); // Rumeysa �etinturk
		
		sb1.deleteCharAt(16);
		System.out.println(sb1); // Rumeysa �etintur
		
		String isim="Rumeysa �etintur";
		System.out.println(sb1.equals(isim)); // fulse (String builder'da epuals farkl� �al���r.Data t�rleri farkl� oldugu i�in i�irik ayn� olmaz)
		
		StringBuilder sb2=new StringBuilder("Rumeysa �etintur");
		
		System.out.println(sb1==sb2);  // false
		
		System.out.println(sb1.equals(sb2)); // false  String builder methodu stringten farkl� �al���r ve ancak 
		                                     // ayn� obje ile k�yasland�g�ndas true verir.
		
		System.out.println(sb1.equals(sb1)); // true
		
		sb1.indexOf("�etin");
		
		System.out.println(sb1.indexOf("�etin"));  // 8
		
		System.out.println(sb1.indexOf("e",6)); //9
		
		System.out.println(sb1.indexOf("Kaz�m")); // -1
		
	sb1.insert(7," "); // istedigimiz index'ten itibaren istenen stringi ekler
		
		 System.out.println(sb1);
		
		c�mle="Merhaba dunya";
		
		sb1.insert(0,c�mle,0,8);
		
		System.out.println(sb1);
		
		sb1.insert(25, c�mle, 8, 13);
		
		System.out.println(sb1); // Merhaba Rumeysa  �etinturdunya
		
		sb1.lastIndexOf("t");
		System.out.println(sb1.lastIndexOf("t"));//22
		System.out.println(sb1.lastIndexOf("a",22)); // 14
		
		sb1.replace(8, 15, "Seher");
		
		System.out.println(sb1); //Merhaba Seher �etinturdunya
		
		sb1.reverse();
		System.out.println(sb1); // aynudrutnite�  reheS abahreM
		
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1); // Merhaba Seker  �etinturdunya
		
		sb1.subSequence(8,13);
		System.out.println(sb1.subSequence(8,13)); //Seker
		
		sb1.substring(10);
		System.out.println(sb1.substring(8)); // Seker  �etinturdunya
		
		sb1.subSequence(8, 13);
		System.out.println(sb1); // Merhaba Seker  �etinturdunya
		sb1.substring(8, 13);
		System.out.println(sb1); // Merhaba Seker  �etinturdunya
		
		sb1.toString();
		
		StringBuilder sb3=new StringBuilder("java cok g�zel");
		StringBuilder sb4=new StringBuilder("java cok g�zel");
		
		sb3.equals(sb4);
		System.out.println(sb3.equals(sb4)); // fulse
		
		sb3.toString().equals(sb4.toString());
		System.out.println(sb3.toString().equals(sb4.toString())); // true
		
		sb3.toString().concat("Insan�n sevdikce sevesi geliyor");
		System.out.println(sb3); // java cok g�zel
		
		System.out.println(sb3.toString().concat(" Insan�n sevdikce sevesi geliyor")); // java cok g�zel Insan�n sevdikce sevesi geliyor
		
		System.out.println(sb1.length()); // 28
		System.out.println(sb1.capacity());// 48
		
		sb1.trimToSize();
		
	System.out.println(sb1.length());  // 28
	System.out.println(sb1.capacity()); // 28
	
	
	System.out.println(sb3.compareTo(sb4)); // 0  Karakterleri s�radan kontrol eder (0 ise esittir)
	
		
		
	}
	
	
	
	
	

}
