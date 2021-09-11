package day11_stringManipulations;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		
		String kkNo="Java 123 @#";

		System.out.println(kkNo.replace(" ", "")); // 1234541236524785
		
		System.out.println(kkNo); // 1234 5412 3652 4785
		
		// replace all metodu
		
		System.out.println(kkNo.replaceAll("\\s" , "" )); // s sadece space
		System.out.println(kkNo.replaceAll("\\s" , "*" )); // s sadee space
		System.out.println(kkNo.replaceAll("\\S" , "*" ));// space olmayan herþey
		System.out.println(kkNo.replaceAll("\\w" , "-" )); // harf veya rakamlarýn hepsi
		System.out.println(kkNo.replaceAll("\\W" , "-" )); // harf veya rakamlarýn dýsýndaki herþey
		System.out.println(kkNo.replaceAll("\\d" , "0" )); // digit rakamlarýn  hepsi
		System.out.println(kkNo.replaceAll("\\D" , "a" )); // digit rakamlarýn dýsýndaki herþey
		
		kkNo= "1234 5698 1278 5687";  // atama yapýnca kalýcý olarak degistirmiþ oluruz
		
		System.out.println(kkNo);
	}
	

}
