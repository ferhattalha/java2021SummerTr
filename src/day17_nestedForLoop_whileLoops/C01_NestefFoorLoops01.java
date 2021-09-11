
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
		
		System.out.println("Lütfen bir rakam giriniz");
		
		int rakam=scan.nextInt();
		
		// mesela kullanýcý 5 girmis olsun
		
		for(int satýrNo=1;satýrNo <=rakam; satýrNo++) {
		
			for(int i=1; i<=satýrNo ; i++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println("");
		}
		
		scan.close();
		
		
	}

}
