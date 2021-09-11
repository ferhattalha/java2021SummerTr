package day27_staticKeyword;

public class C01 {

	
		
		
		int sayý=10;
		String str="Yasasýn eclipse";
		static int sayý2;
		public static void main(String[] args) {
			
			
			// System.out.println(sayý); // sayý instance variable oldugu icin direk main metoddan kullanýlamaz. 
			// instance variable'lara obje üzerinden ulasabilirim
			
			// obje olusturmak icin consructor kullanmaliyim
			// bu class'da consructor var mi? VAR defaut constructor var.
			
			C01 obj1=new C01();
			
			// soldaki C01: class ismi ve ayný zamanda data türüdür.
			// sagdaki C01: class ismi ile ayný ve yanýnda parantez oldugu icin bu constructor'dur.
			
		// 	obj1.sayi; CTE verir. Çünkü ya atama yapmalýyýz yada yazdýrmalýyýz.
			
			System.out.println(obj1.sayý);
			obj1.sayý=44;   // artýk bu obje için kalýcý olarak 44 oldu.
		//	System.out.println(sayý); obje ürettik diye instance'a direk ulaþamayýz mutlaka obje kullanmalýyýz
			
			System.out.println(obj1.sayý);
			
			
			C01 obj2=new C01();
			
			System.out.println(obj2.sayý); // 10 herbir objede yapýlan degisiklik o objeyi baglar.
			
			obj2.sayý=34;
			System.out.println(obj2.sayý); // 34
			// java run time programdýr.
			
			System.out.println(sayý2);// 0
			
	}

}
