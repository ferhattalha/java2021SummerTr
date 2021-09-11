package day08_TernaryOperator;

import java.util.Scanner;

public class C4_Ternary02 {

	public static void main(String[] args) {
		
Scanner scan =new Scanner(System.in);
           
System.out.print("Lütfen iki sayý giriniz");
	
 double sayi1=scan.nextDouble();
 double sayi2=scan.nextDouble();
 
 System.out.println(sayi1>sayi2 ? sayi2 : sayi1 );
    
 scan.close();
 
	}
	
}
