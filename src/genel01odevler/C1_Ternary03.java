package genel01odevler;

import java.util.Scanner;

public class C1_Ternary03 {

	public static void main(String[] args) {
		
		/* 
		  Ternary ve if ile yap
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */

		
        Scanner scan =new Scanner(System.in);
        
		System.out.println("L�tfen bir say� giriniz");
		
		int say�=scan.nextInt();
		
		System.out.println(say�<=0 && say�<10  ? "Rakam"  :  "Pozitif sayi");
		
		System.out.println(say�<0  ? "Negatif say�"  :  "Pozitif sayi");
		
		
		scan.close();
	}
	

}
