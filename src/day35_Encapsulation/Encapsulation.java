package day35_Encapsulation;

public class Encapsulation {

	
	private String okulIsmi="Y�ld�z Kolleji";
	
	private int okulHesapNo=12345;
	
	private boolean okulAc�kM�=true;
	
	
	public String getOkulIsmi() {
		return okulIsmi;
		
	}

	public int getOkulHesapNo() {
		return okulHesapNo;
	}

	public boolean isOkulAc�kM�() {
		return okulAc�kM�;
	}

	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi = okulIsmi;
	}
	
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
		
		
	}

	public void setOkulAc�kM�(boolean okulAc�kM�) {
		this.okulAc�kM� = okulAc�kM�;
	}
	
}
