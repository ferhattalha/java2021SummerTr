package genel01odevler;

import java.util.Scanner;

public class C1_Ternary02 {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir pozitif tamsay� girmesini isteyin, o pozitif tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
        // 3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
        // �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
    
		        
		        Scanner scan=new Scanner(System.in);
		       
		        System.out.print("Sayi giriniz : ");
		        int num = scan.nextInt();
		        System.out.println("*****  TERNARY ��z�m�  *****");
	
		        String result = (num > 99 && num < 1000) ? ("3 basamakli") : (num % 2 == 0 ? "3 basamakl� olmayan �ift say�" : "3 basamakl� olmayan tek say�");
		        System.out.println(result);

		        System.out.println("*****  if  ��z�m�  *****");
		      
		        if (num <1000 && num>99) {
		            System.out.println("3 basamakl�");
	
		        }else if (num % 2 == 0 ) {
		            System.out.println("3 basamakl� olmayan �ift say�");
	
		        }else System.out.println("3 basamakl� olmayan tek say�");
		
		        
		        //(�art) ? true:false
		        
		        scan.close();
		    }
		}
		

		
	


