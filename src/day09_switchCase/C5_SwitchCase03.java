package day09_switchCase;

import java.util.Scanner;

public class C5_SwitchCase03 {

	public static void main(String[] args) {
		
	//	 Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("G�n ismi giriniz : ");
		
		String gun=scan.next().toLowerCase();
		
		
	
	switch(gun) {
    
    case "pazartesi" :
    case  "sali" :
    case  "carsamba" :
    case  "persembe" :
    case  "cuma" :
    	System.out.println("Bug�n hafta ici");
    	break;
    case "cumartesi" :
    case "pazar" :
    	System.out.println("Bug�n haftasonu");	
    	break;
    default:
		System.out.println("L�tfen gecerli gun  giriniz");
	}
	
	scan.close();
  }

}
