package day42_Exceptions;

public class Exceptions06 {

	public static void main(String[] args) {
		
		String str1=" "; // space
		String str2=""; // hiçlik
		String str3=null; // str3 variable'in hiç bir degere esit olmadýgýný belirten bir pointer(belirteç-iþaretçi)
		
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
	//	System.out.println(str3.length()); //  Null Pointer Exception  (UNCHECKED: kendimiz ettik kendimiz bulduk hatasý)
		
		System.out.println(str3+" erol tas");  // null erol tas
	//	System.out.println(str3.concat("erol tas")); ==> null olarak atanmýs bir obje ile uygun olmayan bir islem yapýlýrsa 
	// Java NullPointerException unchecked verir.
		
		
		// INTERWÝEW SORUSU (Java NullPointerException unchecked HATA!!!!)
		
	}

}
