package day33StringBuilder;

public class C02_StringBuilder02 {

	public static void main(String[] args) {

		/*
		 * Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi
		 * ters �eviren ve c�mlenin palindrom olup olmad���n� kontrol eden (b�y�k/k���k
		 * harf duyarl�l��� olmadan) bir Java program� yaz�n. (without case sensitivity)
		 * Eg : input : I love Java Output: "Reversed sentence : avaJ evol I . It is not
		 * a palindrome"
		 */

		
		String str= "I love Java";
		StringBuilder sB=new StringBuilder();
	    sB.append(str);
	    String terString=sB.reverse().toString();
	    
	    if(str.equalsIgnoreCase(terString)) {
	    
		System.out.println("girdiginiz ifade polindrome dir "+terString);
		
		
	} else {
		
		System.out.println(terString + " . It is not a palindrome");
	}

}

}