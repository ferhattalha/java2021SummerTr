package hb2_Practise02;

import java.util.Scanner;

public class C08_Odev08 {

	public static void main(String[] args) {
		
		/*  Problem Tan�m�
        Girilen bir say� kadar sat�r ve s�t�nu olan ve
        sa� kenara dayal� ��geni basan kodu yaz�n�z.
        Ekran ��kt�s�
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */	
		
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam say� giriniz : ");
        int sayi = scan.nextInt();
        for (int baba = 1; baba <=sayi; baba++) {
           for (int bosluk = sayi-baba; bosluk >=0; bosluk--) {
             System.out.print(" ");
            
        } for (int yildiz = 1; yildiz <=baba; yildiz++) {
             
            System.out.print("*");
        }
           
           
           
           System.out.println();
        scan.close();
    }
       
    }
}
