package genel01odevler;

import java.util.Scanner;

public class C1_Ternary01 {

	public static void main(String[] args) {
		
		/*
        Kullanicidan bir character girmesini isteyiniz
     Character harf ise kucuk harf olup olmadigini kontrol ediniz
     Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
     Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
     Harf degilse ekrana "Harf degil" yazdiriniz
     97:a  122:z ascii de�eri
      
     */

	Scanner scan=new Scanner(System.in);
	
	
	System.out.println("L�tfen bir karakter giriniz");
	char karakter=scan.next().charAt(0);
	
	if (karakter>='a' && karakter<='z') {
		
		System.out.println("Girilen karakter k���k harf");
	} else if (karakter>='A' && karakter <='Z') {
		System.out.println("Girilen karakter b�y�k harf");
	} else {
		System.out.println("Girilen karakter harf degil");
	}
	 
	scan.close();
	}
	
	
}


