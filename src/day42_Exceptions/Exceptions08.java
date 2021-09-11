package day42_Exceptions;

public class Exceptions08 {

	public static void main(String[] args) {
		
		
	 int sayý=34;
	 
	 String str="1453";
   // String str1=sayý;   CTE---> Checkked excetion ClassCast

	 int okulNo=Integer.parseInt(str);
	 
	 System.out.println("okul no"+okulNo);
	 
	 System.out.println(str+35); // 145335 (Concat olur)
	 
	 System.out.println(okulNo+35); //1488
	 
	 String str1="14a3";
	// int strSayi=Integer.parseInt(str1); // NumberFormatException unchecked (Run edildiginde ortaya çýkar)
	 
	 
	 // UNchecked--->(r) Unchecked
	 
	 Object sayý3=45;
	
	 String strSayi2=(String)sayý3; // data Type Class casting büyük veri küçük konteynýra atandý
	                                // Data türlerini casting yaparken uygun olmayan iþlem
	                                // ClassCastException unchecked verir.
	 
	//  INTERWÝEW SORUSU
	 
	}                               

}
