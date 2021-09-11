package hb2_Practise02;

import java.util.Scanner;

public class C11_Odev11 {

	public static void main(String[] args) {
		/*
		
     1
     2  3
     4  5  6
     7  8  9  10
     11 12 13 14 15
     16 17 18 19 20 21
     22 23 24 25 26 27 28
     29 30 31 32 33 34 35 36

         */
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Lütfen satýr sayýsýný giriniz: ");
		int sayi=scan.nextInt();
	
		int a=1;
		for (int i=1;i<=sayi;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		scan.close();
		
	}

}
