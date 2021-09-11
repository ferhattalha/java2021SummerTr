package �dev01;

public class C02_StringM02 {

	public static void main(String[] args) {
		
		// String Manipulations da 18 method bulunmaktad�r...
        // s�ras�yla her birine k�saca de�inmi� olaca��z..
        // str ad�nda bir de�i�kene "Merhaba Arkada�lar"
        // yaz�s�n� atam�� olal�m...
        String str = "Merhaba Arkadaslar";
        // 1. si concatination(); birle�tirme
        String str1 = "Ho�geldiniz";
        // concatination methodu 2 �ekilde yap�l�r.
        // Birincisi toplama i�aretiyle
        // �kincisi ise concat methodu
        System.out.println("1-Concat 1. methodu ; " + str + " " + str1);
        // 1.method--> Merhaba Arkadaslar Ho�geldiniz
        System.out.println(str.concat(str1)); // Merhaba ArkadaslarHo�geldiniz
        System.out.println("1-Concat 2. methodu ; " + str.concat(" ").concat(str1));
        // 2.method--> Merhaba Arkadaslar Ho�geldiniz
        // 2. si charAt(); karakter
        System.out.println("2-Char methodu ile : " + str.charAt(5)); // b
        // 3. s� toUpperCase(); b�y�k harf
        System.out.println("3-toUpperCase methodu ile : " + str.toUpperCase() + " " + str1.toUpperCase());
        // 3-toUpperCase methodu ile : MERHABA ARKADASLAR HO�GELD�N�Z
        // 4. s� toLowerCase(); k���k harf
        System.out.println("4-toLowerCase methodu ile : " + str.toLowerCase() + " " + str1.toLowerCase());
        // 4-toLowerCase methodu ile : merhaba arkadaslar ho�geldiniz
        // 5. si equals(); string e e�it olup olmad���n� true ve false olarak d�nd�r�r.
        System.out.println("5-equals methodu ile : " + str.equals(str1)); // false
        // 6. si equalsIgnoreCase(); b�y�k k���k harf bakmaks�z�n e�itli�i true ve false
        // olarak d�nd�r�r.
        System.out.println("6-equalsIgnorecase methodu ile : " + str.equalsIgnoreCase(str1)); // false
        String str2 = "Ho�GELdiniz";
        System.out.println("6-equalsIgnorecase methodu ile : " + str1.equalsIgnoreCase(str2)); // true
        // 7. si length(); uzunlu�u belirler
        System.out.println("7-length methodu ile : " + str.length()); // 18
        // 8. si indexOf(); 0 dan ba�lar ve bize string in indexini verir
        System.out.println("8-indexof methodu ile : " + str1.indexOf('g')); // 3
        // olmayan bir karakter girersem cevap ne olur ?
        System.out.println("8-indexof methodu ile : " + str1.indexOf('b')); // -1 olur
        // 9. su lastIndexOf(); bize string in son indexini d�ndr�r
        System.out.println("9-lastIndexof methodu ile : " + str1.lastIndexOf('z')); // 10
        // olmayan bir karakter girersem cevap ne olur ?
        System.out.println("9-lastIndexof methodu ile : " + str1.lastIndexOf('t')); // -1
        // belirli bir indexten �ncesi de sorgulanabilir
        System.out.println("9-lastIndexof methodu ile : " + str.lastIndexOf('a', 5)); // 4
        // kelime de sorgulanabilir
        System.out.println("9-lastIndexof methodu ile : " + str.lastIndexOf("Arkadaslar")); // 8
        // 10. su contains(); i�erip i�ermedi�ini true ve false olarak d�nd�r�r.
        System.out.println("10-contains methodu ile : " + str1.contains("d")); // true
        // 11. si endsWith(); istenen karakterler ile bitip bitmedi�ini kontrol eder..
        String str3 = "java09 ile bir kere yaz hep �al��t�r";
        System.out.println("11-endsWith methodu ile : " + str3.endsWith("�al")); // false
        System.out.println("11-endsWith methodu ile : " + str3.endsWith("t�r")); // true
        // 12. si startsWith(); istenen karakterler ile ba�lay�p ba�lamad���n� kontrol
        // eder..
        System.out.println("12-startsWith methodu ile : " + str3.startsWith("ja")); // true
        System.out.println("12-startsWith methodu ile : " + str3.startsWith("a", 3)); // true
        System.out.println("12-startsWith methodu ile : " + str3.startsWith("t", 3)); // false
        // 13. s� isEmpty(); String in uzunlu�u "0" ise true yoksa false d�nd�r�r.
        System.out.println("13-isEmpty methodu ile : " + str3.isEmpty()); // false
        String str4 = "";
        System.out.println("13-isEmpty methodu ile : " + str4.isEmpty()); // true
        // --> null yazarsak hata verir..
        // 14. s� replace(); istenen karakterleri yenileri ile de�i�tirir
        System.out.println("14-replace methodu ile : " + str3.replace("a", "xxxxxx"));
        // jxxxxxxvxxxxxx ile bir kere yxxxxxxz hep �xxxxxxl��t�r
        System.out.println("14-replace methodu ile : " + str3.replace('a', 'x'));
        // jxvx ile bir kere yxz hep �xl��t�r
        // 15. si replaceAll(); replace den tek fark� char kullanamaz
        // ama regular expression kullanabilir.
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("a", "xxxxxx"));
        // jxxxxxxvxxxxxx ile bir kere yxxxxxxz hep �xxxxxxl��t�r
        // System.out.println("15-replaceAll methodu ile : " + str3.replaceAll('a' ,
        // 'x'));
        // hata verir
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\s", "")); // s sadece space
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\s", "*")); // s sadece space
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\S", "*")); // S space olmayan hersey
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\w", "-")); // harf veya rakamlarin hepsi
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\W", "#")); // harf veya rakamlarin
                                                                                            // disindaki hersey
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\d", "*")); // digit(rakamlar)in hepsi
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\D", "a")); // digit(rakamlar)in disindaki
                                                                                            // hersey
        // not ; syso icinde yapilan manipulation'lar asil String'i degistirmez
        // 16. s� replaceFirst(); istenen karakterlerin ilkini yenileriyle de�i�tirir.
        System.out.println("16-replaceFirst methodu ile : " + str3.replaceFirst("a", "***"));
        System.out.println("16-replaceFirst methodu ile : " + str3.replaceFirst("\\s", "*"));
        // 17.si substring(); index kullanarak String deki istedi�imiz par�ay� almaya
        // yard�mc� olur.
        System.out.println("17-substring methodu ile : " + str3.substring(0, 7));
        // o dahil al�r 7 yi dahil etmeden karakter bo�luk ne varsa keser al�r
        System.out.println("17-substring methodu ile : " + str3.substring(6, str3.length()));
        // 18. si trim(); �stedi�imiz String�in ba��nda veya sonunda var olan
        // bo�luk/�space� leri temizler.
        String str5 = "    ahhh java ahhh     ";
        System.out.println("18-trim methodu ile : " + str5.trim()); // true
    

	}

}
