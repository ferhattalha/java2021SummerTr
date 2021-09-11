package day10_stringManupulations;

public class C1_StringManipulations01 {

	public static void main(String[] args) {

		String name1 = "Ali Can";
		String name2 = "Ali Can";
		String name3 = name2 + ""; // space yok
		String name4 = "Ali";
		String name5 = "Can";
		String name6 = name4 + " " + name5; // Ali Can

		System.out.println(name1.equals(name2)); // True
		System.out.println(name1.equals(name3)); // True
		System.out.println(name2.equals(name6)); // True

		System.out.println(name1==name2); // True
		System.out.println(name1==name3); // False
		System.out.println(name2==name6); // False

		// farkl� objeler ayn� degeri ald�g�nda java referanslara bakar
		// bu referanslar ayn� ise true dondurur, yoksa false dondurur
		// degerleri kar��la�t�rmak ve supriz yasamamak istiyorsak equals() kullanmal�s�n�z
		
		
		String name7="ALI CAN";
        String name8="AlI cAn";
        String name9="ali can";
        String name10= "AliCan";
        
        System.out.println(name1.equals(name7)); // false 
        System.out.println(name1.equalsIgnoreCase(name7)); //true
        
        System.out.println(name7.equalsIgnoreCase(name9)); // true
        System.out.println(name8.equalsIgnoreCase(name9)); // true
        System.out.println(name9.equalsIgnoreCase(name10)); // false
	}
}