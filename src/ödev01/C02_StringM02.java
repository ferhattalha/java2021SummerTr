package ödev01;

public class C02_StringM02 {

	public static void main(String[] args) {
		
		// String Manipulations da 18 method bulunmaktadýr...
        // sýrasýyla her birine kýsaca deðinmiþ olacaðýz..
        // str adýnda bir deðiþkene "Merhaba Arkadaþlar"
        // yazýsýný atamýþ olalým...
        String str = "Merhaba Arkadaslar";
        // 1. si concatination(); birleþtirme
        String str1 = "Hoþgeldiniz";
        // concatination methodu 2 þekilde yapýlýr.
        // Birincisi toplama iþaretiyle
        // Ýkincisi ise concat methodu
        System.out.println("1-Concat 1. methodu ; " + str + " " + str1);
        // 1.method--> Merhaba Arkadaslar Hoþgeldiniz
        System.out.println(str.concat(str1)); // Merhaba ArkadaslarHoþgeldiniz
        System.out.println("1-Concat 2. methodu ; " + str.concat(" ").concat(str1));
        // 2.method--> Merhaba Arkadaslar Hoþgeldiniz
        // 2. si charAt(); karakter
        System.out.println("2-Char methodu ile : " + str.charAt(5)); // b
        // 3. sü toUpperCase(); büyük harf
        System.out.println("3-toUpperCase methodu ile : " + str.toUpperCase() + " " + str1.toUpperCase());
        // 3-toUpperCase methodu ile : MERHABA ARKADASLAR HOÞGELDÝNÝZ
        // 4. sü toLowerCase(); küçük harf
        System.out.println("4-toLowerCase methodu ile : " + str.toLowerCase() + " " + str1.toLowerCase());
        // 4-toLowerCase methodu ile : merhaba arkadaslar hoþgeldiniz
        // 5. si equals(); string e eþit olup olmadýðýný true ve false olarak döndürür.
        System.out.println("5-equals methodu ile : " + str.equals(str1)); // false
        // 6. si equalsIgnoreCase(); büyük küçük harf bakmaksýzýn eþitliði true ve false
        // olarak döndürür.
        System.out.println("6-equalsIgnorecase methodu ile : " + str.equalsIgnoreCase(str1)); // false
        String str2 = "HoþGELdiniz";
        System.out.println("6-equalsIgnorecase methodu ile : " + str1.equalsIgnoreCase(str2)); // true
        // 7. si length(); uzunluðu belirler
        System.out.println("7-length methodu ile : " + str.length()); // 18
        // 8. si indexOf(); 0 dan baþlar ve bize string in indexini verir
        System.out.println("8-indexof methodu ile : " + str1.indexOf('g')); // 3
        // olmayan bir karakter girersem cevap ne olur ?
        System.out.println("8-indexof methodu ile : " + str1.indexOf('b')); // -1 olur
        // 9. su lastIndexOf(); bize string in son indexini döndrür
        System.out.println("9-lastIndexof methodu ile : " + str1.lastIndexOf('z')); // 10
        // olmayan bir karakter girersem cevap ne olur ?
        System.out.println("9-lastIndexof methodu ile : " + str1.lastIndexOf('t')); // -1
        // belirli bir indexten öncesi de sorgulanabilir
        System.out.println("9-lastIndexof methodu ile : " + str.lastIndexOf('a', 5)); // 4
        // kelime de sorgulanabilir
        System.out.println("9-lastIndexof methodu ile : " + str.lastIndexOf("Arkadaslar")); // 8
        // 10. su contains(); içerip içermediðini true ve false olarak döndürür.
        System.out.println("10-contains methodu ile : " + str1.contains("d")); // true
        // 11. si endsWith(); istenen karakterler ile bitip bitmediðini kontrol eder..
        String str3 = "java09 ile bir kere yaz hep çalýþtýr";
        System.out.println("11-endsWith methodu ile : " + str3.endsWith("çal")); // false
        System.out.println("11-endsWith methodu ile : " + str3.endsWith("týr")); // true
        // 12. si startsWith(); istenen karakterler ile baþlayýp baþlamadýðýný kontrol
        // eder..
        System.out.println("12-startsWith methodu ile : " + str3.startsWith("ja")); // true
        System.out.println("12-startsWith methodu ile : " + str3.startsWith("a", 3)); // true
        System.out.println("12-startsWith methodu ile : " + str3.startsWith("t", 3)); // false
        // 13. sü isEmpty(); String in uzunluðu "0" ise true yoksa false döndürür.
        System.out.println("13-isEmpty methodu ile : " + str3.isEmpty()); // false
        String str4 = "";
        System.out.println("13-isEmpty methodu ile : " + str4.isEmpty()); // true
        // --> null yazarsak hata verir..
        // 14. sü replace(); istenen karakterleri yenileri ile deðiþtirir
        System.out.println("14-replace methodu ile : " + str3.replace("a", "xxxxxx"));
        // jxxxxxxvxxxxxx ile bir kere yxxxxxxz hep çxxxxxxlýþtýr
        System.out.println("14-replace methodu ile : " + str3.replace('a', 'x'));
        // jxvx ile bir kere yxz hep çxlýþtýr
        // 15. si replaceAll(); replace den tek farký char kullanamaz
        // ama regular expression kullanabilir.
        System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("a", "xxxxxx"));
        // jxxxxxxvxxxxxx ile bir kere yxxxxxxz hep çxxxxxxlýþtýr
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
        // 16. sý replaceFirst(); istenen karakterlerin ilkini yenileriyle deðiþtirir.
        System.out.println("16-replaceFirst methodu ile : " + str3.replaceFirst("a", "***"));
        System.out.println("16-replaceFirst methodu ile : " + str3.replaceFirst("\\s", "*"));
        // 17.si substring(); index kullanarak String deki istediðimiz parçayý almaya
        // yardýmcý olur.
        System.out.println("17-substring methodu ile : " + str3.substring(0, 7));
        // o dahil alýr 7 yi dahil etmeden karakter boþluk ne varsa keser alýr
        System.out.println("17-substring methodu ile : " + str3.substring(6, str3.length()));
        // 18. si trim(); Ýstediðimiz String’in baþýnda veya sonunda var olan
        // boþluk/“space” leri temizler.
        String str5 = "    ahhh java ahhh     ";
        System.out.println("18-trim methodu ile : " + str5.trim()); // true
    

	}

}
