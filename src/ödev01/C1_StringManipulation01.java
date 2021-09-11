package �dev01;

import java.util.Scanner;

public class C1_StringManipulation01 {

	public static void main(String[] args) {
		
		/*
         * Kisisel Bilgi Sistemi
         * 
         * 1---> isiminiz giriniz ismi duzenleyip ilk harf buyuk olacak ve 
         * digerleri * olacak sekilde yazdiriniz... 
         * Girilen ismin palindrome olup olmadigini kontrol ediniz...
         * 
         * 2---> Soyisminizi giriniz... Soyismi duzenleyip ilk harf buyuk olacak ve
         * digerleri * olacak sekilde yazdiriniz...
         * 
         * 3---> Emailinizi @ kismina kadar giriniz 4 secenek olusturup �unlar� sorunuz..
         * A�a��daki e-posta adreslerinden uygun olan� se�iniz
         * 1-@gmail.com
         * 2-@hotmail.com
         * 3-@yahoo.com
         * 4-@yandex.com
         * 
         * Email ile e posta adresini concat yapiniz..
         * 
         * 4---> Sifre giriniz...
         * L�tfen a�a��daki kriterlere uygun bir �ifre se�iniz
         * 1-ilk harfi b�y�k olmal�
         * 2-son harfi k���k olmal�
         * 3-bo�luk olmamal�
         * 4-8 karakterden az olmamal�
         * 
         * 5---> Kredi Karti numarinizi giriniz.. 
         * Bosluk birakmadan 16 hane olarak yazdirmasini isteyiniz
         * Console da ; **** **** **** 1234 Seklinde yazdiriniz..
         * 
         * 6---> Kisa bir aciklama giriniz.. 
         * isEmpty(), endsWith(), startsWith(), toLowerCase() 
         * methodlarini kullanarak yazdiriniz.. 
         * Girilen Aciklamayi tersten yazidiriniz..
         * 
         */
        Scanner scan = new Scanner(System.in);
        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("*********K���SEL B�LG� S�TEM�*********");
            System.out.println("1-�sminizi Giriniz\n2-Soyad�n�z� Girinz\n3-Email Adresiniz Giriniz"
                    + "\n4-�ifrenizi Giriniz\n5-Kredi kart� Numar�n�z� Giriniz\n6-K�sa Bir Not B�rak�n�z\n7-��k��");
            System.out.print("L�tfen Bir Se�im yap�n�z : ");
            String secim = scan.nextLine();
            switch (secim) {
            case "1":
                System.out.println("L�tfen isminizi Giriniz : ");
                String isim = scan.nextLine();
                String duzenliIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
                System.out.println(duzenliIsim);
                String terstenIsim = "";
                for (int i = 0; i < isim.length(); i++) {
                    terstenIsim += isim.substring(isim.length() - 1 - i, isim.length() - i);
                }
                if (isim.equals(terstenIsim)) {
                    System.out.println("Girilen isim palindrome dur");
                } else {
                    System.out.println("Girilen isim palindrome de�ildir");
            }
                break;
            case "2":
                System.out.println("L�tfen isminizi Giriniz : ");
                String soyisim = scan.nextLine();
                String duzenliSoyIsim = soyisim.substring(0, 1).toUpperCase()
                        + soyisim.substring(1).replaceAll("\\w", "*");
                System.out.println(duzenliSoyIsim);
                break;
            case "3":
                System.out.println("L�tfen Emailinizi @ k�sm�na kadar giriniz :");
                String email = scan.nextLine();
                System.out.println("\nA�a��daki e-posta adreslerinden uygun olan� se�iniz\n"
                        + "1-@gmail.com\n2-@hotmail.com\n3-@yahoo.com" + "\n4-@yandex.com");
                String ePosta = scan.nextLine();
                if (ePosta.equals("1")) {
                    System.out.println("@gmail.com");
                    System.out.println(email.concat("@gmail.com"));
                } else if (ePosta.equals("2")) {
                    System.out.println("@hotmail.com");
                    System.out.println(email.concat("@hotmail.com"));
                } else if (ePosta.equals("3")) {
                    System.out.println("@yahoo.com");
                    System.out.println(email.concat("@yahoo.com"));
                } else if (ePosta.equals("4")) {
                    System.out.println("@yandex.com");
                    System.out.println(email.concat("@yandex.com"));
                } else {
                    System.out.println("Hatal� i�lem yapt�n�z");
                }
                break;
            case "4":
                System.out.println("\nL�tfen a�a��daki kriterlere uygun bir �ifre se�iniz\n"
                        + "1-ilk harfi b�y�k olmal�\n2-son harfi k���k olmal�\n3-bo�luk olmamal�" + "\n4-8 karakterden az olmamal�");
                String sifre=scan.nextLine();
                
                boolean ilkHarfKontrol=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
                boolean sonHarfKontrol=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
                boolean spaceKontrol=!sifre.contains(" ");
                boolean uzunlukKontrol=sifre.length()>=8;
                
                if (ilkHarfKontrol && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
                    System.out.println("�ifre ba�ar� ile tamamland�");
                }else {
                    System.out.println("��lem ba�ar�s�z.. L�tfen kriterlere uygun bir �ifre giriniz...");
                }           
                break;
            case "5":
                System.out.println("L�tfen Kredi kart� numaran�z� bo�luk b�rakmadan 16 hane olarak giriniz");
                String kkNo=scan.nextLine();
                String duzenliKart= "**** **** **** " + kkNo.substring(12);
                System.out.println(duzenliKart);
                break;
            case "6":
                System.out.println("L�tfen k�sa bir a��klama giriniz");
                String ac�klama=scan.nextLine();
                System.out.println(ac�klama.isEmpty());
                System.out.println(ac�klama.endsWith("."));
                System.out.println(ac�klama.toLowerCase().startsWith("d"));
                
                // tersten yazd�rmak istersek
                for (int i = ac�klama.length()-1; i>=0; i--) {
                    System.out.print(ac�klama.substring(i,i+1));
                }
                System.out.println("");
                break;
            case "7":
                System.out.println("��k�� yap�l�yor...��leminiz Ba�ar�yla ger�ekle�trildi!!!");
                cikilsinMi = true;
                break;
            default:
                System.out.println("Uygun bir se�im yapmadn�z. Tekrar giri� yap�n�z...");
                break;
            
}
}
        scan.close();
}
}