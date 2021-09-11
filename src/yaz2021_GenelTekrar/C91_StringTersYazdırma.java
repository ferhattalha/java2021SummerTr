package yaz2021_GenelTekrar;

import java.util.Arrays;

public class C91_StringTersYazdýrma {

	public static void main(String[] args) {
		
        
		String str="Coding is greate.";
        
        
        String harfler[]=new String[str.length()];
        
        for (int i = 0; i < harfler.length; i++) {     //stringdeki harfleri ters cevirip array e atadým 
            
            harfler[i]=str.substring(str.length()-1-i, str.length()-i);
            
        }
        System.out.println(Arrays.toString(harfler));  //arrayi yazdýrdým görmek için
        System.out.println();                          //boþ satýr
        
        for (int i = 0; i < harfler.length; i++) {  //arraydki elemanlarý tek tek yazdýrýp, array formundan cýkardým
            System.out.print(harfler[i]);
        }

	}

}
