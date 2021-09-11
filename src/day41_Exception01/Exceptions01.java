package day41_Exception01;

import java.util.Scanner;

public class Exceptions01 {
	
	/* EXCEPT�ONS: 
	 * 1. �ki t�r exceptions vard�r. 
	 * 
	 * A. Compile Time (checked) Exceptions: Kod creat edilirken
	 * javan�n �ng�rd�g� olas� sorunlara kars� hatan�n alt�n�n cizilmesi
	 * Ama her alt� k�rm�z� �izili kod exceptions degildir.
	 * B. Run Time(Unchacked) Exceptions: Kod run edildiginde olusan hataya denir.
	 *
	 * 2. Kod creat edilirken Exception kullan�lmas� gerekirse :
	 * 
	 * a) Add thows declerations : Hata olustugunda konsol'a hata ile ilgili mesaj verir.
	 * b) try-catch blok : Hata olustugunda hata'n�n yazd�r�lmas� ve handle edilmesi saglan�r.
	 * 
	 * 3. try block'tan sonra en az bir tane catch blok olmal�.Aksi durumda CTE verir...!!!! 
	 * 
	 * 4. try-catch block'ta try body hatas�z cal���rsa catch bod cal�st�r�lamaz,catch body try body'deki exceptions'da cal���r.
	 * 
	 * 5. try body'den sonra 1'den fazla catch body creat edilebilir. Olusan exceptions hangi catch ile ilgili
	 * ise o catch body cal�s�r.
	 * 
	 */
	
	public static void main(String[] args) {
		
		//kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("bolunen sayiyi giriniz : ");
        int sayi1=scanner.nextInt();
        
        System.out.print("bolen sayiyi giriniz : ");
        int sayi2=scanner.nextInt();
        
        try {
            System.out.println("bolum : "+sayi1/sayi2);
            
        } catch (ArithmeticException e) {//try body'sinden muhtemel hata ArithmeticException olarak catch body'a sart olarak yazildi
        System.out.println("hatali giris yapt�n  bolen 0 olamaz");/*
                                                                    e: ArithmeticException class'indan data type
                                                                      ArithmeticException olan bir exception obj
                                                                        manual handle yaptik
                                                                    */
        
        }
            
        
            
        }
        
        
        
    }
    