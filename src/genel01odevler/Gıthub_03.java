package genel01odevler;

import java.util.Scanner;

public class Gýthub_03 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		
		
		int num1,num2,toplama,carpma,cýkarma,bolme;
		System.out.println("Lütfen birinci sayýyý giriniz");
		num1= scan.nextInt();
		
		System.out.println("Lütfen ikinci sayýyý giriniz");
		num2= scan.nextInt();
		
		toplama = num1+num2;
		carpma =num1 *num2;
		cýkarma = num1-num2;
		bolme = num1/num2;
		
		
		System.out.println(toplama + "\n"  +  carpma  +  "\n"   + cýkarma+  "\n"  +  bolme);
		
		scan.close();
	}

}
