package yaz2021_GenelTekrar;

import java.util.Scanner;
import java.util.Arrays;


public class C82 {

	public static void main(String[] args) {
		
		/*
        Problem Tanýmý:
	    addDigits isminde bir method oluþturun.
	    Parametresi int
	    Return tipi de int
	    Pozitif int deðerler ver ve en son sonuç tek basamaklý 
	    çýkana kadar basamaklarý birbiriyle topla.
	    Tek basamaklý çýktýðýnda, döndürün
	    Örnek1:
	    Girdi 38
	    Çýktý: 2
	    Açýklama: Ýþlemler þöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
	                 2 , tek basamaklý olduðundan, bunu döndürün.
	    */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayý giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println(addDigits(sayi));
      
      
}
public static int toplama(int sayi) {
String str=String.valueOf(sayi);
String  arr[]=str.split("");

System.out.println(Arrays.toString(arr));
int toplama=0;
for (int i = 0; i < arr.length; i++) {
   toplama += Integer.parseInt(arr[i]);
}

return toplama;

}

public static int addDigits(int sayi) {
for (int i = 0; i < 2; i++) {
	
	sayi=toplama(sayi);
	
	/* ya da
	 * if (sayi>10) {
	for (int j = 0; j < 1; j++) {
		sayi=toplama(sayi);
		
	}
	
	if (sayi<10) {
		break;
		
	} 
	*/
	}

return sayi;


}
}
	

