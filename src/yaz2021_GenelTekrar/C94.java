package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C94 {

	public static void main(String[] args) {
		
		/*Kullan�c�dan dakika girmesini isteyin, Dakikalar� birka� y�l ve g�n say�s�na d�n��t�rmek i�in bir Java program� yaz�n.

		INPUT:

		Dakika say�s�: 3456789

		OUTPUT :

		3456789 dakika yakla��k 6 y�l 210 g�nd�r*/

		 Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen dakika giriniz");
	        long dakika=scan.nextLong();

	        long yil= dakika/525600;
	        long kalan= dakika%525600;
	        long g�n= kalan/1440;
	        
	        System.out.println(dakika +" dakika yakla��k " +yil + " y�l " +g�n+ " g�nd�r");
	        
	        
	        
	        scan.close();
	
	}

}
