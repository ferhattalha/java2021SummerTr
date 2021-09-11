package day36_Inheritance;

public class Isci extends Muhasebe  {

	public static void main(String[] args) {
		
		Isci i1 =new Isci();
        i1.isim="Hayali";
        i1.soyisim="Korkmaz";
        i1.adres="fiþmekan";
        i1.saatUcreti=30;
        i1.statu="ýrgat";
        i1.tel="12345";
        i1.idAta();
        i1.maasHesapla();

        System.out.println(i1.isim +"\n"+i1.soyisim+"\n"+i1.adres+"\n"+i1.saatUcreti+"\n"+i1.statu+"\n"+i1.tel);
        
        Isci i2 =new Isci();
        i2.isim="mehmet";
        i2.soyisim="Korkut";
        i2.adres="lamekan";
        i2.saatUcreti=40;
        i2.statu="4-b";
        i2.tel="12345";
        i2.idAta();
        i2.maasHesapla();

        System.out.println(i2.isim +"\n"+i2.soyisim+"\n"+i2.adres+"\n"+i2.saatUcreti+"\n"+i2.statu+"\n"+i2.tel);
        
	}

	
		
	}


