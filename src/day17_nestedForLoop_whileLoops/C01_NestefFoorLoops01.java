
package day17_nestedForLoop_whileLoops;

import java.util.Scanner;

public class C01_NestefFoorLoops01 {

	public static void main(String[] args) {
		
		/* Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin 
		 * ve girilen rakama gore asagidaki sekli cizdirin
		 
		 
		 
	 *
	 * *
	 * * *
	 * * * *
	
      */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen bir rakam giriniz");
		
		int rakam=scan.nextInt();
		
		// mesela kullan�c� 5 girmis olsun
		
		for(int sat�rNo=1;sat�rNo <=rakam; sat�rNo++) {
		
			for(int i=1; i<=sat�rNo ; i++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println("");
		}
		
		scan.close();
		
		
	}

}
