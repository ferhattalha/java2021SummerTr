package yaz2021_GenelTekrar;

import java.util.Scanner;

public class Y2021_ForLoop02 {

	public static void main(String[] args) {

		// Soru:1 Ekrana 10 kez "Java g�zeldir" yazd�r�n

		for (int i = 1; i <= 10; i++) {

			System.out.println("Java g�zeldir");
		}

		// Soru 4) Kullanicidan 100�den kucuk bir tamsayi isteyin.
		// 1�den baslayarak girilen sayiya kadar
		// 3�un kati olan sayilari yazdirin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen 100'den k�c�k bir tamsay� giriniz : ");
		
        int say� = scan.nextInt();
		
		for(int i=1; i <say� ; i++) {
         
        if (i%3==0) {
        	System.out.print(i+" ");
        	
        	scan.close();
			}
			
		}
		
	         	//Soru 5) Kullanicidan 100�den kucuk bir tamsayi isteyin.
				//1�den baslayarak girilen sayiya kadar 
				//3�un veya 5�in kati olan sayilari yazdirin.
	
        Scanner scann=new Scanner(System.in);
		
		System.out.println("\n L�tfen 100'den k�c�k bir tamsay� giriniz : ");
		
        int say�1 = scan.nextInt();

		for(int i=1; i <say�1; i++ ) {
			
			if(i%3==0 || i%5==0) {
				
				System.out.print(i+" ");
				
			scan.close();	
				
			}
		}
        
        
		}
	
	}


