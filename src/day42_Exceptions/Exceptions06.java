package day42_Exceptions;

public class Exceptions06 {

	public static void main(String[] args) {
		
		String str1=" "; // space
		String str2=""; // hi�lik
		String str3=null; // str3 variable'in hi� bir degere esit olmad�g�n� belirten bir pointer(belirte�-i�aret�i)
		
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
	//	System.out.println(str3.length()); //  Null Pointer Exception  (UNCHECKED: kendimiz ettik kendimiz bulduk hatas�)
		
		System.out.println(str3+" erol tas");  // null erol tas
	//	System.out.println(str3.concat("erol tas")); ==> null olarak atanm�s bir obje ile uygun olmayan bir islem yap�l�rsa 
	// Java NullPointerException unchecked verir.
		
		
		// INTERW�EW SORUSU (Java NullPointerException unchecked HATA!!!!)
		
	}

}
