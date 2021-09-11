package genel01odevler;

import java.util.Scanner;

public class S157_DoWhileLoop06 {

	public static void main(String[] args) {
		
		// Kullanicidan toplamak icin sayi isteyin 
		// ve toplam 500’e ulasincaya kadar devam istemeyi ettirin.
		// Toplam 500’e ulastiginda veya gectiginde toplami ve
		// kac sayi girildigini yazdirin

		   
		   double sayi=0;
	       int count=0;
	       double sayilarToplami=0;
	       
	       Scanner scan = new Scanner(System.in);
	       
	      do  {
	           System.out.println("Lutfen toplamak icin pozitif sayi girin");
	           
	          sayi=scan.nextDouble();
	          
	           
	           if (sayi>=0) {
	        	   
	               sayilarToplami+=sayi;
	               count++;
	               
	   
	           }  
	           
	      }  while(sayilarToplami <=500);
	      System.out.println("girdiginiz sayilarýn toplamý" + sayilarToplami  + "\nve sayý adedi : " + count);
	        	   
      
	   }
	}
	
	
