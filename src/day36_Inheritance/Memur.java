package day36_Inheritance;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		
		Memur m1 =new Memur();
        m1.isim="Cumali";
        m1.soyisim="Korkmaz";
        m1.adres="namekan";
        m1.saatUcreti=20;
        m1.statu="chef";
        m1.tel="12345";
        m1.idAta();
        m1.maasHesapla();
     
        
        System.out.println(m1.isim +"\n"+m1.soyisim+"\n"+m1.adres+"\n"+m1.saatUcreti+"\n"+m1.statu+"\n"+m1.tel);
		
		
		Memur m2 = new Memur();
		
		m2.isim="Ferhat";
        m2.soyisim="Kaymak";
        m2.adres="kurtulmus";
        m2.saatUcreti=50;
        m2.statu="supervisior";
        m2.tel="12345";
        m2.idAta();
        m2.maasHesapla();
		
        System.out.println(m2.isim +"\n"+m2.soyisim+"\n"+m2.adres+"\n"+m2.saatUcreti+"\n"+m2.statu+"\n"+m2.tel);
	}	
}
