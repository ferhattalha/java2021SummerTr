package inheritance04;

public class Calısan {

	
 public String isim;
 public int maas;
 public String departman;
 
 
public Calısan(String isim, int maas, String departman) {
	this.isim = isim;
	this.maas = maas;
	this.departman = departman;
}

 public void bilgileriGöster() {
	 System.out.println("isim"+isim);
	 System.out.println("maas"+maas);
	 System.out.println("departman"+departman);
 }
 
}
