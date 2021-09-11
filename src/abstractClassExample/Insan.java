package abstractClassExample;

public abstract class Insan {

	private String isim;
	private String soyisim;

	
	
	public abstract void calýs();

	

	public Insan(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}
	
	public void bilgilendirme() {
		System.out.println("isim"+this.isim+"soyisim"+this.soyisim);
	}
	
	public void isimDegistir(String isim,String soyisim) {
		this.isim=isim;
		this.soyisim=soyisim;
}

}