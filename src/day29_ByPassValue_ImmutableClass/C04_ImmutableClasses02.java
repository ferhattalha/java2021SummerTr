package day29_ByPassValue_ImmutableClass;

public class C04_ImmutableClasses02 {

	public static void main(String[] args) {
	
		
		String A= "Ali";
		String B="Ali";
		String C=B+"";  // C'nin degeri sonucta yine sadece Ali olsada Concatenation oldugundan
		                // java rist almaz ve yeni bir obje olusturur.
		String D=C;
		
		
		// equals metodu sadece icerige baktýgý icin Ýcerik hepsinde Ali oldugundan
		// equals iki satýrda da true döner.
		System.out.println(A.equals(B)); // True
		System.out.println(A.equals(C)); // True
		System.out.println(D.equals(C)); // True
		
		// hem icerige hem de referansa bakar.
		// dolaysýyla A==C false verir.
		// A ve B objesi farklý objeler oldugu halde nicin A==B true döndü?
		
		System.out.println(A==B); //True
		System.out.println(A==C); // False
		System.out.println(D==C); //True
		
		String E=new String("Ali"); 
		// String non-primitive oldugundan new kelimesini kullanmak gerekir
		// Ama string cok kullanýldýgý icin string'e özel olarak new kelimesi kullanmadan
		// yeni String olusturabiliriz. String Ýsim="Ali"; gibi.
		System.out.println("new ile olusturulan E degiskeni : "+ E); 
		String F=new String("Ali");
		
		System.out.println(E.equals(F)); // True
		System.out.println(E==F); // False
	}

}
