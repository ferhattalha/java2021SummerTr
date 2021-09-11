package day11_stringManipulations;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		
		String kkNo="Java 123 @#";

		System.out.println(kkNo.replace(" ", "")); // 1234541236524785
		
		System.out.println(kkNo); // 1234 5412 3652 4785
		
		// replace all metodu
		
		System.out.println(kkNo.replaceAll("\\s" , "" )); // s sadece space
		System.out.println(kkNo.replaceAll("\\s" , "*" )); // s sadee space
		System.out.println(kkNo.replaceAll("\\S" , "*" ));// space olmayan her�ey
		System.out.println(kkNo.replaceAll("\\w" , "-" )); // harf veya rakamlar�n hepsi
		System.out.println(kkNo.replaceAll("\\W" , "-" )); // harf veya rakamlar�n d�s�ndaki her�ey
		System.out.println(kkNo.replaceAll("\\d" , "0" )); // digit rakamlar�n  hepsi
		System.out.println(kkNo.replaceAll("\\D" , "a" )); // digit rakamlar�n d�s�ndaki her�ey
		
		kkNo= "1234 5698 1278 5687";  // atama yap�nca kal�c� olarak degistirmi� oluruz
		
		System.out.println(kkNo);
	}
	

}
