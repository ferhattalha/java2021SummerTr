package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access") // // bu main methodda static access ile ilgili isleyisi bozmayan kucuk bir hata
	public static void main(String[] args) {

		// CO1 deki variable'lara ulasmak istesem
		// ilk önce C01 deki variable'larýn ýnstance mi static mi olduguna bakarýz
		// örnegin sayý ve str ýnstance variable dýr, ulaþmak için obje üzerinden
		// ulaþabiliriz

		C01 obj1 = new C01();
		System.out.println(obj1.str);// Yasasýn eclipse

		obj1.str = "Yasasýn Faruk";

		System.out.println(obj1.str); // Yasasýn Faruk

		C01 obj2 = new C01();
		System.out.println(obj2.str); // Yasasýn eclipse

		// sayý2 variable'ý statik oldugu icin obleye ÝHTÝYAÇ DUYULMAZ.

		System.out.println(C01.sayý2); // 0 default deger

		C01 obj3 = new C01();

		obj3.sayý2 = 27; // CTE vermez
							// Ancak altýný sarý cizer ve satýr numarasýna ünlem koyar
							// Cünkü java daha kýsa ve emin yol var iken neden obje üzerinden ulastýn diye
							// þikayet eder
		// Bu kodun calýþmasýna engel degildir.CTE vermez.Fakat gereksiz bir islem
		// oldugundan java bizi uyarýr

		System.out.println(obj3.sayý2); // 27

		C01.sayý2=34; // static variable'lara class ismi variable ismi yazarak ulaþýlabilir
		// buna static way denir.
		
		
		System.out.println(C01.sayý2); // 34 Static variable'lar ulasabilen her obje ve her class icin ortaktýr
		                               // Okul adý gibi
		
		System.out.println(obj2.sayý2); // 34
		System.out.println(obj1.sayý2); // 34
		
		
		
	}

}
