package day42_Exceptions;

public class Exceptions08 {

	public static void main(String[] args) {
		
		
	 int say�=34;
	 
	 String str="1453";
   // String str1=say�;   CTE---> Checkked excetion ClassCast

	 int okulNo=Integer.parseInt(str);
	 
	 System.out.println("okul no"+okulNo);
	 
	 System.out.println(str+35); // 145335 (Concat olur)
	 
	 System.out.println(okulNo+35); //1488
	 
	 String str1="14a3";
	// int strSayi=Integer.parseInt(str1); // NumberFormatException unchecked (Run edildiginde ortaya ��kar)
	 
	 
	 // UNchecked--->(r) Unchecked
	 
	 Object say�3=45;
	
	 String strSayi2=(String)say�3; // data Type Class casting b�y�k veri k���k konteyn�ra atand�
	                                // Data t�rlerini casting yaparken uygun olmayan i�lem
	                                // ClassCastException unchecked verir.
	 
	//  INTERW�EW SORUSU
	 
	}                               

}
