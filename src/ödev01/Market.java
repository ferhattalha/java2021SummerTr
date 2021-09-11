package ödev01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
	
	 static List<String> urunler = new ArrayList<>();
	    static List<Double> fiyatlar = new ArrayList<>();
	    static List<String> sepetUrunler = new ArrayList<>();
	    static List<Double> sepettekiUrunFiyati = new ArrayList<>();
	    static List<Double> sepetUrunKg = new ArrayList<>();
	    static double toplamFiyat;
	    static Scanner scan = new Scanner(System.in);
	    public static void main(String[] args) {
	        do {
	            urunListele();
	        } while (devamKe() == "evet");
	         
	    }
	    public static void urunListele() {
	        System.out.println("            *****qa-team1***** MARKETE'a HOS GELDINIZ...");
	        System.out.println();
	        
	        //urunler listinin uzunlugunu hepsi ayni olsun diye bosluklar ile biz ayarladik ki listede kayma olmasin...
	        urunler = Arrays.asList(" Domates", " Patates", " Biber  ", " Soðan  ", " Havuç  ", " Elma   ", " Muz    ",
	                " Çilek  ", " Kavun  ", " Üzüm   ", "Limon  ");
	        fiyatlar = Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50);
	        System.out.println("Urunkodu    UrunIsmi      UrunFiyati(tl)");
	        System.out.println();
	        
	        for (int urunNo = 0; urunNo < urunler.size(); urunNo++) {
	            System.out.print(urunNo + "          ");
	            for (int i = urunNo; i < urunNo + 1; i++) {
	                System.out.print(urunler.get(i));
	            }
	            for (int j = urunNo; j < urunNo + 1; j++) {
	                System.out.println("            " + fiyatlar.get(j));
	            }
	        }
	        System.out.print("\n" + "almak istediginiz urunun kodunu giriniz : ");
	        int kod = scan.nextInt();
	        System.out.print("kac kg almak istediginizi giriniz : ");
	        double kg = scan.nextDouble();
	        sepetimdekiler(kod, kg);
	    }
	    public static void sepetimdekiler(int kod, double kg) {
	        sepetUrunler.add(urunler.get(kod));
	        sepettekiUrunFiyati.add(fiyatlar.get(kod));
	        sepetUrunKg.add(kg);
	        double sepetFiyati = kg * fiyatlar.get(kod);
	        toplamFiyat += sepetFiyati;
	        sepetYazdir(kod, kg);
	    }
	    public static void sepetYazdir(int kod, double kg) {
	        System.out.println("\n" + "Listeniz   UrunIsmi   UrunFiyati(tl)   Alinankg");
	        for (int i = 0; i < sepetUrunler.size(); i++) {
	            System.out.print(i + 1 + "          ");
	            for (int j = i; j < i + 1; j++) {
	                System.out.print(sepetUrunler.get(j) + "          ");
	            }
	            for (int a = i; a < i + 1; a++) {
	                System.out.print(sepettekiUrunFiyati.get(a) + "        ");
	            }
	            for (int b = i; b < i + 1; b++) {
	                System.out.println(sepetUrunKg.get(b) + "       ");
	            }
	        }
	        System.out.println("sepet fiyatiniz :" + toplamFiyat + "\n" + "\nAlisverise devam etmek ister misiniz? "
	                + " \nIsterseniz (evet) yaziniz \nDevam etmek istemiyorsaniz (hayir) yaziniz");
	        devamKe();
	    }
	    private static String devamKe() {
	        String karar = scan.next();
	        if (karar.equalsIgnoreCase("evet")) {
	            urunListele();
	        } else {
	            odeme(toplamFiyat);
	        }
	        return karar;
	    }
	    public static void odeme(double toplamFiyat) {
	        System.out.println("Beyfendi/Hanimefendi toplam futuraniz : " + toplamFiyat + " tl");
	        double odeme = 0;
	        do {
	            System.out.print("Lutfen odeyeceginiz miktari giriniz(tl) : ");
	            double musteriOdeme = scan.nextDouble();
	            odeme += musteriOdeme;
	            if (toplamFiyat > odeme) {
	                System.out.println("\n" + "Sayin musteri eksik odeme yaptiniz : " + (toplamFiyat - musteriOdeme)
	                        + "tl kadar daha odeme yapmalisiniz");
	            }
	        } while (odeme < toplamFiyat);
	        {
	        }
	        if (odeme > toplamFiyat) {
	            System.out.println("\n" + "Sayin musteri paranizin ustu : " + (odeme - toplamFiyat + " tl")
	                    + "\nBizi tercih ettiginiz icin tesekkur ederiz \nYine bekleriz");
	        } else {
	            System.out.println("\n" + "Sayin musteri bizi tercih ettiginiz icin tesekkur ederiz \nYine bekleriz");
	        }
	        
	        
	    }
	}


