package abstractClassExample;

public class Cal�san extends Insan {

	
	
	private int cal�sanId;

	public Cal�san(String isim, String soyisim,int cal�sanId) {
		super(isim, soyisim);
		this.cal�sanId = cal�sanId;

	}


	

	@Override
	public void cal�s() {

		if(this.cal�sanId==0) {
			
			System.out.println("bu �ah�s �irket �al�san� degil");
			System.out.println("�ahs�n Id'si " + cal�sanId);
		} else {
			System.out.println("bu �ah�s bizim gundiii :)");
			System.out.println("�ahs�n Id'si " + cal�sanId);
		}
		
	} public static void main(String[] args) {
			
			Cal�san ITManeger=new Cal�san("Merve","Arslan" , 0);
			Cal�san QATester=new Cal�san("�mer","Faruk" , 1453);
			Cal�san Developer=new Cal�san("Oguzhan","Akkafa" , 1905);
			
			ITManeger.bilgilendirme();
			ITManeger.cal�s();
			
			QATester.bilgilendirme();
			QATester.cal�s();
			
			Developer.bilgilendirme();
			Developer.cal�s();
		}
		
		
		
	}


