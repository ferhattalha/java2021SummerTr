package day35_Encapsulation;

public class Encapsulation {

	
	private String okulIsmi="Yýldýz Kolleji";
	
	private int okulHesapNo=12345;
	
	private boolean okulAcýkMý=true;
	
	
	public String getOkulIsmi() {
		return okulIsmi;
		
	}

	public int getOkulHesapNo() {
		return okulHesapNo;
	}

	public boolean isOkulAcýkMý() {
		return okulAcýkMý;
	}

	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi = okulIsmi;
	}
	
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
		
		
	}

	public void setOkulAcýkMý(boolean okulAcýkMý) {
		this.okulAcýkMý = okulAcýkMý;
	}
	
}
