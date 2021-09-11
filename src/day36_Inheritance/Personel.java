package day36_Inheritance;

public class Personel {

public static int sayac=1000;
	
public int id;

public String isim;

public String soyisim;

public String adres;

public String tel;


public int idAta() {
	
	this.id=sayac++;
	
	return id;
}

public Personel() {
	super();

}
public Personel(int id, String isim, String soyisim, String adres, String tel) {
	super();
	this.id = id;
	this.isim = isim;
	this.soyisim = soyisim;
	this.adres = adres;
	this.tel = tel;

}
}