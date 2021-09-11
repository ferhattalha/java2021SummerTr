package day27_staticKeyword;

public class C03_StaticKeyword {

	
	static int sayi = 15;
	
	String str = "Java";
			
public static void main(String[] args) {
	
	// Bir method veya variable' i static yapmanýn avantajý;
	
	// Static variable ve method' lara ulasmak istedigimizde classIsmi.methodIsmi yazmamýz
	// yeterli olur. Ornegin array' lerde kullandigimiz Arrays.toString () methodu, static
	// olarak Java Developper' lari tarafindan hazirlanmis oldugu icin Arrays.toString()
	// yazarak method' u rahatlikla kullanabiliyoruz
	
	// Ancak variable' lari static yapmak biraz riskli. Mesela bir okul uygulamasinda okul
	// ismini static variable olarak olusturursak avantaj olarak her yerden rahatlikla okul
	// ismine ulasabiliriz. Ama ogrenci objelerinden veya ogretmen objelerinden biri uzerinden
	// okul adi degistirilirse, tum ogrenciler ve tum ogretmenler icin okul adi kalici olarak
	// degismis olur ve bu da bir uygulama icin istenmeyen bir durumdur
	
	sayi = 20;
	
	// str = "Static olan main method' dan instance variable' a direk ulasamazsin...!";
	
	staticMethod();
	
	// staticOlmayanMethod(); // main method static oldugu icin static olmayan method' u cagiramayiz
	
	System.out.println(C01.sayý2); 			// 0 yazdirir
	
	// Java runtime bir programdir, hangi class' ta run tuþuna basarsaniz o class calisir!!!
	
}
public static void staticMethod() {
	
	System.out.println("Static variable' lar gokteki ay gibidir ");
	
	sayi = 30;
	
	// str = " Buradan ulasilamaz ";
	
}

public void staticOlmayanMethod() {
	
	System.out.println("Static olmayan method calisti ");
	
	staticMethod();			// static method' lar her yerden cagirilabilir
	
	sayi = 25;			// static variable' lara her yerden ulasilabilir ve deger atanabilir
	
	str="Static olmayan method' dan static olmayan variable' a ulasabilirim ";
	
	
}
}
	