package hb_Pracitise04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HB03 {

	public static void main(String[] args) {
//      2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlarý bir
//      listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.
//      Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
//         Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
        String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
/*
"Ali", "Veli", "Ayse"  -->0. kat
"Hasan", "Can"        -->1.kat
"Suzan"               -->.kat
 */
        
        yeniListe(isim);
    }
    public static void yeniListe(String[][] isim) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i < isim.length; i++) {
            for (int j = 0; j < isim[i].length; j++) {
                list.add(isim[i][j]);
            }
            
        }
        System.out.println("siralama oncesi : "+list);
        Collections.sort(list);
        System.out.println("siralama sonrasi : "+list);
    }


	}


