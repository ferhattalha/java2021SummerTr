package day36_Inheritance;

public class Muhasebe extends Personel {


public int saatUcreti;

public String statu;

public int maas;

public int maasHesapla() {
	
	int maas= saatUcreti+8*30;
	
	return maas;
}
	
}
