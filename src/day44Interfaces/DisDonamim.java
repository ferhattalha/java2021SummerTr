package day44Interfaces;

public interface DisDonamim {


	public void ayna();
	public void kapi();
	public void kaporta();
	
	String RENK="metalik";
	
	public default String sisLambasý() {  // bu method bildigin body'li concrate'dir.
		return "sisli hava dikkat";
	}
		public static String boya() {
		return "koyu renk boya güneþ yanýðý yapar ";
	}
	
	}


