package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase1 {

	public static void main(String[] args) {
		
		//Kullanicidan haftanin kacinci gunu oldugunu sorun
        //ve gun ismini yazdirin
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("Haftan�n kac�nc� g�n�nde oldugumuzu giriniz : ");
		
        int gunNo=scan.nextInt();
        
        switch (gunNo) {
        
        case 1 :
        	System.out.println("Bug�n pazartesi");
        	break;
        case 2 :
        	System.out.println("Bug�n sal�");	
        	break;
        case 3 :
        	System.out.println("Bug�n carsamba");
        	break;
        case 4 :
        	System.out.println("Bug�n persembe");
        	break;
        case 5 :
        	System.out.println("Bug�n cuma");
        	break;
        case 6 :
        	System.out.println("Bug�n cumartesi");
        	break;
        case 7 :
        	System.out.println("Bug�n pazar");
        	break;
        	default:
        		System.out.println("L�tfen gecerli gun numaras� giriniz");
        }
		
        scan.close();
	}

}
