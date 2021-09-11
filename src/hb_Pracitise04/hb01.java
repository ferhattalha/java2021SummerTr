package hb_Pracitise04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hb01 {

	public static void main(String[] args) {
		
		 /*
         * Input olarak verilen listteki isimlerden icinde ‘a’ harfi bulunanlari silen
         * bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} OUTPUT : [Veli,Omer]
         */
        List<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        List<String> yeniList = new ArrayList<>();
        for (String w : list1) {
            if (w.toLowerCase().contains("a")) {
                continue;
            }else {yeniList.add(w);
                
            }
            
        } System.out.println(yeniList);
    }


	}


