package hb1_Practise01;

import java.util.Scanner;

public class Hb_08 {

	public static void main(String[] args) {
	   
	    /*  Problem Tanýmý
	        Kullanýcýdan üç adet sayý alarak bu sayýlarýn
	        bir dik üçgenin kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz
	        (ipucu: Bir üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor
	        baðlantýsýndan yararlanabilirsiniz)
	        Örnek Ekran Çýktýsý
	        birinci kenarý giriniz: 2
	        ikinci kenarý giriniz 15
	        üçüncü kenarý giriniz: 7
	        Bu bir dik üçgen deðildir.
	        Bu bir dik üçgendir
	     */
	Scanner scan  =new Scanner(System.in);
	System.out.println("a kenarýný giriniz : ");
	int a=scan.nextInt();
	System.out.println("b kenarýný giriniz : ");
	int b=scan.nextInt();
	System.out.println("c kenarýný giriniz : ");
	int c=scan.nextInt();
	
	if ((a*a)+(b*b)== c*c) {//c kenarýnýn hipotenus diðerlerinin dik kenar olduðu durum
	    System.out.println("girdiginiz kenarlar bir dik ucgen olusturur...");
	    
	}else if ((a*a)+(c*c)== b*b) {//bkenarýnýn hipotenus diðerlerinin dik kenar olduðu durum
	    System.out.println("girdiginiz kenarlar bir dik ucgen olusturur...");
	    
	}else if ((b*b)+(c*c)== a*a) {//a kenarýnýn hipotenus diðerlerinin dik kenar olduðu durum
	    System.out.println("girdiginiz kenarlar bir dik ucgen olusturur...");
	}else System.out.println("girdiðiniz kenarlar dik üçgen olusturmaz");
	
	scan.close();
	
	    }
	}
