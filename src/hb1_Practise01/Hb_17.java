package hb1_Practise01;

import java.util.Scanner;

public class Hb_17 {

	public static void main(String[] args) {
		
		// Girilen bir ay numaras�na g�re , ay�n ka� g�n oldu�unu say� ile yazd�r�n�z

		
		Scanner scan = new Scanner(System.in);
        System.out.print("Y�l�n kac�nc� ay�nda oldugunuzu giriniz : ");
        int ay=scan.nextInt();
        
       switch (ay) {
       case 1 :
       case 3 :  
       case 5 :  
       case 7 : 
       case 8 :
       case 10 :
       case 12 :
    	   System.out.println("Girdi�iniz ay 31 cekiyor");
    	   break;
    	   
       case 4 :
       case 6 :
       case 9 :
       case 11 :
    	   System.out.println("girdiginiz ay 30 g�n cekiyor");
       case 2 :
    	   System.out.println("y�l�n�z� giriniz : ");
    	   int y�l=scan.nextInt();
    	   
    	   if(y�l%4==0) {
    		   System.out.println("girdiginiz ay 29 gun cekiyor");
       } else {
    	   System.out.println("girdiginiz ay 28 gun cekiyor");
       }
         break;
         
       default:
    	   System.out.println("hatal� giris yapt�n�z");
    	   
       }
        
        
        
	}

}
