package hb1_Practise01;

import java.util.Scanner;

public class Hb_05 {

	public static void main(String[] args) {
		
		/*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *  
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan =new Scanner(System.in);
        
        System.out.print("5 basamakl� bir sayi giriniz : ");
        
        int sayi=scan.nextInt();
        
        int ilkIkiSayi=sayi/1000;//12 
        
        int sonIkiSayi=sayi%100;//45 
        
        
        int ilkIkiSayiTop=ilkIkiSayi/10+ilkIkiSayi%10;//12 /10 b�l�m�nden 1 ve 12 nin %10 kalan 2 elde edildi.-->1+2=3
        
        int sonIkiSayiTop=sonIkiSayi/10+sonIkiSayi%10; //45 / 10b�l�m�nden elde edilen b�l�m=4 45 %10 10  b�l�m�nden kalan 5 elde edilir--> 4+5=9
    
        System.out.println("5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini : "+(ilkIkiSayiTop+sonIkiSayiTop));

     scan.close();
	}

}
