package day35_Encapsulation;

public class Encapsulation {

	
	private String okulIsmi="Yıldız Kolleji";
	
	private int okulHesapNo=12345;
	
	private boolean okulAcıkMı=true;
	
	
	public String getOkulIsmi() {
		return okulIsmi;
		
	}

	public int getOkulHesapNo() {
		return okulHesapNo;
	}

	public boolean isOkulAcıkMı() {
		return okulAcıkMı;
	}

	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi = okulIsmi;
	}
	
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
		
		
	}

	public void setOkulAcıkMı(boolean okulAcıkMı) {
		this.okulAcıkMı = okulAcıkMı;
	}
	
}
