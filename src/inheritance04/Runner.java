package inheritance04;

public class Runner {

	public static void main(String[] args) {

		/*
		 * 3 sýnýf oluþturacaðýz bu örneðimizde: Runner ,calisan ve yonetici sýnýflarý.
		 * Calýþan sýnýfýmýz superclass, yonetici sýnýfýmýz da subclass olacak. Runner
		 * sýnýfýmýzý da oluþturduðumuz kodlarý, konsola yazdýrabilmek için
		 * oluþturacaðýz
		 * 
		 * Çalýþan sýnýfýnfa isim ,maas ve departman deðiþkenleri olsun. Parmetresi bu
		 * deðiþkenler olan bir constructor oluþturalým. Birde bu deðiþkenleri
		 * görüntüleyecek bir BilgileriGoster methodu oluþturalým.
		 * 
		 * Yönetici sýnýfýnda yine parametresi SuperClasstaki deðiþkenler olan bir
		 * constructor oluþturalým.Birde parametresi int zam olan br method oluþturalým.
		 * Bu method bize zam miktarý belirtildiðinde ne kadar zam yapýlmasý gerektiðini
		 * belirtsin.
		 */
		
		Yönetici y=new Yönetici( "Alican" , 10000 , "IT" );
		y.bilgileriGöster();
		y.zamMiktarý(500);
	}

}
