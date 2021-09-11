package yaz2021_GenelTekrar;

import java.util.Scanner;

public class Y2021_ForLoop02 {

	public static void main(String[] args) {

		// Soru:1 Ekrana 10 kez "Java güzeldir" yazdýrýn

		for (int i = 1; i <= 10; i++) {

			System.out.println("Java güzeldir");
		}

		// Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
		// 1’den baslayarak girilen sayiya kadar
		// 3’un kati olan sayilari yazdirin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen 100'den kücük bir tamsayý giriniz : ");
		
        int sayý = scan.nextInt();
		
		for(int i=1; i <sayý ; i++) {
         
        if (i%3==0) {
        	System.out.print(i+" ");
        	
        	scan.close();
			}
			
		}
		
	         	//Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin.
				//1’den baslayarak girilen sayiya kadar 
				//3’un veya 5”in kati olan sayilari yazdirin.
	
        Scanner scann=new Scanner(System.in);
		
		System.out.println("\n Lütfen 100'den kücük bir tamsayý giriniz : ");
		
        int sayý1 = scan.nextInt();

		for(int i=1; i <sayý1; i++ ) {
			
			if(i%3==0 || i%5==0) {
				
				System.out.print(i+" ");
				
			scan.close();	
				
			}
		}
        
        
		}
	
	}


