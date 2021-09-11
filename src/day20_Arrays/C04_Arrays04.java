package day20_Arrays;

import java.util.Arrays;

public class C04_Arrays04 {

	public static void main(String[] args) {
		
		
		// binarySearch() metodu array'de istenen elemanýn
		// varlýgý kontrol edebiliriz.Kullanmadan önce 
		// sort() yapmalýyýz.
		
		
		// Bir string nasýl array'a cevrilir.
		
		String str="Java, candir.";
		
		// split metodu bize bir array döner
		// dönen array'i direk yazdýrmalýyýz
		str.split(", ");
		
		System.out.println(Arrays.toString(str.split(",")));
       
		// veya metod'dan dönen String barýndýran bir array oldugundan
		// bir array olusturup ona assing edebiliriz
		
		String bolunmusKelimeArray[]=str.split(",");
		
		System.out.println(bolunmusKelimeArray[1]); // candýr
		
		String bolunmusKelimeArray2[]=str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2)); // [J, v, , c, ndir.]
		
		String bolunmusKelimeArray3[]=str.split("");
		System.out.println(Arrays.toString(bolunmusKelimeArray3)); // String'i karakterlere ayýrýr
		
		
		String cumle="Java ogren, rahat yasa!"; // cümle kaç kelimeden olusur
		String kelimeArrayi[]=cumle.split(" ");
			System.out.print("Cümledeki kelime sayýsý : " + kelimeArrayi.length);
		
         // harf sayýsý
			
			String cümle2=cumle.replaceAll("\\w", "");
			System.out.print(cümle2);
			System.out.print(cümle2.length()); // 18
			
			String harfArrayi[]=cümle2.split(" ");
			System.out.print(harfArrayi.length); // 18
	}		
			
}
