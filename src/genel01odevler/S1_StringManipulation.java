package genel01odevler;

import java.util.Scanner;

public class S1_StringManipulation {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		cumle.indexOf("Java");  // cumlede java vara index d�necek yoksa -1
		
		if (cumle.indexOf("Java")==-1) {
			
			System.out.println("daha cok �al��mam laz�m");
			
		} else {
		  System.out.println("Aferin");
		}
		
		scan.close();
	}

}
