package genel01odevler;

import java.util.Scanner;

public class G�thub_03 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		
		
		int num1,num2,toplama,carpma,c�karma,bolme;
		System.out.println("L�tfen birinci say�y� giriniz");
		num1= scan.nextInt();
		
		System.out.println("L�tfen ikinci say�y� giriniz");
		num2= scan.nextInt();
		
		toplama = num1+num2;
		carpma =num1 *num2;
		c�karma = num1-num2;
		bolme = num1/num2;
		
		
		System.out.println(toplama + "\n"  +  carpma  +  "\n"   + c�karma+  "\n"  +  bolme);
		
		scan.close();
	}

}
