package day15_forLoop;

import java.util.Scanner;

public class C04_ForLoop03 {

	public static void main(String[] args) {
		
		// Soru 4) Kullanicidan 100�den kucuk bir tamsayi isteyin.
		// 1�den baslayarak girilen sayiya kadar 
		// 3�un kati olan sayilari yazdirin.
		
		Scanner scan=new Scanner(System.in);
	       
        System.out.print("L�tfen 100'den k�c�k bir tam say� giriniz");
      
        int say� = scan.nextInt();
		
		for(int i=1; i <say� ; i++) {
         
        if (i%3==0) {
        	System.out.print(i+" ");
        }
			
        scan.close();
		}
	}

}
