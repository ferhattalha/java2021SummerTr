package day33StringBuilder;

public class C02_AcMo {

	public static void main(String[] args) {
		
		/*
        Eri�im alanlar� :
  1- Class �n i�i
  2- Paketin i�i
  3- Projenin i�i (yani di�er paketler)
  Public : Projenin her taraf�ndan eri�ilebilir, yani di�er paketlerden bile. (Class, field, properties, metodlarda, constructor)
  default: Yani hi� bir �ey yaz�lmazsa, yani di�er ad� friendly : sadece paketin i�indekiler eri�ebilir. (Class, field,properties metodlarda, constructor)
  private: Sadece i�inde bulundu�u s�n�f tan eri�ilebilir.(field,properties, metodlarda)
       1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
           Baska class'lardan "private" class memler'lari (field,properties, metodlarda, constructor)kullanmak mumkun degildir.
           
           2) Baska package'lerden object olusturursaniz object olusturulan class'i import etmeniz gerekir.
           
           3) Baska package'lerden default class memberlara ulasamazsiniz. Ayni package'de iseniz
           ulasabilirsiniz. "default" ile "package private" es anlamlidir.
           
           4) public class member'lara herkes her yerden ulasabilir(farkli java projesi disinda).
           
            5) "protected" class member'lara ayni package icindeyseniz ulasabilirsiniz. Farkli package'de
            iseniz iki durum var : a)Child class iseniz ulasabilirsiniz.   b)Child class degil iseniz ulasamazsiniz.
            
            6) Class'larda da access modifier kullanilir. Ama sadece "public" ve "default" kullanilir.
            Class olustururken "private" veya "protected" access modifier kullanilmaz.
    
    */	
		
    C01_AcMo obj1=new C01_AcMo(); // obj1 creat ettik
    
    System.out.println(obj1.defaultAge); // 15
    System.out.println(obj1.protectedAge);// 32
    System.out.println(obj1.publicAge); // 61
    
    C03_AcMo name= new C03_AcMo();
    System.out.println(name.protectedName);
    System.out.println(name.defaultName);
    System.out.println(name.publicName);
    
    
    
	}

}
