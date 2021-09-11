package day20_Arrays;

import java.util.Arrays;

public class C04_Arrays04 {

	public static void main(String[] args) {
		
		
		// binarySearch() metodu array'de istenen eleman�n
		// varl�g� kontrol edebiliriz.Kullanmadan �nce 
		// sort() yapmal�y�z.
		
		
		// Bir string nas�l array'a cevrilir.
		
		String str="Java, candir.";
		
		// split metodu bize bir array d�ner
		// d�nen array'i direk yazd�rmal�y�z
		str.split(", ");
		
		System.out.println(Arrays.toString(str.split(",")));
       
		// veya metod'dan d�nen String bar�nd�ran bir array oldugundan
		// bir array olusturup ona assing edebiliriz
		
		String bolunmusKelimeArray[]=str.split(",");
		
		System.out.println(bolunmusKelimeArray[1]); // cand�r
		
		String bolunmusKelimeArray2[]=str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2)); // [J, v, , c, ndir.]
		
		String bolunmusKelimeArray3[]=str.split("");
		System.out.println(Arrays.toString(bolunmusKelimeArray3)); // String'i karakterlere ay�r�r
		
		
		String cumle="Java ogren, rahat yasa!"; // c�mle ka� kelimeden olusur
		String kelimeArrayi[]=cumle.split(" ");
			System.out.print("C�mledeki kelime say�s� : " + kelimeArrayi.length);
		
         // harf say�s�
			
			String c�mle2=cumle.replaceAll("\\w", "");
			System.out.print(c�mle2);
			System.out.print(c�mle2.length()); // 18
			
			String harfArrayi[]=c�mle2.split(" ");
			System.out.print(harfArrayi.length); // 18
	}		
			
}
