package day07__ifElseStatements;

import java.util.Scanner;

public class C4_IfElse03 {
   
    // Soru 3) Kullaniciya yasini sorun, 
    // eger yas 65�e esit veya kucuk ise �emekli olamazsin, calismalisin�, 
    // 65�den buyukse �Emekli olabilirsin� yazdirin
	
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);	
   
	System.out.println("L�tfen yas�n�z� giriniz");
		
    int yas=scan.nextInt();
   
    if (yas<=65) {
    	
    	System.out.println("Emekli olamazs�n, �al��al�s�n");
    		
	} else {
		System.out.println("Emekli olabilirsin");
			
	}
	
    scan.close();
    
	}

}
