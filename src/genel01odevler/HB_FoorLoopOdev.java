package genel01odevler;

import java.util.Scanner;

public class HB_FoorLoopOdev {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("L�tfen �r�n adedi giriniz : ");
		
		int adet=scan.nextInt();
        
        System.out.println("L�tfen liste fiyat� giriniz ");
        
        
        int f�yat=scan.nextInt();
        
          System.out.print("M��teri kart�na sahipseniz ekrana 1 degileseniz 0 rakam�n� giriniz ");
      
        int kart=scan.nextInt();
       
        
	   indirim(adet,f�yat,kart);  
	   f�yat+=indirim(adet,f�yat,kart);
	   
	   System.out.println(f�yat);
	   
	   scan.close();
	}
	
	private static int indirim(int adet, int f�yat,int kart) {
     
		int bonus=0;
		
    	if(kart==1) {
		
		 if (adet>10) {
        		bonus = adet * 20 / 100;	
        	} else  {
        		bonus = adet * 15 / 100;  		
        
        	}
	
		 if(kart==0) {
				
			 if (adet>10) {
	        		bonus = adet * 20 / 100;	
	        	} else  {
	        		bonus = adet * 15 / 100;  		
	        	
      		
        	}
			
      		
        	}
		
     
        }
		return bonus;
}
}
	
	
	



