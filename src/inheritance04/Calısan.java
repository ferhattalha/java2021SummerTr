package inheritance04;

public class Cal�san {

	
 public String isim;
 public int maas;
 public String departman;
 
 
public Cal�san(String isim, int maas, String departman) {
	this.isim = isim;
	this.maas = maas;
	this.departman = departman;
}

 public void bilgileriG�ster() {
	 System.out.println("isim"+isim);
	 System.out.println("maas"+maas);
	 System.out.println("departman"+departman);
 }
 
}
