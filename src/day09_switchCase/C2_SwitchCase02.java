package day09_switchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("L�tfen bir tamsay� giriniz : ");
		
        int sayi=scan.nextInt();
       
        switch (sayi) {
	
     case 10 :
    	System.out.println("�ki basamakl� en k�c�k say�");
    	break;
    case 100 :
    	System.out.println("uc basamakl� en k�c�k say�");	
    	break;
    case 1000 :
    	System.out.println("dort basamakl� en k�c�k say�");
    	break;

    	default:
    	System.out.println("Girdiginiz say�y� degistir");
    	
        }
        
        scan.close();

	}

}
