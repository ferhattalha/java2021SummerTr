package abstractClassExample;

public class Calýsan extends Insan {

	
	
	private int calýsanId;

	public Calýsan(String isim, String soyisim,int calýsanId) {
		super(isim, soyisim);
		this.calýsanId = calýsanId;

	}


	

	@Override
	public void calýs() {

		if(this.calýsanId==0) {
			
			System.out.println("bu þahýs þirket çalýsaný degil");
			System.out.println("þahsýn Id'si " + calýsanId);
		} else {
			System.out.println("bu þahýs bizim gundiii :)");
			System.out.println("þahsýn Id'si " + calýsanId);
		}
		
	} public static void main(String[] args) {
			
			Calýsan ITManeger=new Calýsan("Merve","Arslan" , 0);
			Calýsan QATester=new Calýsan("Ömer","Faruk" , 1453);
			Calýsan Developer=new Calýsan("Oguzhan","Akkafa" , 1905);
			
			ITManeger.bilgilendirme();
			ITManeger.calýs();
			
			QATester.bilgilendirme();
			QATester.calýs();
			
			Developer.bilgilendirme();
			Developer.calýs();
		}
		
		
		
	}


