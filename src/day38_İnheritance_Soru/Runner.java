package day38_Ýnheritance_Soru;

public class Runner {

	public static void main(String[] args) {
		
		Cat c1=new Cat();// parent ile obj  Dat type cat clasýndan
		
		// Ayný isimli variable'lar call obj edilirken önce obj kendi classýndaki variable call edilir
		// Sonra parentindeki varableler call edilir 
		
		System.out.println(c1.a); // 5 animal
		System.out.println(c1.c); // 9 Kendi class c mammal dan degil
		System.out.println(c1.d); // 5 kendi class'ýndan
		System.out.println(c1.m); // 4 mammal
		
		
		c1.mM();// animalmammal    Animal class-->call
		c1.mC();// cat             Cat class---> call
		c1.mA(); // ammal         Mammal class--->call
		
		
		/* Method call edilirken ayný isimli methodlarýn 
		 * alýnacagýna costructor karar verir. Class'dan parant'e
		 * dogru hiyerarþi çalýþýr. Babadan dedeye önce kimde bulursa
		 * onu alýr parent class'dan baþlanýr child classdan degil*/
		 
		Mammal c2=new Cat(); // c2 obj kendi class'ý mammal'dýr.
		System.out.println(c2.a);// Animal class--->call
		System.out.println(c2.c);// Mammal class--->call
		System.out.println(c2.m);// Mammal class--->call
		
		c2.mA(); // mammal cons---->call
		c2.mC(); // cat     cons---->call
		c2.mM(); // animalmammal  cons---->call
	
		Mammal m1=new Mammal();
        Animal c3=new Cat();

		
		m1.mA(); // mammal
		m1.mC(); // catmammal
		m1.mM(); // animalmammal
		
		c3.mA(); // animal
		c3.mM(); // animalmammal
		
	}

}
