package hb3_Practise03;

import java.util.Scanner;

public class H03_TabanUsHesap {

	public static void main(String[] args) {
		
		 // Kullanicidan 2 sayi aliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan bir kod yaziniz.
        // taban:3, us:2 --> 3^2 = 3*3 = 9
        // taban:2, us:5 --> 2^5= 2*2*2*2*2 = 32
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen taban ve uss giriniz : ");
        
        int taban=scan.nextInt();
        int uss=scan.nextInt();
        int sonuc=1;
        
        while (uss!=0) {
            sonuc*=taban;
            uss--;
        }
        
System.out.println("whilr cözümü :) giridiginiz tabanýn uss kuvveti : "+sonuc);
for (int i =1; i<uss; i++) {sonuc*=taban;}
System.out.println("for cözümü :) giridiginiz tabanýn uss kuvveti : "+sonuc);
    }



	}


