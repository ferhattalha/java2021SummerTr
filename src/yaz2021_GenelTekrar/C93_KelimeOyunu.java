package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C93_KelimeOyunu {

	public static void main(String[] args) {
		
		/*
         * Iki kisinin oynayacagi bir kelime oyunu uretelim Kurallar 1.Ad�m- Baslangicta
         * 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2.Ad�m- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini
         * sorun. * 2. oyuncu Eger kelimeyi kabul ederse 1.oyuncuya kelimedeki harf
         * sayisi kadar puan ekleyin ve 3.adima gecin * girilen kelimeyi kabul etmezse
         * "gecersiz kelime" yazdirin ve hangi oyuncunun kazandigini yazip oyunu
         * bitirin.
         *
         * 3.Ad�m- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun * devam
         * etmek isterse kelimeye eklemek istedigi string'i ve basa mi sona mi
         * ekleyecegini sorun aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         * * Devam etmek istemezse "Oyun bitti" yazin kullanicilarin puanlarini ve
         * kazanan oyuncuyu yazdirin
         */
        System.out.println("***** KEL�ME OYUNUNA HO�GELD�N�Z *****");
        Scanner scan = new Scanner(System.in);
        int birinciOyuncuPuan = 0;
        int ikinciOyuncuPuan = 0;
        String kelimeToplam = "";
        String kelime = "";
        int elSay�s� = 1;
        char basSon = ' ';
        char bas�na = 'B';
        char sonuna = 'S';
        char oyunaDevam = 'E';
        char kelimeKabul = 'E';
        int ilkEkBirinciOyuncuPuan = 0;
        do {
            if (elSay�s� == 1) {
                System.out.println("\nL�tfen Oyuna Ba�lamak �stedi�iniz Kelimeyi Giriniz: ");
                kelimeToplam += scan.next().trim();
                System.out.println("Girilen kelime: " + kelimeToplam);
                ilkEkBirinciOyuncuPuan = kelimeToplam.length();
            } else {
                System.out.println(
                        "L�tfen eklemek istedi�iniz kelimeyi mevcut kelimenin ba��na m� yoksa sonuna m� ekleyece�inizi belirtin: 'BA�INA' ya da 'SONUNA' ");
                basSon = scan.next().toUpperCase().charAt(0);
                if (basSon == 'B') {
                    System.out.println("L�tfen kelimenin ba��na eklemek istedi�iniz kelimeyi giriniz: ");
                    kelime = scan.next().trim();
                    kelimeToplam = kelime + kelimeToplam;
                    System.out.println("Mevcut kelime: " + kelimeToplam);
                } else if (basSon == 'S') {
                    System.out.println("L�tfen kelimenin sonuna eklemek istedi�iniz kelimeyi giriniz: ");
                    kelime = scan.next().trim();
                    kelimeToplam += kelime;
                    System.out.println("Mevcut kelime: " + kelimeToplam);
                }
            }
            System.out.println("1. Oyuncu'nun girdi�i kelimeyi kabul ediyor musunuz? 'EVET' ya da 'HAYIR' ");
            kelimeKabul = scan.next().toUpperCase().charAt(0);
            if (kelimeKabul == 'E') {
                birinciOyuncuPuan += kelime.length();
                System.out.println("Oyuna devam etmek istiyor musunuz? 'EVET' ya da 'HAYIR'");
                oyunaDevam = scan.next().toUpperCase().charAt(0);
                if (oyunaDevam == 'E') {
                    elSay�s� += 2;
                    System.out.println(
                            "L�tfen eklemek istedi�iniz kelimeyi mevcut kelimenin ba��na m� yoksa sonuna m� ekleyece�inizi belirtin: 'BA�INA' ya da 'SONUNA' ");
                    basSon = scan.next().toUpperCase().charAt(0);
                    if (basSon == 'B') {
                        System.out.println("L�tfen kelimenin ba��na eklemek istedi�iniz kelimeyi giriniz: ");
                        kelime = scan.next().trim();
                        kelimeToplam = kelime + kelimeToplam;
                        System.out.println("Mevcut kelime: " + kelimeToplam);
                    } else if (basSon == 'S') {
                        System.out.println("L�tfen kelimenin sonuna eklemek istedi�iniz kelimeyi giriniz: ");
                        kelime = scan.next().trim();
                        kelimeToplam += kelime;
                        System.out.println("Mevcut kelime: " + kelimeToplam);
                    }
                } else {
                    birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;
                    elSay�s�--;
                    if (birinciOyuncuPuan > ikinciOyuncuPuan) {
                        System.out.println("Oyunu kazanan 1. oyuncu: \n1. oyuncu puan: " + birinciOyuncuPuan
                                + "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBR�KLER 1. OYUNCU***");
                    } else if (birinciOyuncuPuan < ikinciOyuncuPuan) {
                        System.out.println("Oyunu kazanan 2. oyuncu: \n2. oyuncu puan: " + ikinciOyuncuPuan
                                + "\n1. oyuncu puan: " + birinciOyuncuPuan + "\n***TEBR�KLER 2. OYUNCU***");
                    } else {
                        System.out.println("Dostluk kazand�.");
                    }
                }
            } else {
                birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;
                elSay�s�--;
                System.out.println("Ge�ersiz kelime!");
                if (birinciOyuncuPuan > ikinciOyuncuPuan) {
                    System.out.println("Kazanan 1. Oyuncu! \n1. Oyuncu puan: " + birinciOyuncuPuan
                            + "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBR�KLER 1. OYUNCU***");
                } else {
                    System.out.println("Kazanan 2. Oyuncu! \n2. Oyuncu puan: " + ikinciOyuncuPuan + "\n1. oyuncu puan: "
                            + birinciOyuncuPuan + "\n***TEBR�KLER 2. OYUNCU***");
                }
            }
            if (!(elSay�s� % 2 == 0)) {
                System.out.println("2. Oyuncu'nun girdi�i kelimeyi kabul ediyor musunuz? 'EVET' ya da 'HAYIR' ");
                kelimeKabul = scan.next().toUpperCase().charAt(0);
                if (kelimeKabul == 'E') {
                    ikinciOyuncuPuan += kelime.length();
                    System.out.println("Oyuna devam etmek istiyor musunuz? 'EVET' ya da 'HAYIR'");
                    oyunaDevam = scan.next().toUpperCase().charAt(0);
                    if (oyunaDevam == 'E') {
                    } else {
                        birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;
                        if (birinciOyuncuPuan > ikinciOyuncuPuan) {
                            System.out.println("Oyunu kazanan 1. oyuncu: \n1. oyuncu puan: " + birinciOyuncuPuan
                                    + "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBR�KLER 1. OYUNCU***");
                        } else {
                            System.out.println("Oyunu kazanan 2. oyuncu: \n2. oyuncu puan: " + ikinciOyuncuPuan
                                    + "\n1. oyuncu puan: " + birinciOyuncuPuan + "\n***TEBR�KLER 2. OYUNCU***");
                        }
                    }
                } else {
                    birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;
                    if (birinciOyuncuPuan > ikinciOyuncuPuan) {
                        System.out.println("Oyunu kazanan 1. oyuncu: \n1. oyuncu puan: " + birinciOyuncuPuan
                                + "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBR�KLER 1. OYUNCU***");
                    } else {
                        System.out.println("Oyunu kazanan 2. oyuncu: \n2. oyuncu puan: " + ikinciOyuncuPuan
                                + "\n1. oyuncu puan: " + birinciOyuncuPuan + "\n***TEBR�KLER 2. OYUNCU***");
                    }
                }
            } else {
                oyunaDevam = 'H';
            }
        } while (kelimeKabul == 'E' && oyunaDevam == 'E');


	}

}
