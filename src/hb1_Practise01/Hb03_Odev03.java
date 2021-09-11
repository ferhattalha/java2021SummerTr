package hb1_Practise01;

import java.util.Scanner;

public class Hb03_Odev03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Birinci oyuncu : Lütfen bir kelime giriniz : ");
		
		Boolean kelime=scan.hasNext();
		
		System.out.println(kelime); 
	
		int oyuncu1=0;
		int oyuncu2=0;
		int puan=0;
		 
		if (kelime==true) {
			  System.out.println("You pressed OK!");
			  
			  
			} 
		
		if(kelime==false){
			  System.out.println("Geçersiz kelime");
			  
			  
			}
		
	}	

}
