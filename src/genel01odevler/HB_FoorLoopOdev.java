package genel01odevler;

import java.util.Scanner;

public class HB_FoorLoopOdev {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("Lütfen ürün adedi giriniz : ");
		
		int adet=scan.nextInt();
        
        System.out.println("Lütfen liste fiyatı giriniz ");
        
        
        int fıyat=scan.nextInt();
        
          System.out.print("Müşteri kartına sahipseniz ekrana 1 degileseniz 0 rakamını giriniz ");
      
        int kart=scan.nextInt();
       
        
	   indirim(adet,fıyat,kart);  
	   fıyat+=indirim(adet,fıyat,kart);
	   
	   System.out.println(fıyat);
	   
	   scan.close();
	}
	
	private static int indirim(int adet, int fıyat,int kart) {
     
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
	
	
	



