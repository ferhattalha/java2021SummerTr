package hb3_Practise03;

import java.util.Scanner;

public class H01_Amstrong {

	public static void main(String[] args) {
		
		 // kullanýcýdan alýnan bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        
                
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz : ");
        int sayi =scan.nextInt();
        int ilkdeger=sayi;//ildeger atanmaz ise sayi degeri while þlemden sonra deðiserek 0 oluyor.
       int rakam;
        int kuplerToplami=0;
        
        while (sayi!=0) {
            rakam=sayi%10;
            sayi/=10;
            kuplerToplami+=rakam*rakam*rakam;
        }
        if (kuplerToplami==ilkdeger) {System.out.println("gayet baþarýlý girdidiniz sayi amstrong sayidir :)");
            
        } else System.out.println("maalesef giridiginiz sayi amstrong sayi degildir :( ");
    }

	}


