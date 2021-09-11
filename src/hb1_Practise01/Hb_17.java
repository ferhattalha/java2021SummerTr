package hb1_Practise01;

import java.util.Scanner;

public class Hb_17 {

	public static void main(String[] args) {
		
		// Girilen bir ay numarasýna göre , ayýn kaç gün olduðunu sayý ile yazdýrýnýz

		
		Scanner scan = new Scanner(System.in);
        System.out.print("Yýlýn kacýncý ayýnda oldugunuzu giriniz : ");
        int ay=scan.nextInt();
        
       switch (ay) {
       case 1 :
       case 3 :  
       case 5 :  
       case 7 : 
       case 8 :
       case 10 :
       case 12 :
    	   System.out.println("Girdiðiniz ay 31 cekiyor");
    	   break;
    	   
       case 4 :
       case 6 :
       case 9 :
       case 11 :
    	   System.out.println("girdiginiz ay 30 gün cekiyor");
       case 2 :
    	   System.out.println("yýlýnýzý giriniz : ");
    	   int yýl=scan.nextInt();
    	   
    	   if(yýl%4==0) {
    		   System.out.println("girdiginiz ay 29 gun cekiyor");
       } else {
    	   System.out.println("girdiginiz ay 28 gun cekiyor");
       }
         break;
         
       default:
    	   System.out.println("hatalý giris yaptýnýz");
    	   
       }
        
        
        
	}

}
