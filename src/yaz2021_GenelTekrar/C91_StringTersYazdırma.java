package yaz2021_GenelTekrar;

import java.util.Arrays;

public class C91_StringTersYazd�rma {

	public static void main(String[] args) {
		
        
		String str="Coding is greate.";
        
        
        String harfler[]=new String[str.length()];
        
        for (int i = 0; i < harfler.length; i++) {     //stringdeki harfleri ters cevirip array e atad�m 
            
            harfler[i]=str.substring(str.length()-1-i, str.length()-i);
            
        }
        System.out.println(Arrays.toString(harfler));  //arrayi yazd�rd�m g�rmek i�in
        System.out.println();                          //bo� sat�r
        
        for (int i = 0; i < harfler.length; i++) {  //arraydki elemanlar� tek tek yazd�r�p, array formundan c�kard�m
            System.out.print(harfler[i]);
        }

	}

}
