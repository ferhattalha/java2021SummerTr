package hb3_Practise03;

import java.util.Arrays;

public class H13 {

	public static void main(String[] args) {
		// multidimensional arrayin i� array lerindeki t�m elemanlar�n toplam�n� birer
        // birer bulan
        // ve herbir sonucu yeni bir arrayin eleman� yapan ve yeni array i ekrana
        // yazd�ran program� yaziniz.
        // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
        /*
         * 0. kat-->10,20,30
         * 1. kat-->4
         * 2. kat-->6,7,20
         */
        
        int apt[][] = { { 1, 20, 30 }, { 4 ,13}, { 6, -7, 20 } };
        
        int sonuc[] = new int[apt.length];
        
        for (int kat = 0; kat < apt.length; kat++) {//katlara  girme donfudsu
            
            for (int daire = 0; daire < apt[kat].length; daire++) {//dairelere girme dongusu
                sonuc[kat]+=apt[kat][daire];
            }
            
        }
        System.out.println(Arrays.toString(sonuc));
    }


	}


