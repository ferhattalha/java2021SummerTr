package day29_ByPassValue_ImmutableClass;

public class C04_ImmutableClasses02 {

	public static void main(String[] args) {
	
		
		String A= "Ali";
		String B="Ali";
		String C=B+"";  // C'nin degeri sonucta yine sadece Ali olsada Concatenation oldugundan
		                // java rist almaz ve yeni bir obje olusturur.
		String D=C;
		
		
		// equals metodu sadece icerige bakt�g� icin �cerik hepsinde Ali oldugundan
		// equals iki sat�rda da true d�ner.
		System.out.println(A.equals(B)); // True
		System.out.println(A.equals(C)); // True
		System.out.println(D.equals(C)); // True
		
		// hem icerige hem de referansa bakar.
		// dolays�yla A==C false verir.
		// A ve B objesi farkl� objeler oldugu halde nicin A==B true d�nd�?
		
		System.out.println(A==B); //True
		System.out.println(A==C); // False
		System.out.println(D==C); //True
		
		String E=new String("Ali"); 
		// String non-primitive oldugundan new kelimesini kullanmak gerekir
		// Ama string cok kullan�ld�g� icin string'e �zel olarak new kelimesi kullanmadan
		// yeni String olusturabiliriz. String �sim="Ali"; gibi.
		System.out.println("new ile olusturulan E degiskeni : "+ E); 
		String F=new String("Ali");
		
		System.out.println(E.equals(F)); // True
		System.out.println(E==F); // False
	}

}
