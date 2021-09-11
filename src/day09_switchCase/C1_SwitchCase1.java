package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase1 {

	public static void main(String[] args) {
		
		//Kullanicidan haftanin kacinci gunu oldugunu sorun
        //ve gun ismini yazdirin
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("Haftanýn kacýncý gününde oldugumuzu giriniz : ");
		
        int gunNo=scan.nextInt();
        
        switch (gunNo) {
        
        case 1 :
        	System.out.println("Bugün pazartesi");
        	break;
        case 2 :
        	System.out.println("Bugün salý");	
        	break;
        case 3 :
        	System.out.println("Bugün carsamba");
        	break;
        case 4 :
        	System.out.println("Bugün persembe");
        	break;
        case 5 :
        	System.out.println("Bugün cuma");
        	break;
        case 6 :
        	System.out.println("Bugün cumartesi");
        	break;
        case 7 :
        	System.out.println("Bugün pazar");
        	break;
        	default:
        		System.out.println("Lütfen gecerli gun numarasý giriniz");
        }
		
        scan.close();
	}

}
