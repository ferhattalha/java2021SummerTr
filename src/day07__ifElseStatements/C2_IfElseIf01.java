package day07__ifElseStatements;

import java.util.Scanner;

public class C2_IfElseIf01 {

	public static void main(String[] args) {
	
		 // Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
         // dikdortgenin kare olup olmadigini yazdirin
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Lutfen dikdortgenin kenarlarini giriniz");
        
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        
        if (kenar1==kenar2) {
            System.out.println("Girdiginiz dikdortgen karedir");
            
        } else  {
         
            System.out.println("Girdiginiz dikdortgen kare degildir");
        }
       
        scan.close();
	}
}
