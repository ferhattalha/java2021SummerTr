package hb1_Practise01;

import java.util.Scanner;

public class Hb_08 {

	public static void main(String[] args) {
	   
	    /*  Problem Tan�m�
	        Kullan�c�dan �� adet say� alarak bu say�lar�n
	        bir dik ��genin kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
	        (ipucu: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor
	        ba�lant�s�ndan yararlanabilirsiniz)
	        �rnek Ekran ��kt�s�
	        birinci kenar� giriniz: 2
	        ikinci kenar� giriniz 15
	        ���nc� kenar� giriniz: 7
	        Bu bir dik ��gen de�ildir.
	        Bu bir dik ��gendir
	     */
	Scanner scan  =new Scanner(System.in);
	System.out.println("a kenar�n� giriniz : ");
	int a=scan.nextInt();
	System.out.println("b kenar�n� giriniz : ");
	int b=scan.nextInt();
	System.out.println("c kenar�n� giriniz : ");
	int c=scan.nextInt();
	
	if ((a*a)+(b*b)== c*c) {//c kenar�n�n hipotenus di�erlerinin dik kenar oldu�u durum
	    System.out.println("girdiginiz kenarlar bir dik ucgen olusturur...");
	    
	}else if ((a*a)+(c*c)== b*b) {//bkenar�n�n hipotenus di�erlerinin dik kenar oldu�u durum
	    System.out.println("girdiginiz kenarlar bir dik ucgen olusturur...");
	    
	}else if ((b*b)+(c*c)== a*a) {//a kenar�n�n hipotenus di�erlerinin dik kenar oldu�u durum
	    System.out.println("girdiginiz kenarlar bir dik ucgen olusturur...");
	}else System.out.println("girdi�iniz kenarlar dik ��gen olusturmaz");
	
	scan.close();
	
	    }
	}
