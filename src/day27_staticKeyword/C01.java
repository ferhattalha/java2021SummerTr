package day27_staticKeyword;

public class C01 {

	
		
		
		int say�=10;
		String str="Yasas�n eclipse";
		static int say�2;
		public static void main(String[] args) {
			
			
			// System.out.println(say�); // say� instance variable oldugu icin direk main metoddan kullan�lamaz. 
			// instance variable'lara obje �zerinden ulasabilirim
			
			// obje olusturmak icin consructor kullanmaliyim
			// bu class'da consructor var mi? VAR defaut constructor var.
			
			C01 obj1=new C01();
			
			// soldaki C01: class ismi ve ayn� zamanda data t�r�d�r.
			// sagdaki C01: class ismi ile ayn� ve yan�nda parantez oldugu icin bu constructor'dur.
			
		// 	obj1.sayi; CTE verir. ��nk� ya atama yapmal�y�z yada yazd�rmal�y�z.
			
			System.out.println(obj1.say�);
			obj1.say�=44;   // art�k bu obje i�in kal�c� olarak 44 oldu.
		//	System.out.println(say�); obje �rettik diye instance'a direk ula�amay�z mutlaka obje kullanmal�y�z
			
			System.out.println(obj1.say�);
			
			
			C01 obj2=new C01();
			
			System.out.println(obj2.say�); // 10 herbir objede yap�lan degisiklik o objeyi baglar.
			
			obj2.say�=34;
			System.out.println(obj2.say�); // 34
			// java run time programd�r.
			
			System.out.println(say�2);// 0
			
	}

}
