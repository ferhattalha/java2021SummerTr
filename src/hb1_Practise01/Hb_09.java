package hb1_Practise01;

import java.util.Scanner;

public class Hb_09 {

	public static void main(String[] args) {
		
		/*
         * Kullan�c�dan vize ve final notlar�n� al�n�z. Kullan�c�n istedi�i oranlarda
         * vize ve final y�zdeleri not ile not ortalamas�n� hesaplay�p not ortalamas�n�
         * yazd�r�p 50 ve b�y�k ise "Tebrikler dersi ba�ar� ile ge�tiniz..." k���k ise
         * "Malesef dersten kald�n�z..." yazd�r�n�z
         */
		
       Scanner scan = new Scanner(System.in);

		
		System.out.print("L�tfen vize1 notu giriniz : ");
		
		double vize1=scan.nextDouble();
		
		System.out.print("L�tfen vize2 notu giriniz : ");
		double vize2=scan.nextDouble();
		
		System.out.print("L�tfen f�nall notu giriniz : ");
		double f�nall=scan.nextDouble();
		
		
		double ortalama = ((vize1+vize2)/2*0.3)+(f�nall*0.7);
		
		
	
		if (ortalama>50) {
			
			System.out.print("Tebrikler dersi ba�ar� ile ge�tiniz...");
			
		} else  {
			System.out.print("Malesef dersten kald�n�z...");
		
		}
		
		scan.close();
		
	}


}
