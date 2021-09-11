package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access") // // bu main methodda static access ile ilgili isleyisi bozmayan kucuk bir hata
	public static void main(String[] args) {

		// CO1 deki variable'lara ulasmak istesem
		// ilk �nce C01 deki variable'lar�n �nstance mi static mi olduguna bakar�z
		// �rnegin say� ve str �nstance variable d�r, ula�mak i�in obje �zerinden
		// ula�abiliriz

		C01 obj1 = new C01();
		System.out.println(obj1.str);// Yasas�n eclipse

		obj1.str = "Yasas�n Faruk";

		System.out.println(obj1.str); // Yasas�n Faruk

		C01 obj2 = new C01();
		System.out.println(obj2.str); // Yasas�n eclipse

		// say�2 variable'� statik oldugu icin obleye �HT�YA� DUYULMAZ.

		System.out.println(C01.say�2); // 0 default deger

		C01 obj3 = new C01();

		obj3.say�2 = 27; // CTE vermez
							// Ancak alt�n� sar� cizer ve sat�r numaras�na �nlem koyar
							// C�nk� java daha k�sa ve emin yol var iken neden obje �zerinden ulast�n diye
							// �ikayet eder
		// Bu kodun cal��mas�na engel degildir.CTE vermez.Fakat gereksiz bir islem
		// oldugundan java bizi uyar�r

		System.out.println(obj3.say�2); // 27

		C01.say�2=34; // static variable'lara class ismi variable ismi yazarak ula��labilir
		// buna static way denir.
		
		
		System.out.println(C01.say�2); // 34 Static variable'lar ulasabilen her obje ve her class icin ortakt�r
		                               // Okul ad� gibi
		
		System.out.println(obj2.say�2); // 34
		System.out.println(obj1.say�2); // 34
		
		
		
	}

}
