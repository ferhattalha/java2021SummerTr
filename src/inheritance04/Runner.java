package inheritance04;

public class Runner {

	public static void main(String[] args) {

		/*
		 * 3 s�n�f olu�turaca��z bu �rne�imizde: Runner ,calisan ve yonetici s�n�flar�.
		 * Cal��an s�n�f�m�z superclass, yonetici s�n�f�m�z da subclass olacak. Runner
		 * s�n�f�m�z� da olu�turdu�umuz kodlar�, konsola yazd�rabilmek i�in
		 * olu�turaca��z
		 * 
		 * �al��an s�n�f�nfa isim ,maas ve departman de�i�kenleri olsun. Parmetresi bu
		 * de�i�kenler olan bir constructor olu�tural�m. Birde bu de�i�kenleri
		 * g�r�nt�leyecek bir BilgileriGoster methodu olu�tural�m.
		 * 
		 * Y�netici s�n�f�nda yine parametresi SuperClasstaki de�i�kenler olan bir
		 * constructor olu�tural�m.Birde parametresi int zam olan br method olu�tural�m.
		 * Bu method bize zam miktar� belirtildi�inde ne kadar zam yap�lmas� gerekti�ini
		 * belirtsin.
		 */
		
		Y�netici y=new Y�netici( "Alican" , 10000 , "IT" );
		y.bilgileriG�ster();
		y.zamMiktar�(500);
	}

}
