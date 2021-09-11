package day07__ifElseStatements;

import java.util.Scanner;

public class C11_IfElse04 {

	public static void main(String[] args) {
		
	
		// Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		//eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
		//Diger durumlarda ekrana “Eskenar degil” yazdirin.
		
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("Lütfen ucgenin bir kenar uzunluklarýný giriniz");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		int kenar3=scan.nextInt();
		
		 if ((kenar1==kenar2)  &&  (kenar2==kenar3)) {
			
			System.out.println("Eskenar üçgen");	
		} else {
			System.out.println("Eskenar deðil");	

		}
		 
	scan.close();
	
	
	}

}
