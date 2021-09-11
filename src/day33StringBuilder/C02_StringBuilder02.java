package day33StringBuilder;

public class C02_StringBuilder02 {

	public static void main(String[] args) {

		/*
		 * Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi
		 * ters çeviren ve cümlenin palindrom olup olmadýðýný kontrol eden (büyük/küçük
		 * harf duyarlýlýðý olmadan) bir Java programý yazýn. (without case sensitivity)
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