package genel01odevler;

import java.util.Scanner;

public class S78_10SoruDiger {

	public static void main(String[] args) {
		
		//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
				//Kural 1: 4 ile bolunemeyen yillar artik yil de�ildir
				//Kural 2: 4�un kati olmasina ragmen 100 ile bolunebilen yillardan 
				//sadece 400�un kati olan yillar artik yildir
				
				Scanner scan=new Scanner(System.in);
				
				
				System.out.println("L�tfen istediginiz y�l� giriniz");
				
		int yil = 2016;
        boolean artik = false;
 
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;
 
        if(artik)
            System.out.println(yil + " art�k y�ld�r.");
        else
            System.out.println(yil + " art�k y�l de�ildir.");
        
          scan.close();
        
         } 
      
     
	}


